package Empresa;

public class Empleado_uno {
	private String  Nombre;
	private String  rut;
	private String  apellidos; 
	private String  direccion;
	private int telefono;
	private double sueldo;
	
public Empleado_uno() {
}	

public Empleado_uno(String nombre, String rut, String apellidos, String direccion, int telefono,
		double sueldo) {

	Nombre = nombre;
	this.rut = rut;
	this.apellidos = apellidos;
	this.direccion = direccion;
	this.telefono = telefono;
	this.sueldo = sueldo;
}
public String getRut() {
	return rut;
}

public void setRut(String rut) {
	this.rut = rut;
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public int getTelefono() {
	return telefono;
}

public void setTelefono(int telefono) {
	this.telefono = telefono;
}

public double getSueldo() {
	return sueldo;
}

public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}


}
