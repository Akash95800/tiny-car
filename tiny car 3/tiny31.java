import java.util.Scanner;

public class Tinycar31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int recommencer = 1;  // Initialisation à 1 pour permettre la première exécution.

        while (recommencer == 1) {
            System.out.print("Veuillez entrer le prix HT de la voiture : ");
            double prixHT = sc.nextDouble();

            sc.nextLine(); // Consomme la nouvelle ligne restante

            System.out.print("Veuillez entrer la marque de la voiture : ");
            String marque = sc.nextLine();

            System.out.print("Veuillez entrer le modèle de la voiture : ");
            String modele = sc.nextLine();

            System.out.print("Veuillez entrer le taux de TVA en pourcentage : ");
            double tauxTVA = sc.nextDouble() / 100.0; // Convertir le pourcentage en décimal

            double prixTTC = prixHT * (1 + tauxTVA);

            if (prixTTC > 20000) {
                prixTTC = prixTTC * 0.9;  // Appliquer une remise de 10 % si le prix est supérieur à 20 000 €
            }

            System.out.println("Le prix total TTC de la " + marque + " " + modele + " est : " + prixTTC);

            // Demander à l'utilisateur s'il souhaite recommencer
            System.out.print("Voulez-vous calculer le prix TTC d'une autre voiture ? (1 pour continuer, 0 pour quitter) : ");
            recommencer = sc.nextInt();
        }

        System.out.println("Merci d'avoir utilisé le programme. Au revoir !");
    }
}