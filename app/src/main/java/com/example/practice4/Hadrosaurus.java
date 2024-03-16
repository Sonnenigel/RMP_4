package com.example.practice4;

public class Hadrosaurus {
    private String name;

    public Hadrosaurus(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return name;
    }
}
