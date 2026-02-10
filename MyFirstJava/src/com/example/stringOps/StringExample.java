package com.example.stringOps;

public class StringExample {
    public static void main(String[] args) {
        String name = "Dhoni";
        name = "Hello " + name;

        // StringBuilder works on single object and modifies it instead of creating
        // a new object after every change like String
        StringBuilder str = new StringBuilder(10);
        str.append("Mahendra Singh ");
        System.out.println(str);
        str.append("Dhoni", 0, 5);
        System.out.println(str);
        str.replace(0, 15, "MS ");
        System.out.println(str);
        System.out.println(str.reverse());

        // StringBuffer works on single object and modifies it instead of creating
        // a new object after every change like String
        // additionally this caches the value so it is more efficient
        StringBuffer strBuff = new StringBuffer(10);
        strBuff.append("King ");
        System.out.println(strBuff);
        strBuff.append("Kohli", 0, 5);
        System.out.println(strBuff);
        strBuff.replace(0, 5, "Virat ");
        System.out.println(strBuff);
        System.out.println(strBuff.reverse());
    }
}
