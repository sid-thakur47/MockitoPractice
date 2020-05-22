package com.bl.mockito;

public class Customer {

    private final String firstName;
    private final String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getName() {
        return firstName+" "+lastName;
    }
}
