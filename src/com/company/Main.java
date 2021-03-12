package com.company;

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
    }
}



