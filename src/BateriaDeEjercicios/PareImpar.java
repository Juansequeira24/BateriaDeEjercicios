package BateriaDeEjercicios;
import java.util.Scanner;

public class PareImpar {
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		
		int num;
		
		
		
		System.out.println("Ingrese el numero a evaluar");
		num=s.nextInt();
		
		while(num<=0) {}
		
		if(num==0) {
			System.out.println("No es par ni impar");
              }
		
	     else if(num % 2 ==0) {
			System.out.println("Es un numero par" );
			
		}else {
			
			System.out.println("Es un numero impar" );
		 }
	
 		}
	}


