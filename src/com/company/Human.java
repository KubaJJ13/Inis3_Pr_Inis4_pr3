package com.company;

import java.util.Date;

public class Human {

    public final String FirstName;
    public String LastName;
    public Car auto;
    protected String phone;
    public Animal pet;
    public Car car;
    private double salary = 5042.32;

    public Human(String firstName) {
        FirstName = firstName;
    }



    public double getSalary() {
        System.out.println(new Date());




        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            System.out.println("Dane zostały wysłane dp systemu");
            System.out.println("Nalezy koniecznie odebrać aneks od umowu u kadrowej");
            System.out.println("ZUS już cie sciga");
            this.salary = salary;
        } else {
            System.out.println("Wynagrodzenie nie może być ujemne");
        }
    }
}