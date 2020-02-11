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
		
		if (abono > 0) {
			
			this.saldo = saldo + abono;
			System.out.println("Se han cargado $" + abono + " a su tarjeta. "
							   + "Su nuevo saldo es de $" + saldo + ".");
			
		}
		
		
		if (abono >= 500 && !(activa)) {
			
			activa = true;
			System.out.println("Su tarjeta ha sido reactivada exitosamente.");
			
		}
		
	}
	
	public void asignarTarifa() {
		
		if (t_Usuario == "TNE") {
			
			tarifa = 200;
			
		} else {
			
			tarifa = 600;
			
		}
		
	}
}
