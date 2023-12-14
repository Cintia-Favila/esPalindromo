import java.util.Scanner;

public class esPalindromo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        String cadena;
        String cadenaMod;
        String cadenaInvertida;

        System.out.println("Escribe una cadena");
        cadena = scanner.next();
        cadenaMod = cadena.toLowerCase().replace(" ","");
        //System.out.printf(cadenaMod+" ");

        cadenaInvertida = invertirCadena(cadena);
        /*System.out.printf(cadenaInvertida);
        System.out.println("");*/

        if(cadenaMod.equals(cadenaInvertida)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
    }
    public static String invertirCadena(String cadena){

        cadena = cadena.toLowerCase().replace(" ","");
        String cadenaInvertida = "";

        char caracter;
        for (int i = cadena.length() - 1; i >= 0; i--) {
            caracter = cadena.charAt(i);
            cadenaInvertida += caracter;
        }
        return cadenaInvertida;
    }
}