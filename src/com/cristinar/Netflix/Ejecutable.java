package com.cristinar.Netflix;


public class Ejecutable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Pelicula[] matPeliculas = new Pelicula[5];
		Serie[] matSeries = new Serie[5];
		
		matPeliculas[0] = new Pelicula("The Imitation Game","Drama","Morten Tyldum",115,2015);
		matPeliculas[1] = new Pelicula();
		matPeliculas[2] = new Pelicula("Doctor Strange","Scott Derrickson");
		matPeliculas[3] = new Pelicula("Van Helsing", "Acción/Fantasía","Stephen Sommers",130,2004);
		matPeliculas[4] = new Pelicula("El médico","Drama","Philipp Stölzl",155,2013);
		
		matSeries[0] = new Serie("Black Mirror", "Ciencia ficción","Charlie Brooker",60,3);
		matSeries[1] = new Serie();
		matSeries[2] = new Serie("The X-Files","Chris Carter");
		matSeries[3] = new Serie("Homeland","Drama","Gideon Raff",42,5);
		matSeries[4] = new Serie("Friends","Comedia","Marta Kauffman",20,10);
		
		// Marcar películas/series vistas
		
		matPeliculas[0].marcarVisto("2098 min. y 50 seg.");
		matPeliculas[3].marcarVisto("1087 min. y 24 seg.");
		matPeliculas[4].marcarVisto("1850 min. y 36 seg.");
		matSeries[0].marcarVisto("898 min. y 35 seg.");
		matSeries[4].marcarVisto("299 min. y 56 seg.");
		
		
		//Mostrar detalle de películas y series que se visualizaron con el detalle de minutos/segundos visualizados
		
		System.out.println("\nPelículas visualizadas: ");
		
		for(int i=0;i<5;i++){
			if(matPeliculas[i].esVisto()==true){ // podriamos no poner "==true" asi: if(matPeliculas[i].esVisto()){ 
				System.out.println(matPeliculas[i].toString());
				System.out.println(matPeliculas[i].tiempoVisto());
			}
		}
		
		System.out.println("\nSeries visualizadas: ");
		
		for(int j=0;j<5;j++){
			if(matSeries[j].esVisto()==true){  // podriamos no poner "==true" asi: if(matPeliculas[i].esVisto()){ 
				System.out.println(matSeries[j].toString());
				System.out.println(matSeries[j].tiempoVisto());
			}
		}
		
		//Mostrar la serie con más temporadas:
		
		int maxtemp = 0, posicion=0; // variable que guardará el número máximo de temporadas
		
		for(int k=0;k<5;k++){
			if(matSeries[k].getNumtemporadas()>maxtemp){
			maxtemp = matSeries[k].getNumtemporadas();
			}
			posicion = k;
		}
		System.out.println("\nLa serie con más temporadas es: ");
		System.out.println(matSeries[posicion].toString());
			
			
		
		//Mostrar la película del año más reciente:
		
		int maxaño=0; // variable que guardará el año más reciente (es decir, el año mayor)
		posicion =0; 
		
		for(int k=0;k<5;k++){
			if(matPeliculas[k].getAño()>maxaño){
				maxaño = matPeliculas[k].getAño();
			}
			posicion = k;
		}
				System.out.println("\nLa película del año más reciente es: ");
				System.out.println(matPeliculas[posicion].toString());
			
	}
		
}


	




