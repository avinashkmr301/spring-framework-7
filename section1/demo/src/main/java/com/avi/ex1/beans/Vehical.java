package com.avi.ex1.beans;

public class Vehical {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehical{" +
                "name='" + name + '\'' +
                '}';
    }
}
