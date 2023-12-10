import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class MainMap {
    public static void main(String[] args) {


        AffectationHashMap AHM = new AffectationHashMap();
        Employe e1 = new Employe(1, 5, "aa", "Malak", "a");
        Employe e2 = new Employe(2, 3, "bb", "Manar", "b");
        Employe e3 = new Employe(3, 4, "cc", "Wassel", "c");
        Departement d1 = new Departement(1, "J24", 18);
        Departement d2 = new Departement(2, "J25", 10);

        AHM.ajouterEmployeDepartement(e1, d1);
        AHM.ajouterEmployeDepartement(e2, d1);
        AHM.ajouterEmployeDepartement(e3, d2);
        AHM.afficherEmployesEtDepartements();

        AHM.supprimerEmploye(e2);
        AHM.afficherEmployes();
        AHM.afficherDepartments();
        System.out.println(AHM.rechercherEmploye(e2));
        System.out.println(AHM.rechercherDepartement(d1));
        System.out.println(AHM.trierMap());
        AHM.supprimerEmployeEtDepartement(e3, d2);
        AHM.afficherEmployesEtDepartements();
    }
}
