package Empresa;

public class clase_publica extends Empleado_uno {

	private String municipalidad;
	private String dpto;

	public clase_publica(String nombre, String rut, String apellido1, String apellido2, String direccion, int telefono,
			double sueldo,String municipalidad,String dpto) {
		super(nombre, rut, apellido1, apellido2, direccion, telefono, sueldo);
		this.municipalidad=municipalidad;
		this.dpto=dpto;
		
	}

	public String getMunicipalidad() {
		return municipalidad;
	}
	public void setMunicipalidad(String municipalidad) {
		this.municipalidad = municipalidad;
	}
	public String getDpto() {
		return dpto;
	}
	public void setDpto(String dpto) {
		this.dpto = dpto;
	}

	@Override
	public String toString() {
		return "clase_publica [getMunicipalidad()=" + getMunicipalidad() + ", getDpto()=" + getDpto() + ", getRut()="
				+ getRut() + ", getNombre()=" + getNombre() + ", getApellido1()=" + getApellido1() + ", getApellido2()="
				+ getApellido2() + ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono()
				+ ", getSueldo()=" + getSueldo() +", getMunicipalidad()="+ getMunicipalidad()+ ",getDpto()="+getDpto()+";"
	}
	
}

	



