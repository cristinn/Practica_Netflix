package com.cristinar.Netflix;


public class Pelicula extends Netflix{
	
		
	// Declaración atributo que no aparece en la clase padre Netflix:
	
	private int anio;
	
		
	// Constructor default:
	
	public Pelicula(){
	}
	
	//Constructor con el título y el creador
	
	public Pelicula(String titulo, String creador){
		super(titulo,creador);
	}
	
	//Constructor con todos los atributos de la clase hija Pelicula excepto visto
	
	public Pelicula(String titulo, String genero, String creador,double duracion, int año){
		super(titulo,genero,creador,duracion);
		this.anio = año;
			
	}
	
	// Métodos get y set para el atributo año, porque los métodos set y get de los otros atributos están definidos en la clase padre Netflix
	
	public int getAño() {
		return anio;
	}
	public void setAño(int anio) {
		this.anio = anio;
	}
	
	// sobreesscritura del método toString:
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nAño: "+anio;
	}

	
	

}
