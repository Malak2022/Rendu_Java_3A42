package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args){

        Zoo myZoo = new Zoo("Zoo", "Tunis");
        Animal A1 = new Animal("Chien", "Fox", 3, true);
        Animal A2 = new Animal("Chat", "Momo", 5, true);
        Animal A3 = new Animal("Oiseau", "Ziwziw", 1, true);
        Animal A4 = new Animal("Lion", "Roi", 10, true);
        Aquatic P = new Penguin("Penguin", "Peggy", -5, false, "pole", 18f);

        try {
            myZoo.addAnimal(A1);
            myZoo.addAnimal(A2);
            myZoo.addAnimal(A3);
            myZoo.addAnimal(P); //This throws a Negative Age Exception
            myZoo.addAnimal(A4); //This throws a Full Zoo Exception
        }catch(InvalidAgeException | ZooFullException ex){
            System.err.println(ex.getMessage());
        }
    }
}