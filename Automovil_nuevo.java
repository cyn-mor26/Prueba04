package Ejercicioprueba3;

public class Automovil_nuevo {
	private String marca;
	private String modelo ;
	private int a�o;
	private double precio;
	
	public Automovil_nuevo (String marca, String modelo ,int a�o,double precio ){
		
	}

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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double preciofinal(double preciofinal,double interes,double comisi�n,int patente ) {
		 precio=(precio*1.19*1.05)+100000;
		 return preciofinal;
	}
	}
