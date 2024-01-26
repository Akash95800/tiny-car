import java.util.Scanner;

public class exo3 {
    public static void main (String[] args ) {
        Scanner sc = new Scanner (System.in);


        double prixHT = 100;
        double tva= 0.2;

        double prixTTC = prixHT*(1 + tva);

        System.out.println(prixTTC);
    }
}

