public class exo42 {
    public static void main(String[] args) {
        // Création du tableau pour les noms des accessoires
        String[] nomsAccessoires = {"table", "chargeur", "canapé", "commande", "manteau"};
        
        // Création du tableau pour les prix HT
        double[] prixHT = new double[nomsAccessoires.length];

        // Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur le prix HT de chaque accessoire
        for (int i = 0; i < nomsAccessoires.length; i++) {
            System.out.print("Veuillez saisir le prix HT de " + nomsAccessoires[i] + " : ");
            prixHT[i] = scanner.nextDouble();
        }

        // Affichage des noms et des prix HT à l'aide d'une boucle for
        System.out.println("Liste des accessoires avec leurs prix HT :");
        for (int i = 0; i < nomsAccessoires.length; i++) {
            System.out.println("Nom : " + nomsAccessoires[i] + ", Prix HT : " + prixHT[i] + " €");
        }

        // Fermeture du scanner
        scanner.close();
    }
}