package main;
import java.util.Iterator;


public class MiIterator<T> implements Iterator<T> {
	private Nodo<T> cursor;
	
	
	public MiIterator(Nodo<T> cursor){
		this.cursor=cursor;
	}
	
	@Override
	public boolean hasNext() {
		return this.cursor!=null;
	}

	@Override
	public T next() {
		T valor =  cursor.getValor();
		cursor = cursor.getSiguiente();
		return valor;
	}

}
