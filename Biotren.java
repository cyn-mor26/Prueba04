package Empresa_biotren;

public class Biotren {
	//atributos de super clase
	private int n_tarjeta;
	private String t_Usuario;
	private int pasaje;
	private int saldo;
	private int diasInactivo;
	private boolean activa;
	
	public void abonoDinero(int abono) {
		//Si abono es mayor a cero 
		if (abono > 0) {
			//sumar abono a saldo
			this.saldo = saldo + abono;
			//Me imprime lo abonado y el  saldo final
			System.out.println("han recargado $" + abono + " a su tarjeta. " + "Saldo final $" + saldo + ".");
			
		}
		
		//si el abono es mayor a 500 , activa es verdadero , por lo tanto se reactiva tarjeta.
		if (abono >= 500 && !(activa)) {
			
			activa = true;
			System.out.println("Su tarjeta ha sido reactivada exitosamente.");
			
		}
		
	}
	//metodo para tarifa normal o estudiante
	public void asignarTarifa() {
		// si la tarjeta de usuario es TNE , la tarifa sera de 200
		if (t_Usuario == "TNE") {
			
			tarifa = 200;
			//sino la tarifa es normal , es decir, 600
		} else {
			
			tarifa = 600;
		}
		
	}
}
