package com.company;

public class Main {

    public static void main(String[] args) {
       // write your code here\

       Animal dog = new Animal("cat",3.2,"miluś");




       Human me = new Human();
       me.FirstName = "Artur";
       me.LastName = "JJ";
       me.pet = dog;

       System.out.println("Zwierzak nazywa się: " + me.pet.name);
    }
}
