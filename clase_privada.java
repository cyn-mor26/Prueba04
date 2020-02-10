package Empresa;

public class clase_privada extends Empleado_uno{

	private String comuna;
	private String empresa;

	public clase_privada(String nombre, String rut, String apellido1, String apellido2, String direccion, int telefono,
			double sueldo, String comuna, String empresa) {
		super(nombre, rut, apellido1, apellido2, direccion, telefono, sueldo);
		// TODO Auto-generated constructor stub
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
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	@Override
	public String toString() {
		return "clase_privada [getComuna()=" + getComuna() + ", getEmpresa()=" + getEmpresa() + ", getRut()=" + getRut()
				+ ", getNombre()=" + getNombre() + ", getApellido1()=" + getApellido1() + ", getApellido2()="
				+ getApellido2() + ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono()
				+ ", getSueldo()=" + getSueldo() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
