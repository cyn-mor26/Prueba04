package Empresa;

public class Empleado_uno {
	private String  Nombre;
	private String  rut;
	private String  Apellido1;
	private String  Apellido2;
	private String  Direccion;
	private int Telefono;
	private double Sueldo;
	
public Empleado_uno() {
}	

public Empleado_uno(String nombre, String rut, String apellido1, String apellido2, String direccion, int telefono,
		double sueldo) {

	Nombre = nombre;
	this.rut = rut;
	Apellido1 = apellido1;
	Apellido2 = apellido2;
	Direccion = direccion;
	Telefono = telefono;
	Sueldo = sueldo;
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

public String getApellido1() {
	return Apellido1;
}

public void setApellido1(String apellido1) {
	Apellido1 = apellido1;
}


public String getApellido2() {
	return Apellido2;
}

public void setApellido2(String apellido2) {
	Apellido2 = apellido2;
}

public String getDireccion() {
	return Direccion;
}

public void setDireccion(String direccion) {
	Direccion = direccion;
}

public int getTelefono() {
	return Telefono;
}

public void setTelefono(int telefono) {
	Telefono = telefono;
}

public double getSueldo() {
	return Sueldo;
}

public void setSueldo(double sueldo) {
	Sueldo = sueldo;
}

@Override
public String toString() {
	return "Empleado_uno [getRut()=" + getRut() + ", getNombre()=" + getNombre() + ", getApellido1()=" + getApellido1()
			+ ", getApellido2()=" + getApellido2() + ", getDireccion()=" + getDireccion() + ", getTelefono()="
			+ getTelefono() + ", getSueldo()=" + getSueldo() + "]";
}

	
}
