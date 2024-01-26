public class Exo2 {
    public static void main (String[] args ) {

        double prixHT = 100;
        double tva= 0.2;

        double prixTTC = prixHT*(1 + tva);

        System.out.println(prixTTC);
    }
}