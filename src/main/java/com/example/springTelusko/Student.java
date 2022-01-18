package com.example.springTelusko;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Student {

    private int rollno;
    private String name;
    private Laptop l1;

    Student(){
        super();
        System.out.println("Constructor called");
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public Laptop getL1() {
        return l1;
    }

    public void setL1(Laptop l1) {
        this.l1 = l1;
    }

    public void show(){
        System.out.println("Hi");
        l1.compile();
    }
}
