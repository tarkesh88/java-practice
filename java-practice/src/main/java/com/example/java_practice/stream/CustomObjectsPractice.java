package com.example.java_practice.stream;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomObjectsPractice {
    public static void main(String[] args) {

    //sortAndGroupByProductId();
    getGroupByDate();

    }

    static void sortAndGroupByProductId() {
        List<Product> products = Arrays.asList(
                new Product(3,10,"fist"),
                new Product(2,20,"wfist"),
                new Product(1,30,"efist"),
                new Product(4,30,"efist"),
                new Product(5,10,"fist"));

        Map<String, Integer> productGroup = products.stream().collect(Collectors.groupingBy(Product::getName,Collectors.summingInt(Product::getQt)));
        for(Map.Entry<String, Integer> entry : productGroup.entrySet()) {
            System.out.println("Name "+entry.getKey() +" qt is "+entry.getValue());
        }

        List<Product> result = products.stream().sorted(Comparator.comparing(Product::getId)).collect(Collectors.toList());
        for(Product p : result){
            System.out.println("id is -- "+p.getId()+" name is -- "+p.getName());
        }
    }

    static void getGroupByDate(){
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );
        Map<String, Integer> numberTransaction = transactions.stream().collect(Collectors.groupingBy(Transaction::getDate,
                Collectors.summingInt(Transaction::getAmount)));
        for(Map.Entry<String, Integer> entry : numberTransaction.entrySet()) {
            System.out.println("key "+entry.getKey() +" value is "+entry.getValue());
        }
    }


}


class Transaction {
    String date;
    Integer amount;

    public Transaction(String date, Integer amount) {
        this.date = date;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}


class Product{
    int id;
    int qt;
    String name;

    public Product(int id, int qt, String name) {
        this.id = id;
        this.qt = qt;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
