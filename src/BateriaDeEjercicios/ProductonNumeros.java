package BateriaDeEjercicios;
import java.util.Scanner;

public class ProductonNumeros {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		int Producto=1,N;
		System.out.println("Ingrese N numeros :");
		N=e.nextInt();
		
		for(int i=1;i<=N;i++) {
			System.out.println(i + "");
			Producto*=i;
			
		}
		System.out.println("\nProducto de " + N + " :" + Producto);
	
		
	}

}
