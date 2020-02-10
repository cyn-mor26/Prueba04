package Empresa;

import java.util.Scanner;

import Empleado02.Empleado;

public class Principal_persona {

	private static Scanner sc;

	public static void main(String[] args) {
    sc = new Scanner(System.in);
    
    Empleado_uno epublic = new Empleado_uno("Fernando", "152423566" , "Mellado", "Salinas", "los laureles 45", 945281947, 780.000,"municipalidad de los Alamos","Administrativo");
    
	System.out.println(epublic.getNombre());
	System.out.println(epublic.getRut());
	System.out.println(epublic.getApellido1());
	System.out.println(epublic.getApellido2());
	System.out.println(epublic.getDireccion());
	System.out.println(epublic.getTelefono());
	System.out.println(epublic.getSueldo());
	System.out.println(epublic.getMunicipalidad());
	System.out.println(epublic.getDpto());
	
	
	
	
	
	
    Empleado_uno eprivate = new Empleado_uno("Francisco","123456787"," Risopatrón De Lourdes", "Juan Bosco 1786", 976834616, 6000000,"[" Condes" +comuna+ , "empresa"+ Gerencia+ "]";
	System.out.println(eprivate.getNombre());
	System.out.println(eprivate.getRut());
	System.out.println(eprivate.getApellido1());
	System.out.println(eprivate.getApellido2());
	System.out.println(eprivate.getDireccion());
	System.out.println(eprivate.getTelefono());
	System.out.println(eprivate.getSueldo());
	System.out.println(eprivate.getComuna());
	System.out.println(eprivate.getEmpresa());
	}
}
