import java.util.Scanner;

public class ES2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("User inserisci qui la tua stringa ");
        String primaStringa = sc.nextLine();

        System.out.println("User inserisci qui la seconda stringa ");
        String secondaStringa = sc.nextLine();

        System.out.println("User inserisci qui la tua terza stringa ");
        String terzaStringa = sc.nextLine();
        String concatenazionePotente= primaStringa + secondaStringa + terzaStringa;
        System.out.println("stringhe inserite " + concatenazionePotente  );
        String concatenazioneInversa= terzaStringa + secondaStringa + primaStringa;
        System.out.println("stringhe inserite " + concatenazioneInversa  );



        sc.close();
    }

}
