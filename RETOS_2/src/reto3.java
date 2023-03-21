import java.util.Scanner;
public class reto3{
	public static void main(String[] args){
	Scanner lectura=new Scanner(System.in);
	int codigo=0;
	String precio[][]=new String[16][1];
	String productos[][]=new String[16][1];


		for(int i=0;i<16;i++){
			for(int j=0;j<1;j++){
			System.out.println("Ingrese el nombre del producto  " + (i + 1));
            productos[i][j] = lectura.nextLine();
            System.out.println("Ingrese el precio del producto " + (i + 1));
            precio[i][j]=lectura.nextLine();
				}
					}
		System.out.println("Id|Nombre|Precio");
	
		for(int i=0;i<16;i++){
			for(int j=0;j<1;j++){
				System.out.print(codigo+(i + 1)+" "+productos[i][j]+" "+precio[i][j]);
						}
				System.out.println("");
		}
		lectura.close();
	}
		
	}
		


    



