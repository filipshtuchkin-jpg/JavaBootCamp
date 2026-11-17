package sef.module6.activity;

public class AnimalActivity {

    public static void main(String arg[]) {

        Animal cat = new Cat();
        Animal dog = new Dog();

        // TODO: Use interfaces to declare identifiers instead of the actual classes (create Cat using interface Animal)
        // TODO: Create Dog using interface Animal


        Mammal mammal = new Mammal("Flexy");
mammal.setAnimal(cat);
        // TODO: For mammal set animal to cat
mammal.animalIsSleeping();
        // TODO: Execute for mammal animalIsSleeping()
        mammal.animalIsSpeaking();
        // TODO: Execute for mammal animalIsSpeaking()
mammal.setAnimal(dog);
        // TODO: For mammal set animal to dog
        mammal.animalIsSleeping();
        // TODO: Execute for mammal animalIsSleeping()
        mammal.animalIsSpeaking();
        // TODO: Execute for mammal animalIsSpeaking()

    }
}