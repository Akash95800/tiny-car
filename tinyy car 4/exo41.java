public class GestionPanier {
    public static void main(String[] args) {
        // Création des tableaux pour les noms et les prix HT
        String[] nomsAccessoires = {"table", "chargeur", "canapé", "commande", "manteau"};
        double[] prixHT = {19.99, 25.49, 12.99, 8.75, 30.00};

        // Affichage des noms et des prix HT à l'aide d'une boucle for
        for (int i = 0; i < nomsAccessoires.length; i++) {
            System.out.println("Nom : " + nomsAccessoires[i] + ", Prix HT : " + prixHT[i] + " €");
        }
    }
}