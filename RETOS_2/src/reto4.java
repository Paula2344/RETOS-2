import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {

        Scanner lectura=new Scanner(System.in);

        String[][] calculadora=new String[4][4];

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
               System.out.print("Calculadora ");
               calculadora[i][j]=lectura.next();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(calculadora[i][j]+" ");
            }
            System.out.println("");
        }

        lectura.close();
    }
}

