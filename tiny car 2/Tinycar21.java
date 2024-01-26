import java.util.Scanner;

public class Tinycar21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez entrer le prix HT de la voiture : ");
        double prixHT = sc.nextDouble();

        // Demande à l'utilisateur de saisir la marque de la voiture
        sc.nextLine();
        System.out.print("Veuillez entrer la marque de la voiture : ");
        String marque = sc.nextLine();

        // Demande à l'utilisateur de saisir le modèle de la voiture
        System.out.print("Veuillez entrer le modèle de la voiture : ");
        String modele = sc.nextLine();

        // Taux de TVA
        System.out.print("Veuillez entrer le taux de TVA en pourcentage : ");
        double tauxTVA = sc.nextDouble() / 100.0; // Pourcentage -> décimal

        // Calcul du prix TTC
        double prixTTC = prixHT * (1 + tauxTVA);

        // Vérifier si le prix TTC est supérieur à 20 000 €
        if (prixTTC > 20000) {
            // Appliquer une remise de 10 %
            prixTTC = prixTTC * 0.9;
        }

        System.out.println("Le prix total TTC de la " + marque + " " + modele + " est : " + prixTTC);
    }
}