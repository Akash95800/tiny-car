import java.util.Scanner;

public class exo44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nombre d'accessoires à enregistrer
        int nombreAccessoires = 5;

        // Création des tableaux pour les noms et les prix HT
        String[] nomsAccessoires = new String[nombreAccessoires];
        double[] prixHT = new double[nombreAccessoires];

        // Saisie des noms et prix HT pour chaque accessoire
        for (int i = 0; i < nombreAccessoires; i++) {
            System.out.print("Veuillez saisir le nom de l'accessoire " + (i + 1) + " : ");
            nomsAccessoires[i] = scanner.next();

            System.out.print("Veuillez saisir le prix HT de " + nomsAccessoires[i] + " : ");
            prixHT[i] = scanner.nextDouble();
        }

        // Affichage des noms et des prix HT à l'aide d'une boucle for
        System.out.println("Liste des accessoires avec leurs prix HT :");
        double sommeTotale = 0;
        for (int i = 0; i < nombreAccessoires; i++) {
            System.out.println("Nom : " + nomsAccessoires[i] + ", Prix HT : " + prixHT[i] + " €");
            sommeTotale += prixHT[i];
        }

        // Recherche et affichage de l'accessoire le moins cher
        int indexMinimum = trouverIndexMinimum(prixHT);
        System.out.println("Accessoire le moins cher : " + nomsAccessoires[indexMinimum] + " avec un prix de " + prixHT[indexMinimum] + " €");

        // Recherche et affichage de l'accessoire le plus cher
        int indexMaximum = trouverIndexMaximum(prixHT);
        System.out.println("Accessoire le plus cher : " + nomsAccessoires[indexMaximum] + " avec un prix de " + prixHT[indexMaximum] + " €");

        // Calcul du prix moyen
        double prixMoyen = sommeTotale / nombreAccessoires;
        System.out.println("Prix moyen des accessoires : " + prixMoyen + " €");

        scanner.close();
    }

    // Méthode pour trouver l'index du prix minimum dans le tableau
    private static int trouverIndexMinimum(double[] tableau) {
        int indexMinimum = 0;
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < tableau[indexMinimum]) {
                indexMinimum = i;
            }
        }
        return indexMinimum;
    }
    private static int trouverIndexMaximum(double[] tableau) {
        int indexMaximum = 0;
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > tableau[indexMaximum]) {
                indexMaximum = i;
            }
        }
        return indexMaximum;
    }
}
