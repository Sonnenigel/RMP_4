package com.example.practice4;

public class Velociraptor {
    private String name;

    public Velociraptor(String name){
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
