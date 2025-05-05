package com.example.scope;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Data
@Getter
@Setter
@ToString
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    public int id;
    private String name;
    public int salary;
    public transient String address;

    public Employee(int id, String name, int salary,String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public Employee() {
    }


}
