package main;

public class Nodo<T> {
	private T valor;
	private Nodo<T> siguiente;
	
	
	public Nodo (T valor){
		this.valor=valor;
		this.siguiente=null;
	}
	
	public void setSiguiente(Nodo<T> siguiente){
		this.siguiente=siguiente;
		
	}
	public Nodo<T> getSiguiente() {
		return this.siguiente;
	}
	
	public T getValor(){
		return valor;

	}
	public void setValor(T valor){
		this.valor=valor;
	}
	
	public boolean tieneSiguienteNodo() {
		return this.getSiguiente() != null;
	}
	
	
	public void enlazarSiguiente(Nodo<T> n ){
		siguiente=n;

		}


}