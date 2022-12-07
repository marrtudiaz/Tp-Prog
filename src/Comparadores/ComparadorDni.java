package Comparadores;

import java.util.Comparator;

import main.Alumno;

public class ComparadorDni implements Comparator<Alumno>{

		public int compare(Alumno o1, Alumno o2) {
			return o1.getDni() - o2.getDni();
		}

		
}


