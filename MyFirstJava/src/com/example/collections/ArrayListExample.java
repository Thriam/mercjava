package com.example.collections;

import com.example.core.Book;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList list1 = new ArrayList();
        List list1 = new ArrayList<>();
        list1.add("Thriam");  //String
        list1.add(13);  // Integer
        list1.add(true); // Boolean
        list1.add(12.55);  // Double
        System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Thriam");
        System.out.println(list2);
        list1.remove(1);
        System.out.println(list1);

        List<Book> bookList = new ArrayList<>();
        Book b2 = new Book(100, "Java", "James Gosling");
        bookList.add(b2);
        bookList.add(new Book(100, "Tell me your dreams", "Sidney Sheldon"));
        System.out.println(bookList.toString());
    }
}
