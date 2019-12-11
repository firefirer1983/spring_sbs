package com.springsbs;

public class Hello {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    void sayHi() {
        System.out.println(name);
    }

}
