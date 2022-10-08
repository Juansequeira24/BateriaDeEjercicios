package BateriaDeEjercicios;

import java.util.Scanner;

public class Noenterodivisores {
	
	private static final int N = 0;

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);	
		
	do {
		
			System.out.println("\nIntroduzca un numero N :");
			int N=lector.nextInt();
		
		for (int i = 1; i <N; i++) {
				
		
		
		if(N%i==0) 
			System.out.print(i + " ");
			
		}
	    }while(N<1);
	}
	

}
