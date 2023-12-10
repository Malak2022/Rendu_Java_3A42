public class Test {

    public static void main(String[] args) {
        Etudiant3eme e1 = new Etudiant3eme(1, "Ben Med", "Malak", 16.3f, "Math");
        Etudiant3eme e2 = new Etudiant3eme(2, "Jomni", "Imen", 10.7f, "Economie");
        Etudiant3eme e3 = new Etudiant3eme(3, "Slim", "Ali", 12.5f, "Tech");
        Etudiant3eme e4 = new Etudiant3eme(4, "Bmz", "Wassel", 15.7f, "Info");
        EtudiantAlternance e5 = new EtudiantAlternance(9, "Ben Med", "Lotfi", 14.2f, 1700);
        EtudiantAlternance e6 = new EtudiantAlternance(12, "Jomni", "Rafika", 17.1f, 1000);
        Ecole ec = new Ecole("Acrobates");
        Ecole ec2 = new Ecole("Avicenne");

        try {
            ec.ajouterEtudiant(e1);
        } catch (EtudiantExisteException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            ec.ajouterEtudiant(e2);
        } catch (EtudiantExisteException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            ec.ajouterEtudiant(e3);
        } catch (EtudiantExisteException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            ec.ajouterEtudiant(e4);
        } catch (EtudiantExisteException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            ec.ajouterEtudiant(e5);
        } catch (EtudiantExisteException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            ec.ajouterEtudiant(e6);
        } catch (EtudiantExisteException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(ec);
        System.out.println("-------------------------------------------------");
        e3.ajouterUneAbsence();
        System.out.println(e3);
        System.out.println("-------------------------------------------------");
        e5.ajouterUneAbsence();
        System.out.println(e5);
        System.out.println("-------------------------------------------------");
        System.out.println("Moyenne 3A: " + ec.getMoyenne3A());
        System.out.println("Moyenne salaire Alternants: " + ec.moyenneSalaireAlternants());
        System.out.println("-------------------------------------------------");
        ec.changerEcole(e6, ec2);
        System.out.println(ec);
        System.out.println("-------------------------------------------------");
        System.out.println(ec2);

    }
}

