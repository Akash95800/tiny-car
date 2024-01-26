import java.util.Scanner;

public class tinycar24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Demande à l'utilisateur de saisir le code secret
        System.out.print("Veuillez entrer le code secret pour utiliser l'application : ");
        String codeSecret = sc.nextLine();

        // Vérifier si le code secret est correct ("Padawan" dans cet exemple)
        if (codeSecret.equalsIgnoreCase("Padawan")) {
            // Code secret correct, l'utilisateur peut utiliser l'application

            System.out.print("Veuillez entrer le prix HT de la voiture : ");
            double prixHT = sc.nextDouble();

            // Demande à l'utilisateur de saisir la marque de la voiture
            sc.nextLine();
            System.out.print("Veuillez entrer la marque de la voiture : ");
            String marque = sc.nextLine();

            // Demande à l'utilisateur de saisir le modèle de la voiture
            System.out.print("Veuillez entrer le modèle de la voiture : ");
            String modele = sc.nextLine();

            // Demande à l'utilisateur de choisir s'il a une carte de fidélité
            System.out.println("Choisissez une option :");
            System.out.println("1 - Sans carte de fidélité");
            System.out.println("2 - Avec carte gold");
            System.out.println("3 - Avec carte platinium");
            System.out.print("Entrez le numéro de l'option choisie : ");
            int choixCarte = sc.nextInt();

            double tauxTVA;
            double reduction = 0.0;

            if (choixCarte == 1) {
                // Sans carte de fidélité, pas de réduction
                tauxTVA = 0.20;
            } else if (choixCarte == 2) {
                // Avec carte gold, 20% de réduction
                tauxTVA = 0.20;
                reduction = 0.20 * prixHT;
            } else if (choixCarte == 3) {
                // Avec carte platinium, 15% de réduction
                tauxTVA = 0.20;
                reduction = 0.15 * prixHT;
            } else {
                System.out.println("Option invalide. Au revoir !");
                return; // Quitte le programme si l'option est invalide
            }

            // Demande à l'utilisateur de choisir si le produit est électrique
            sc.nextLine(); // Nettoie le tampon
            System.out.print("Le produit est-il électrique ? (oui/non) : ");
            String estElectrique = sc.nextLine();

            if (estElectrique.equalsIgnoreCase("oui") && choixCarte == 2) {
                // Avec carte gold et produit électrique, 30% de réduction supplémentaire
                reduction += 0.30 * prixHT;
            } else if (estElectrique.equalsIgnoreCase("oui") && choixCarte == 3) {
                // Avec carte platinium et produit électrique, 30% de réduction supplémentaire
                reduction += 0.30 * prixHT;
            }

            // Calcul du prix TTC après réduction
            double prixTTC = (prixHT - reduction) * (1 + tauxTVA);

            // Vérifier si le prix TTC est supérieur à 20 000 €
            if (prixTTC > 20000) {
                // Appliquer une remise de 10 %
                prixTTC = prixTTC * 0.9;
            }

            System.out.println("Le prix total TTC de la " + marque + " " + modele + " est : " + prixTTC);

        } else {
            // Code secret incorrect, saluer l'utilisateur et arrêter le programme
            System.out.println("Code secret incorrect. Au revoir !");
        }
    }
}