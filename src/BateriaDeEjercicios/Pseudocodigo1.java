package BateriaDeEjercicios;
import java.util.*;
public class Pseudocodigo1 {

	public static void main(String[] args) {
	int n,i=0;
	
	Scanner s = new  Scanner(System.in);
	
	System.out.println("Ingrese un numero :");
	n=s.nextInt();
	
	  while(n>1) {
		  if(n%2==0) {
			  n=n/2;
			  
		  }
		  
		  else {
			  n=-n*3+1;
			  i=i+1;
		  }
		  System.out.println(i);
		  
	  }
	  
	}
	
}


