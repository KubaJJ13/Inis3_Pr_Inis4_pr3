package com.company;

public class Main {

    public static void main(String[] args) {
       // write your code here\

       Animal dog = new Animal();
       dog.species = "dog";
       dog.name = "haiku";
       dog.weight = 8.0;
       dog.feed();

       Phone iPhone = new Phone();
       iPhone.screenSize = 4.5;
       iPhone.producer = "apple";
       iPhone.model = "6S";
       iPhone.operationSystem = "ios";

       Human me = new Human();
       me.FirstName = "Artur";
       me.LastName = "JJ";
       me.pet = dog;

       System.out.println("Zwierzak nazywa się: " + me.pet.name);
    }
}
