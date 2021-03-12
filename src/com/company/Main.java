package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // write your code here\
        Human me=new  Human();
        me.pet=new Animal("cat",3.2,"miluś");
        //Animal dog = new Animal("cat",3.2,"miluś");
        System.out.println(me.pet.name);
        System.out.println(me.pet.species);



        me.pet=new Animal("dog",1.0,"puszek");
        System.out.println(me.pet.name);
        System.out.println(me.pet.species);


        Animal dog = new Animal("dog", 2.0, "Liri");
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();

        me.car=new Car("Audi","A3");
        System.out.println(me.car.model);
        System.out.println(me.car.producer);
    }
}



