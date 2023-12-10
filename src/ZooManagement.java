public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name = "lion";
        lion.age = 8;
        lion.family = "Chats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo("TuniPark", "Tunis");
        Zoo notMyZoo = new Zoo("Park", "Ariana");


        Animal dog = new Animal("Chien", "Fox", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog1 = new Animal("Chien", "Rex", 2, true);
        System.out.println(myZoo.searchAnimal(dog1));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog1);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog1));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();



    }

}
