package Prueba04;

public class clase_privada extends Empleado_uno{
	
	private String comuna;
	private String empresa;

	public clase_privada(String nombre, String rut, String apellidos, String direccion, int telefono,
			double sueldo,String comuna, String empresa) {
		super(nombre, rut, apellidos, direccion, telefono, sueldo);
		this.comuna =comuna;
		this.empresa =empresa;
		
	}

	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String Empresa) {
		this.empresa =Empresa;
	}

	@Override
	public String toString() {
		return "clase_privada [comuna=" + comuna + ", empresa=" + empresa + ", getComuna()=" + getComuna()
				+ ", getEmpresa()=" + getEmpresa() + "]";
	}

	
}

	


