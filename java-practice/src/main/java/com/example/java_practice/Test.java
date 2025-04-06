package com.example.java_practice;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Student {
    public int id;
    public String name;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String toString() {
        return "Student: " + this.name + "@" + Integer.toHexString(hashCode());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /* HashSet<Student> studentList = new HashSet<>();

        Student st1 = new Student("Nimit", 1);
        Student st2 = new Student("Rahul", 3);
        Student st3 = new Student("Nimit", 1);
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);

        System.out.println(studentList.size());

        st1.id = 3;
        System.out.println(studentList.size());*/

}
public class Test {

    public static void main(String[] args) {
        List<String> arr = List.of( "check",  "testt", "ccceetete", "ioooooooooo" ,"check");
        String result = arr.stream().max(Comparator.comparingInt(String::length)).get();

        System.out.println("max length string result is "+result);
        Map<String, Long> result12 = arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        result12.forEach((k,v)->{
            System.out.println("string "+k +" length count "+v);
        });

        List<Student> studentList = new ArrayList<>();
        Student st1 = new Student("Nimit", 1);
        Student st2 = new Student("Rahul", 3);
        Student st3 = new Student("Nimit", 1);
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);

        Map<String, Integer> result1 =studentList.stream().collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getId)));
        result1.forEach((k,v)->{
            System.out.println("name "+k +" values "+v);
        });

    }
}



