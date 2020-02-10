package Automovil;

public class Automovil_nuevo {
	//atributos de automovil nuevo
		private String marca;
		private String modelo ;
		private int año;
		private double precio;
		
		//constructor
		public Automovil_nuevo (String marca, String modelo ,int año,double precio ){
			
		}

//metodos get y set de cada atributo
		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getAño() {
			return año;
		}

		public void setAño(int año) {
			this.año = año;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public double  preciofinal() {
			return this.precio*1.19*1.05+100000;
		}
	
@Override
public String toString() {
	return "Automovil_nuevo [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", precio =" + precio+ "]";
}
}
