package com.company;

public class Animal {
    final public String species;
    private Double weight;
    public String name;
    public Double File;

    public Animal(String species,Double weight,String name) {
        this.species = species;
        this.weight=weight;
        this.name=name;

    }

    public Animal(String species) {

        this.species = species;
    }


    void  feed(){
         weight +=1;
         System.out.println("thx for food,bro");
     }
}
