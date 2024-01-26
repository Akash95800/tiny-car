import java.util.Scanner;

public class TinyCar4{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez entrer le prix HT de la voiture : ");
        double prixHT = sc.nextDouble();

        // Demande à l'utilisateur de saisir la marque de la voiture
        sc.nextLine(); 
        System.out.println("Veuillez entrer la marque de la voiture : ");
        String marque = sc.nextLine();

        // Demande à l'utilisateur de saisir le modèle de la voiture
        System.out.println("Veuillez entrer le modèle de la voiture : ");
        String modele = sc.nextLine();

        // Taux de TVA 
        // double tauxTVA = 0.10; --Ici on peut définir le taux de TVA directement 

        // Demande à l'utilisateur de choisir le taux de TVA en pourcentage
        System.out.print("Veuillez entrer le taux de TVA en pourcentage : ");
        double tauxTVA = sc.nextDouble() / 100.0; // Pourcentage -> décimal

        // Calcul du prix TTC
        double prixTTC = prixHT * (1 + tauxTVA);
        
        System.out.println("Le prix total TTC de la " + marque + " " + modele + " est : " + prixTTC);

    
    }
}
