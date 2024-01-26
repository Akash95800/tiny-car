import java.util.Scanner;

public class tinycar22 {
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

        // Demande à l'utilisateur de choisir si le produit est électrique ou non
        System.out.print("Le produit est-il électrique ? (oui/non) : ");
        String estElectrique = sc.nextLine();
        double tauxTVA;
        
        if (estElectrique ("oui")) {
            // Si le produit est électrique, le taux de TVA est de 5 %
            tauxTVA = 0.05;
        } else {
            // Si le produit n'est pas électrique, le taux de TVA est de 20 %
            tauxTVA = 0.20;
        }

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