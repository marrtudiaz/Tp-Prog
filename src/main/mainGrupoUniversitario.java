package main;

import Comparadores.ComparadorCantAlumnos;

public class mainGrupoUniversitario {
	public static void main(String[] args) {
		
		
		
		GrupoUniversitario grupo1 = new GrupoUniversitario("exactas");
		GrupoUniversitario grupo2 = new GrupoUniversitario("economicas");
		GrupoUniversitario grupo3 = new GrupoUniversitario("matematicas");
		
		Alumno alumno1 = new Alumno("John", "Doe", 12000000);
		Alumno alumno2 = new Alumno("Federico", "Lopez", 35999888);
		Alumno alumno3 = new Alumno("Juana", "Garcia", 27123455);
		Alumno alumno4 = new Alumno("Mora", "Diaz", 37124425);
		Alumno alumno5 = new Alumno("Flora", "Rivas", 34555111);
		grupo1.addElemento(alumno1);
		grupo1.addElemento(grupo3);
		grupo2.addElemento(alumno2);
		grupo2.addElemento(alumno3);
		grupo3.addElemento(alumno4);
		grupo3.addElemento(alumno5);
		
		ComparadorCantAlumnos compCantAlumnos = new ComparadorCantAlumnos();
		ListaVinculada<GrupoUniversitario> listaGrupo = new ListaVinculada(compCantAlumnos);
		
		listaGrupo.insertarOrdenado(grupo1);
		listaGrupo.insertarOrdenado(grupo2);
		
		System.out.println("\n");
		for(GrupoUniversitario a : listaGrupo){
			System.out.println(a +" ");
		}
		
		
		
		
		
		
		
		
		
	}

}
