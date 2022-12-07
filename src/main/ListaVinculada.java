package main;
import java.util.Comparator;
import java.util.Iterator;


public class ListaVinculada<T> implements Iterable<T>{
	private Nodo<T> primerNodo;
	private Comparator<T> orden;
	private int size;
	
	
	public ListaVinculada(Comparator<T> orden){
		this.primerNodo=null;
		this.orden=orden;
		this.size=0;
	}
		
	public Nodo<T> getPrimerNodo(){
		return primerNodo;
	}
	public void setPrimerNodo(Nodo<T> primerNodo){
		this.primerNodo=primerNodo;
	}
	
	public boolean estaVacia() {
		return this.primerNodo == null;
	}
	
	private void ordenar(){
		Nodo<T> aux= this.primerNodo;
		this.primerNodo=null;
		while(aux!=null){
			this.insertarOrdenado(aux.getValor());
			aux=aux.getSiguiente();
		}
	}

	public int getSize() {
		return this.size;
	}
	
	 public void setComparator(Comparator<T> orden){
		 this.orden=orden;
		 this.reordenar();
	 }
	//Insertar un nuevo elemento en la estructura. SI
		public void insertarOrdenado(T nuevo){
			Nodo<T> n= new Nodo<T>(nuevo);
			if(this.primerNodo==null){
				this.primerNodo= n;
			}else{
				Nodo<T> anterior=null;
				Nodo<T> temp=this.primerNodo;
				while(temp!=null && orden.compare(temp.getValor(), nuevo) <0){
					anterior=temp;
					temp=temp.getSiguiente();
				}
				if(temp==null && anterior!=null){
					anterior.enlazarSiguiente(n);
					
				}else{
					n.enlazarSiguiente(temp);
					if(temp==this.primerNodo){
						this.primerNodo=n;
					}else{
						anterior.enlazarSiguiente(n);
					}
				}
			}
			this.size++;
		}
		
		//Eliminar un elemento de la estructura dado una posición.SI
		
		public void eliminarEnPos (int index){
	        if(this.estaVacia()||(index<0||index>= this.getSize())){
	        	return;
	        }
	        else if(index==0){
	        	this.eliminarPrimerNodo();
	        	size--;
	        	return;      	
	        }else{
	        	int contador=0;
	        	Nodo<T> temp=primerNodo;
	        	while(contador<index-1){
	        		temp=temp.getSiguiente();
	        		contador++;
	        	}
	        	temp.enlazarSiguiente(temp.getSiguiente().getSiguiente());
	        	size--;
	        }
	         
	    }
	
	
	//Eliminar todas las ocurrencias de un elemento de la estructura dado el elemento. SI
	public void eliminarOCurrencias(T obj){
		if(this.estaVacia()){
			return;
		}
		Nodo<T> p = this.primerNodo;
		Nodo<T> anterior= null;
		while(p.getValor().equals(obj)&&p!=null){
			primerNodo=primerNodo.getSiguiente();
			this.size--;
			p=p.getSiguiente();
		}
		if(p!=null){
			anterior=p;
			p=anterior.getSiguiente();
		}else{
			primerNodo=null;
		}
		while(p!=null){
			if(p.getValor().equals(obj)){
				anterior.enlazarSiguiente(p.getSiguiente());
				p=p.getSiguiente();
				this.size--;
			}else{
				anterior=p;
				p=p.getSiguiente();
			}
		}
	
	}
		
	
	//Obtener la posición de la primera ocurrencia de un elemento dado.
	
	public int getPosicion(T valor) {
		int pos = 0;
		if(primerNodo== null) {
			return -1;
		}	
		Nodo<T> temp=primerNodo;
		while(pos<this.getSize()&&temp!=null){
			if(temp.getValor().equals(valor)){
				return pos;
			}else{
				temp=temp.getSiguiente();
				pos++;
			}
		}return -1;
	}
	
	public void eliminarPrimerNodo(){
		if(estaVacia())
			return;
		else{
			primerNodo=primerNodo.getSiguiente();
		}
	}
	
	
	//SI Permitir cambiar la forma en la que se ordenan los elementos (con el subsecuente reordenamiento de los elementos ya almacenados.
	private void reordenar(){
		Nodo<T> aux=this.primerNodo;
		this.primerNodo=null;
		while(aux!=null){
			this.insertarOrdenado(aux.getValor());
			aux=aux.getSiguiente();
		}
	}
	
	public Nodo<T> obtenerNodo(int pos){
		if(this.estaVacia()||pos<0||pos>=this.getSize()){
			return null;
		}else{
			int contador=0;
			Nodo<T> elQueBusco= primerNodo;
			while(contador<pos){
				elQueBusco=elQueBusco.getSiguiente();
				contador++;
			}
			return elQueBusco;
		}
	}
	
	//Un mecanismo que permita recorrer uno a uno los elementos de la lista.
	public void imprimirLista() {
		MiIterator<T> it = new MiIterator<T>(this.getPrimerNodo());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	//en vez de lo de arriba de imprimir, el imprimir iria en el main for(Integer i:elementosInteger) hace andar eso en el main
	

	@Override
	public Iterator<T> iterator() {
		return new MiIterator<T>(this.primerNodo);
	}

	

	
	
	
	
	
	
	
	
	

}
