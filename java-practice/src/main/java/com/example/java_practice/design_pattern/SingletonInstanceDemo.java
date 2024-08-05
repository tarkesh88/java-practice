package com.example.java_practice.design_pattern;

import java.lang.reflect.Constructor;

public class SingletonInstanceDemo {

    public static void main(String []arg){
        SingletonInstance instance = SingletonInstance.getInstance();
        /*
        try {
            SingletonInstance singleton2 = (SingletonInstance) instance.clone();
            System.out.println(instance == singleton2); // Outputs: false
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            System.out.println("exception == "+cloneNotSupportedException.getMessage());
        }*/

        SingletonInstance instanceTwo = null;
        try {
            Constructor constructor = SingletonInstance.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            instanceTwo = (SingletonInstance) constructor.newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Hashcode of Object 1: " + instance.hashCode());
        System.out.println("Hashcode of Object 2: " + instanceTwo.hashCode());
    }

}
