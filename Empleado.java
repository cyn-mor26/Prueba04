package Empleado02;

public class Empleado {

	private String rut;
	private String cargo;
	private String nombre;
	private String apellidop;
	private String apellidom;
	private String direccion;
	private int fono;
	private String Email;
	
	public Empleado() {
	}
	public  Empleado(String rut, String nombre, String apellidop, String apellidom,String cargo) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellidop = apellidop;
		this.apellidom = apellidom;
		this.cargo = cargo;
	}
	 public void Empleado(String rut, String nombre, String apellidop, String apellidom,String direccion,int fono, String Email, String cargo )	{
		this.rut = rut;
	    this.nombre = nombre;
		this.apellidop = apellidop;
		this.apellidom = apellidom;
		this.cargo = cargo;
		this.direccion = direccion;
		this.fono = fono;
		this.Email = Email;
		
	 }
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public  String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidop() {
		return apellidop;
	}
	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}
	public String getApellidom() {
		return apellidom;
	}
	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getFono() {
		return fono;
	}
	public void setFono(int fono) {
		this.fono = fono;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	



}

