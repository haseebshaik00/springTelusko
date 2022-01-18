package com.example.springTelusko;
import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
    private int lid;
    private String name;

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
