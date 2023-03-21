import java.util.Scanner;
public class reto2 {
    
    public static void main(String[] args) {

        String palabra;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite una palabra");
        palabra = lectura.nextLine();

        char[] caracteres = palabra.toCharArray();
        boolean palindromo = true;

        for (int i = 0; i < caracteres.length / 2; i++) {
            if (caracteres[i] != caracteres[caracteres.length - i - 1]) {
                palindromo = false;
            }
        }

        if (palindromo) {
            System.out.println("La palabra "+palabra+" es un palindromo");
        } else {
            System.out.println("La palabra " +palabra+" no es un palíndromo");
        }

        lectura.close();
    }
}