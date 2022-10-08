package BateriaDeEjercicios;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NumerosPares {
	
	

	public static void main(String[] args) {
		
		ArrayList<Double>par = new ArrayList<>();
		String n = JOptionPane.showInputDialog("Cantidad de numeros");
		int cantidad =Integer.parseInt(n);
		
		for(int i =0;i<cantidad;i++) {
			String num =JOptionPane.showInputDialog("Ingrese un numero");
			double numero = Double.parseDouble(n);
			
		}
		double sumapar=0;
		for (int i = 0; i < par.size(); i++) {
			double valor =par.get(i);
			sumapar+=valor;
			JOptionPane.showMessageDialog(null,n);
		}
		
		
	

  }
}
