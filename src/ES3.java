public class ES3 {
    public static void main(String[] args) {
        printPerimetro(12.5, 7.5);
    }


    public static double perimetroRettangolo(double base, double altezza) {
        return base * altezza;
    }

    public static void printPerimetro(double base, double altezza) {
        double base1 = 12.5;
        double altezza2 = 7.5;
        double result = perimetroRettangolo(base1, altezza2);
        System.out.println("Il perimetro del rettangolo è:" + result);
    }

    public static int pariDispari(int risultato) {
        if (risultato % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void printPariDispari()
}