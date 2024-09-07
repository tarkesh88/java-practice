package com.example.java_practice.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomObjectsPractice {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        List<Product> products = new ArrayList<>();
        Product p1 = new Product(3,10,"fist");
        Product p2 = new Product(2,20,"wfist");
        Product p3 = new Product(1,30,"efist");
        products.add(p1);
        products.add(p2);
        products.add(p3);
        List<Product> result = products.stream().sorted(Comparator.comparing(Product::getId)).collect(Collectors.toList());
        for(Product p : result){
            System.out.println("id is -- "+p.getId()+" name is -- "+p.getName());
        }
        System.out.println("result -->"+result);
    }
}

class Product{
    int id;
    int qt;
    String name;
    Product(int id, int qt, String name) {
     this.id = id;
     this.qt = qt;
     this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public int getQt(){
        return this.qt;
    }

    public String getName(){
        return this.name;
    }
}
