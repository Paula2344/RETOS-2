import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {

        int intentos = 0;
        boolean descubrir = false;
        char letra;

        Scanner lectura = new Scanner(System.in);
        String[] palabras = {"paula"};
        String palabraAdivinada = palabras[(int) (Math.random() * palabras.length)];
        char[] letraCorrecta1 = new char[palabraAdivinada.length()];
        
        System.out.println("Nombre");

        while (!descubrir && intentos < 5) {
            System.out.print("Digite una letra: ");
            letra = lectura.next().charAt(0);
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraAdivinada.length(); i++) {
                if (palabraAdivinada.charAt(i) == letra) {
                    letraCorrecta1[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("La letra que ingresaste era incorrecta te quedan " + (5 - intentos) + " intentos.");
            }

            System.out.println(letraCorrecta1);

            if (palabraAdivinada.equals(String.valueOf(letraCorrecta1))) {
                descubrir = true;
                System.out.println("¡Ganaste!");
            }
        }

        if (!descubrir) {
            System.out.println("Perdiste, la palabra correcta era " + palabraAdivinada);
        }

        lectura.close();
    }
}
