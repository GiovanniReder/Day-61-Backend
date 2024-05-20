public class ES3 {
    public static void main(String[] args) {
        printPerimetro(12.5, 7.5);
        printPariDispari(6);
        System.out.println( erone(12.3, 15.7, 18.4)  );
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
    public static void printPariDispari(int risultato){
        int number = 5;
        int result = pariDispari(number);
        System.out.println("Con number = a " + number + " il risultato è: " + result);
    }
    public static double erone(double num1, double num2, double num3){
        double semiperimetro= (num1 + num2+ num3) / 2;
        double area= Math.sqrt(semiperimetro * (semiperimetro - num1) * (semiperimetro - num2) * (semiperimetro - num3));
        return area;
    }

}