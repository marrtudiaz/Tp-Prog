package Comparadores;

import java.util.Comparator;

public class ComparadorMultiple<T> implements Comparator<T>{
	private Comparator<T>c1;
	private Comparator<T>c2;
	public ComparadorMultiple(Comparator<T>c1, Comparator<T>c2){
		this.c1=c1;
		this.c2=c2;
	}
	@Override
	public int compare(T a1, T a2) {
		int res1 = this.c1.compare(a1, a2);
		if(res1==0){
			return this.c2.compare(a1,a2);
		}
		return res1;
	}
	
}

