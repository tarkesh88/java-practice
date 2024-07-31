package com.example.java_practice.string;

public class StringPoolUnderstanding {

    public static void main(String[] args) {
        String s3 = "Tarkesh";
        String s1 = new String("Tarkesh");
        String s2 = new String("Tarkesh");
        System.out.println("s1 is "+s1.hashCode());
        System.out.println("s2 is "+s2.hashCode());
        System.out.println("s1 == s2 "+(s1==s2));
        System.out.println("s1 == s3 "+(s1==s3));
        String s4 = new String("Tarkesh").intern();
        System.out.println("s3 == s4 "+(s3==s4));

    }
}
