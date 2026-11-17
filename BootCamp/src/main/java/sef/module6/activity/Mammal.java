package sef.module6.activity;

public class Mammal {

    private Animal myAnimal;
    private String name;

    // TODO: Create constructor for Mammal with parameter name
    public Mammal(String name) {
        this.name = name;
    }
    public void setAnimal(Animal myAnimal) {
        this.myAnimal = myAnimal;
    }

       public void animalIsSleeping() {
        System.out.println("Animal with name: " + name + " is ...");
        myAnimal.sleep();
        // TODO: Write code so that Animal sleep implementation is used

    }

    public void animalIsSpeaking() {
        System.out.println("Animal with name: " + name + " is ...");
        myAnimal.animalSound();
        // TODO: Write code so that Animal animalSound implementation is used

    }
}