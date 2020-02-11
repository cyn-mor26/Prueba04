package Empresa;

public class Principal_persona {

	public static void main(String[] args) {

    
    clase_publica epublic = new clase_publica("Rut : 152423566" ,"Nombre: Fernando",  "Apellidos : Mellado Salinas", "los laureles 45", 945281947, 780000,"Municipalidad : de los Alamos", "Departamento : Administrativo");
    
 	System.out.println(epublic.getNombre());
 	System.out.println(epublic.getRut());
 	System.out.println(epublic.getApellidos());
 	System.out.println(epublic.getDireccion());
 	System.out.println(epublic.getTelefono());
 	System.out.println(epublic.getSueldo());
 	System.out.println(epublic.getMunicipalidad());
 	System.out.println(epublic.getDpto());
 	System.out.println("\n");
 
 	 clase_privada eprivate = new clase_privada("Rut : 123456787","Nombre : Francisco","Apellidos : Risopatrón De Lourdes", "Direccion : Juan Bosco 1786",976834616, 600000,"Comuna : Las Condes", "Cargo en Empresa: Gerencia");
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

