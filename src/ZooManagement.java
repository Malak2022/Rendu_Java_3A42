public class ZooManagement {

    public static void main(String[] args) {
        //PROSIT 2
        Animal lion = new Animal();
        lion.name = "lion";
        lion.age = 5;
        lion.family = "Chats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "MyPark";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 25;
        myZoo.animals = new Animal[25];


        Animal dog = new Animal("Chien", "Rex", 3, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog1 = new Animal("Chien", "Fox", 2, true);
        System.out.println(myZoo.searchAnimal(dog1));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

    }

}


