package com.example.controller;

import com.example.exceptions.ResourceNotFoundException;
import com.example.model.Laptop;
import com.example.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

    @Autowired
    private LaptopRepository lr;

    @PostMapping("/add")
    public ResponseEntity<Laptop> add(@RequestBody Laptop lp) {
        Laptop savedLaptop = lr.save(lp);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedLaptop);
    }

    @GetMapping("/list")
    public List<Laptop> list() {
        return lr.findAll();
    }

    @GetMapping("/findOne/{index}")
    public ResponseEntity<Laptop> findOne(@PathVariable int index) {
        Laptop lt = lr.findById(index)
                .orElseThrow(() -> new ResourceNotFoundException("Laptop not found with id: " + index));
        return ResponseEntity.ok(lt);
    }

    @PutMapping("/update/{index}")
    public ResponseEntity<Laptop> update(@PathVariable int index, @RequestBody Laptop newLaptop) {
        Laptop oldLaptop = lr.findById(index)
                .orElseThrow(() -> new ResourceNotFoundException("Laptop not found with id: " + index));

        oldLaptop.setName(newLaptop.getName());
        oldLaptop.setBrand(newLaptop.getBrand());
        oldLaptop.setPrice(newLaptop.getPrice());
        oldLaptop.setRAM(newLaptop.getRAM());

        Laptop updatedLaptop = lr.save(oldLaptop);
        return ResponseEntity.ok(updatedLaptop);
    }

    @DeleteMapping("/delete/{index}")
    public ResponseEntity<String> delete(@PathVariable int index) {
        try {
            lr.deleteById(index);
            return ResponseEntity.ok("Laptop deleted successfully with id: " + index);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("Laptop not found with id: " + index);
        }
    }

    @GetMapping("/findById")
    public ResponseEntity<Laptop> getById(@RequestParam("id") Integer id) {
        Laptop laptop = lr.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Laptop not found with id: " + id));
        return ResponseEntity.ok(laptop);
    }

    @GetMapping("/findByBrand/{brand}")
    public List<Laptop> findByBrandName(@PathVariable String brand) {
        return lr.findByBrand(brand);
    }
}
