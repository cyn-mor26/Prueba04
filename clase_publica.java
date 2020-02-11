package Empresa;

public class clase_publica extends Empleado_uno {
	private String municipalidad;
	private String dpto;

	public clase_publica(String nombre, String rut, String apellidos, String direccion, int telefono,
			double sueldo,String municipalidad,String dpto) {
		super(nombre, rut, apellidos, direccion, telefono, sueldo);
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
		return "clase_publica [municipalidad=" + municipalidad + ", dpto=" + dpto + ", getMunicipalidad()="
				+ getMunicipalidad() + ", getDpto()=" + getDpto() + "]";
	}
}
	

