package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("lion");
        lion.setAge(5);
        lion.setFamily("Chats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("TuniPark", "Tunis");
        Zoo notMyZoo = new Zoo("Park", "Ariena");


        Animal dog = new Animal("Chien", "Fox", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog1 = new Animal("Chien", "Rex", 2, true);
        System.out.println(myZoo.searchAnimal(dog1));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog1);
        myZoo.displayAnimals();


        myZoo.setName("GreenPark");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);


    }

}
