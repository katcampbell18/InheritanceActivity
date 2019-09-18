package com.demo;

public class Main {
    public static void main(String[]args){

        Book b = new Book();
        b.setAuthor("Dave W.");
        b.setTitle("The Winds of Change");
        b.setPages(10);
        System.out.println(b.toString());

        Book b1 = new Book();
        b1.setAuthor("Dave W.");
        b1.setTitle("The Winds of Change");
        b1.setPages(10);
        System.out.println(b.toString());

        if(b == b1){
            System.out.println("Please check the selections again.");
        }else{
            System.out.println("You may proceed to checkout");
        }

        Software s = new Software();
        s.setProgrammer("Yolanda");
        s.setPlatform("Linux");
        s.setOs("Windows");
        System.out.println(s.toString());

        Software s1 = new Software();
        s1.setProgrammer("Nicole");
        s1.setPlatform("Linux");
        s1.setOs("Windows");
        System.out.println(s.toString());

        if(s == s1){
            System.out.println("The programmer is busy.");
        }else{
            System.out.println("The programmer likes to work alone");
        }

        Product p = new Product();
        p.setCode("36582");
        p.setDescription("a toy");
        p.setPrice(5.69);
        System.out.println(p.toString());

        Product p1 = new Product();
        p1.setCode("56894");
        p1.setDescription("snow cone maker");
        p1.setPrice(23.99);
        System.out.println(p1.toString());

        if(p == p1){
            System.out.println("Please check the product codes again.");
        }else{
            System.out.println("You may proceed to checkout");
        }
    }
}
