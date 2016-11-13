package com.cristinar.Netflix;


public class Pelicula extends Netflix{
	
		
	// Declaraci�n atributo que no aparece en la clase padre Netflix:
	
	private int a�o;
	
		
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
		this.a�o = a�o;
			
	}
	
	// M�todos get y set para el atributo a�o, porque los m�todos set y get de los otros atributos est�n definidos en la clase padre Netflix
	
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	// sobreesscritura del m�todo toString:
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nA�o: "+a�o;
	}

	
	

}
