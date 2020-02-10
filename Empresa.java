package EmpresaBiotren;

public class Empresa {

	private int n_tarjeta;
	private String tipo_usuario;
	private float saldo;
	private double dscto;
	
			
	public Empresa (String n_tarjeta, String tipo_usuario ,float saldo,double descto ){
			
		}
	public int getN_tarjeta() {
		return n_tarjeta;
	}

	public void setN_tarjeta(int n_tarjeta) {
		this.n_tarjeta = n_tarjeta;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public double getDscto() {
		return dscto;
	}

	public void setDscto(double dscto) {
		this.dscto = dscto;
	}
}
