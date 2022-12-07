package main;

import java.util.ArrayList;

public class GrupoUniversitario extends ElementoUniversidad{

	private ArrayList<ElementoUniversidad> elementos;
	
	
	public GrupoUniversitario(String nombre) {
		super(nombre);
		elementos = new ArrayList<>();
	}
	
	public void addElemento(ElementoUniversidad e) {
		if(!tieneElemento(e)) {
			elementos.add(e);
		}
	}
	
	
	public boolean tieneElemento(ElementoUniversidad e){
		return elementos.contains(e);
	}
	

	public int getCantidadAlumnos() {
		int cantidad = 0;
		for(ElementoUniversidad e : elementos) {
			cantidad += e.getCantidadAlumnos();
		}
		return cantidad;
	}
	
	public boolean equals(Object o) {
		try {
			GrupoUniversitario grupo = (GrupoUniversitario)o;
			return this.getNombre().equals(grupo.getNombre());
			
		} catch(Exception e) {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Grupo " + this.getNombre()+ this.elementos;
	}
}

