package Prueba04;

public class Principal_persona {

	 	public static void main(String[] args) {
	     
	     clase_publica epublic = new clase_publica("Fernando", "152423566" , "Mellado Salinas", "los laureles 45", 945281947, 780000,"municipalidad de los Alamos", "Administrativo");
	     
	 	System.out.println(epublic.getNombre());
	 	System.out.println(epublic.getRut());
	 	System.out.println(epublic.getApellidos());
	 	System.out.println(epublic.getDireccion());
	 	System.out.println(epublic.getTelefono());
	 	System.out.println(epublic.getSueldo());
	 	System.out.println(epublic.getMunicipalidad());
	 	System.out.println(epublic.getDpto());
	 	
	 
	    clase_privada eprivate = new clase_privada("Francisco","123456787"," Risopatrón De Lourdes", "Juan Bosco 1786", 976834616, 600000,"Comuna Las Condes", "Gerencia");
	 	System.out.println(eprivate.getNombre());
	 	System.out.println(eprivate.getRut());
	 	System.out.println(eprivate.getApellidos());
	 	System.out.println(eprivate.getDireccion());
	 	System.out.println(eprivate.getTelefono());
	 	System.out.println(eprivate.getSueldo());
	 	System.out.println(eprivate.getComuna());
	 	System.out.println(eprivate.getEmpresa());
	 	}
	 }

