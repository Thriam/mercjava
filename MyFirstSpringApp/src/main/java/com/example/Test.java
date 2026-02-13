package com.example;

import com.example.dependencyInjection.car.Merc;
import com.example.dependencyInjection.gadgets.Dell;
import com.example.dependencyInjection.gadgets.HP;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Merc m1 = context.getBean(Merc.class);
        m1.spec();

//        HP hp1 = context.getBean(HP.class);
//        hp1.spec();
//
//        Dell dell1 = context.getBean(Dell.class);
//        dell1.spec();

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("file:src/main/resources/beans.xml");
//        Movie m = context.getBean("Movie1", Movie.class);
//        System.out.println(m.getTitle());

//        context.getBean(Movie.class);
//        Movie m = new Movie();
//        Movie m1 = context.getBean("Movie1", Movie.class);
//        m1.setTitle("Troy");
//        System.out.println(m1.getTitle());
//
//        Movie m2 = context.getBean("Movie2", Movie.class);
//        m2.setTitle("Meet Joe Black");
//        System.out.println(m2.getTitle());
//
//        Car c1 = context.getBean("Car1", Car.class);
//        c1.setId(101);
//        System.out.println(c1.getId());
//        c1.setName("Benz S Class");
//        System.out.println(c1.getName());
//
//        Car c2 = context.getBean("Car2", Car.class);
//        c2.setId(102);
//        System.out.println(c2.getId());
//        c2.setName("Benz G Class");
//        System.out.println(c2.getName());
//
//        Fruit f1 = context.getBean("Fruit1", Fruit.class);
//        f1.setId(1001);
//        System.out.println(f1.getId());
//        f1.setPrice(100);
//        System.out.println(f1.getPrice());
//        f1.setName("Fruit1");
//        System.out.println(f1.getName());
//
//        Fruit f2 = context.getBean("Fruit2", Fruit.class);
//        f2.setId(1002);
//        System.out.println(f2.getId());
//        f2.setPrice(200);
//        System.out.println(f2.getPrice());
//        f2.setName("Fruit2");
//        System.out.println(f2.getName());
//
//        Theatre t1 = context.getBean("Theatre1", Theatre.class);
//        t1.setId(10001);
//        System.out.println(t1.getId());
//        t1.setName("Theatre1");
//        System.out.println(t1.getName());
//
//        Theatre t2 = context.getBean("Theatre2", Theatre.class);
//        t2.setId(10002);
//        System.out.println(t2.getId());
//        t2.setName("Theatre2");
//        System.out.println(t2.getName());
//
//        Book b1 = context.getBean(Book.class);
    }
}
