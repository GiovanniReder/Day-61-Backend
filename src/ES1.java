public class ES1 {
    public static void main(String[] args) {
       printMultiply(20, 5);
        String stringInput= "esempio";
        int numeroInput = 2;
        String result = concatena(stringInput, numeroInput);
        System.out.println(result);

    }
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static void printMultiply(int num1, int num2){

        int number1=5;
        int number2=20;
        int result= multiply(number1, number2);
        System.out.println("Il prodotto dei due numeri è:" + result);

    }


    public static String concatena(String stringInput, int numeroInput){
        return stringInput + numeroInput;
    }
    public static String[] insieme(String[] arrayString, String testo){
        String [] newArray = new String[6];
          newArray[0] = arrayString[0];
          newArray[1] = arrayString[1];
          newArray[2] = testo;
          newArray[3] = arrayString[2];
          newArray[4] = arrayString[3];
          newArray[5] = arrayString[4];



        return  newArray;

    }
}


