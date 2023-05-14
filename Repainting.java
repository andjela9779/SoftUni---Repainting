import java.util.Scanner;

public class Repainting {

    public static void main(String[] args) {


        // cijene

        double cijenaNajlona = 1.50; // po m2
        double cijenaBoje = 14.50;  // po l
        double cijenaRazrjedivaca = 5.00; // po l

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite potrebnu kolicinu najlona u metrima kvadratnim:");
        double najlon = scan.nextInt();

        System.out.println("Kolicina boje u litrima:");
        double boja = scan.nextInt();

        System.out.println("Razrjedivac u litrima:");
        double razrjedivac = scan.nextInt();

        System.out.println("Sati koje radnik mora odraditi:");
        double sati = scan.nextInt();

        double sumaZaNajlon = (najlon + 2) * cijenaNajlona;
        double sumaZaBoju = ((boja/10) * cijenaBoje) + boja * cijenaBoje;
        double sumaZaRazrjedivac = razrjedivac * cijenaRazrjedivaca;
        double sumaVrece = 0.40;

        double ukupnaCijena = sumaZaNajlon + sumaZaBoju + sumaZaRazrjedivac + sumaVrece;
        double platitiRadnika = (ukupnaCijena * 0.30) * sati;
        double sve = ukupnaCijena + platitiRadnika;

        System.out.println("Cijene:");
        System.out.println("Najlon:" + sumaZaNajlon);
        System.out.println("Boja:" + sumaZaBoju);
        System.out.println("Razrjedivac:" + sumaZaRazrjedivac);
        System.out.println("Cijena svega:" + ukupnaCijena);
        System.out.println("Platiti radnika:" + platitiRadnika);
        System.out.println("Ukupan trosak za materijal i radnika:" + sve);



    }
}
