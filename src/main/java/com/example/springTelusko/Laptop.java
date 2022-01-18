package com.example.springTelusko;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private int lid;
    private String name;

    public Laptop(int lid, String name) {
        this.lid = lid;
        this.name = name;
    }

    public int getLid() {
        return lid;
    }

    public String getName() {
        return name;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void compile(){
        System.out.println("Compiling");
    }
}
