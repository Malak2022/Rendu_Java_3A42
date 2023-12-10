package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args){


        Zoo myZoo = new Zoo("TuniZoo", "Tunis");
        Aquatic A = new Aquatic("Poisson", "Nemo", 5, true, "Ocean");
        Aquatic D = new Dolphin("Dauphins", "Dauphy", 10, true, "Ocean", 18.6f);
        Aquatic P1 = new Penguin("Penguin", "Peg", 2, true, "Pole", 13.4f);
        Aquatic P2 = new Penguin("Penguin", "Pegy", 5, false, "Pole", 7.4f);
        Aquatic P3 = new Penguin("Penguin", "Pegou", 8, false, "Pole", 8f);

        myZoo.addAquaticAnimal(A);
        myZoo.addAquaticAnimal(D);
        myZoo.addAquaticAnimal(P1);
        myZoo.addAquaticAnimal(P2);
        myZoo.addAquaticAnimal(P3);
        myZoo.instruction27();
        System.out.println(myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();
        System.out.println(P1.equals(P2));
        System.out.println(P1.equals(P3));
    }
}