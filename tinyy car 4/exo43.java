public class exo43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur la taille du panier
        System.out.print("Veuillez entrer la taille du panier : ");
        int taillePanier = scanner.nextInt();

        // Création des tableaux pour les noms et les prix HT en fonction de la taille du panier
        String[] nomsAccessoires = new String[taillePanier];
        double[] prixHT = new double[taillePanier];

        // Demande à l'utilisateur les noms et prix HT de chaque accessoire
        for (int i = 0; i < taillePanier; i++) {
            System.out.print("Veuillez saisir le nom de l'accessoire " + (i + 1) + " : ");
            nomsAccessoires[i] = scanner.next();

            System.out.print("Veuillez saisir le prix HT de " + nomsAccessoires[i] + " : ");
            prixHT[i] = scanner.nextDouble();
        }

        // Affichage des noms et des prix HT à l'aide d'une boucle for
        System.out.println("Liste des accessoires du panier avec leurs prix HT :");
        double sommeTotale = 0;
        for (int i = 0; i < taillePanier; i++) {
            System.out.println("Nom : " + nomsAccessoires[i] + ", Prix HT : " + prixHT[i] + " €");
            sommeTotale += prixHT[i];
        }

        // Affichage de la somme totale des achats
        System.out.println("Somme totale des achats : " + sommeTotale + " €");

        // Fermeture du scanner
        scanner.close();
    }
}