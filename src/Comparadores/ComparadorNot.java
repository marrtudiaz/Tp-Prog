package Comparadores;

import java.util.Comparator;

public class ComparadorNot<T> implements Comparator<T>{
	private Comparator<T>c1;
	public ComparadorNot(Comparator<T>c1){
		this.c1=c1;
	}
	@Override
	public int compare(T a1, T a2) {
		return this.c1.compare(a1, a2)*-1;
	}
	
}