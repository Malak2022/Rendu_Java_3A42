public class MainList {
    public static void main(String[] args) {
        SocieteArrayList S = new SocieteArrayList();
        Employe e1 = new Employe(15, 1, "aa", "Malak", "a");
        Employe e2 = new Employe(2, 2, "bb", "Malak", "b");
        Employe e3 = new Employe(38, 3, "cc", "Malak", "c");
        Employe e4 = new Employe(4, 4, "dd", "Malak", "d");

        S.ajouterEmploye(e4); //Add works
        S.ajouterEmploye(e2);
        S.ajouterEmploye(e1);
        S.ajouterEmploye(e3);
        System.out.println(S.rechercherEmploye(e1));
        S.displayEmploye();
        System.out.println("\n");
        S.supprimerEmploye(e1);
        S.displayEmploye();
        System.out.println(S.rechercherEmploye("hh"));
        System.out.println("\n");
        S.trierEmployeParId();
        S.displayEmploye();
        System.out.println("\n");
        S.trierEmployeParNomDepartementEtGrade();
        S.displayEmploye();
    }
}
