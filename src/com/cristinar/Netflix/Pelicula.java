package com.cristinar.Netflix;


public class Pelicula extends Netflix{
	
		
	// Declaraci�n atributo que no aparece en la clase padre Netflix:
	
	private int anio;
	
		
	// Constructor default:
	
	public Pelicula(){
	}
	
	//Constructor con el t�tulo y el creador
	
	public Pelicula(String titulo, String creador){
		super(titulo,creador);
	}
	
	//Constructor con todos los atributos de la clase hija Pelicula excepto visto
	
	public Pelicula(String titulo, String genero, String creador,double duracion, int a�o){
		super(titulo,genero,creador,duracion);
		this.anio = a�o;
			
	}
	
	// M�todos get y set para el atributo a�o, porque los m�todos set y get de los otros atributos est�n definidos en la clase padre Netflix
	
	public int getA�o() {
		return anio;
	}
	public void setA�o(int anio) {
		this.anio = anio;
	}
	
	// sobreesscritura del m�todo toString:
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nA�o: "+anio;
	}

	
	

}
