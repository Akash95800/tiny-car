public class exo51 {
    String nom;
    double prixHT;

    // Constructeur
    public Accessoire(String nom, double prixHT) {
        this.nom = nom;
        this.prixHT = prixHT;
    }

    // Nouvelle procédure
    public static void afficherDescription(String nom, double prixHT) {
        System.out.println("Nom : " + nom);
        System.out.println("Prix HT : " + prixHT);
        // Ajoutez d'autres informations descriptives si nécessaire
        System.out.println();
    }

    public static void main(String[] args) {
        // Initialisation des tableaux (noms, prixHT) de la Mission 4
        String[] noms = {"Accessoire1", "Accessoire2", "Accessoire3"};
        double[] prixHTs = {10.99, 20.49, 15.75};

        // Utilisation de la nouvelle procédure pour afficher les éléments
        for (int i = 0; i < noms.length; i++) {
            afficherDescription(noms[i], prixHTs[i]);
        }
    }
}
