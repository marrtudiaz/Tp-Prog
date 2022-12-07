package Comparadores;

import java.util.Comparator;

import main.Alumno;

public class ComparadorApellido implements Comparator<Alumno>{
	
	public int compare(Alumno o1, Alumno o2) {
		return o1.getApellido().compareTo(o2.getApellido());
	}
}

