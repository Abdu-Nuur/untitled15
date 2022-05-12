package com.company;

public class Animal {
    public void animals() {

        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};

        for (int i = 0; i < 3; i++) {
            System.out.println(animals[i] instanceof Animal);
            System.out.println(animals[i].getClass());

            if (i==0) {
                Shark.attack();
                System.out.println();
            }else if (i==1){
                Turtle.swim();
                System.out.println();
            }else{
                Eagle.fly();
                System.out.println();
            }


        }
    }
}
