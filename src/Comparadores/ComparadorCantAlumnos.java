package Comparadores;

import java.util.Comparator;

import main.ElementoUniversidad;

public class ComparadorCantAlumnos implements Comparator<ElementoUniversidad>{

	@Override
	public int compare(ElementoUniversidad e1, ElementoUniversidad e2) {
		return (e1.getCantidadAlumnos())-(e2.getCantidadAlumnos());
	}
	
}