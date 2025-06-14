package com.bmcl.refactoring.example4;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String phone;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

}
