import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        DepartementHashSet D = new DepartementHashSet();

        D.ajouterDepartement(new Departement(5, "A1", 25));
        D.ajouterDepartement(new Departement(2, "A2", 28));
        D.ajouterDepartement(new Departement(8, "A26", 32));
        D.displayDepartement();
        System.out.println(D.rechercherDepartement("J24"));
        System.out.println(D.trierDepartementById()); //It works fine
    }
}
