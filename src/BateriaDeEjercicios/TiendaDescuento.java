package BateriaDeEjercicios;
import java.util.*;

public class TiendaDescuento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double compra;
		
		System.out.println("Ingrese el monto de compra :");
		compra = entrada.nextDouble();
		if (compra >0) {
			compra -= (compra*0.15);
			
			System.out.println("El monto a pagar despues de haber aplicado el descuento es :" + compra);
			
		}
	}
}
