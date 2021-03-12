package com.company;

public class Animal {
    final public  String species;
    private Double weight;
    public String name;
    public Double File;



    static final public double DEFAULT_ANIMAL_WEIGHT=2.0;

    public Animal(String species,Double weight,String name) {
        this.species = species;
        this.weight=weight;
        this.name=name;

    }

    public Animal(String species) {

        this.species = species;
        this.weight=DEFAULT_ANIMAL_WEIGHT;
    }


    void  feed(){
        weight +=1;
        System.out.println("thanks for food,bro");
        if(weight<=0){
            System.out.println("U can't feed death pet");


        }
        else{
            weight += 1;
            System.out.println("thanks for food,bro");
        }
    }
    void takeForAWalk(){

        if(weight>=1){
            weight-=1;
            System.out.println("Thanks for a walk");


        }
        else{
            System.out.println("we can't go for a walk my Man im death");
        }

    }
}




