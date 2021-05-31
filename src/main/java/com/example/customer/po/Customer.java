package com.example.customer.po;

import org.hibernate.validator.constraints.Range;

public class Customer {    
    
    private String name;
    @Range(min=1, max=2)
    private long number;
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public long getNumber() {
        return number;
    }
    public void setNumber(long number) {
        this.number = number;
    }
    
    
}
