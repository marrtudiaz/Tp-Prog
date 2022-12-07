package main;



import Comparadores.ComparadorCantAlumnos;
import Comparadores.ComparadorInt;
import Comparadores.ComparadorInverso;
import Comparadores.ComparadorString;

public class main {
	public static void main(String[] args) {
		System.out.println("Puntos a y b, se crea una lista de numeros, se recorren y se imprimen");
		
		ComparadorInt comparadorInt =new ComparadorInt();
		
		ListaVinculada <Integer> listaInteger = new ListaVinculada(comparadorInt);
		
		Integer elemento10 =10;
		Integer elemento21 =21;
		Integer elemento1 =1;
		Integer elemento5=5;
		Integer elemento11=11;
		
		listaInteger.insertarOrdenado(elemento10);
		listaInteger.insertarOrdenado(elemento21);
		listaInteger.insertarOrdenado(elemento1);
		listaInteger.insertarOrdenado(elemento5);
		listaInteger.insertarOrdenado(elemento11);
		
		for(Integer i: listaInteger){
			System.out.println(i+" ");
		}
		
		System.out.println("\n");
		System.out.println("Se elimina el primer elemento de la lista (por posición)");
		listaInteger.eliminarEnPos(0);
		for(Integer i: listaInteger){
			System.out.println(i+" ");
		}
		
		System.out.println("\n");
		System.out.println("Luego eliminar el elemento 5 y 11 ");
		listaInteger.eliminarOCurrencias(elemento5);
		listaInteger.eliminarOCurrencias(elemento11);
		for(Integer i: listaInteger){
			System.out.println(i+" ");
		}
		
		System.out.println("\n");
		System.out.println("Se crea la lista de strings mostrada en la figura 2 del punto 1, se recorre la lista creada y se imprimeen los valores por consola");
		ComparadorString comparadorString =new ComparadorString();
		ListaVinculada <String> listaString = new ListaVinculada(comparadorString);
		
		String e1= "Fácil";
		String e2= "Es";
		String e3= "Parcial";
		String e4= "Prog2";
		
		listaString.insertarOrdenado(e1);
		listaString.insertarOrdenado(e2);
		listaString.insertarOrdenado(e3);
		listaString.insertarOrdenado(e4);
		
		for(String s: listaString){
			System.out.println(s+" ");
		}
		System.out.println("\n");
		System.out.println("Imprimir por consola en qué posición se encuentra la palabra “Parcial”.");
		System.out.println("\n");
		System.out.println("La palabra "+e3+" se encuentra en la posicion: \n"+ listaString.getPosicion(e3));
		
		String recu= "recuperatorio";
		System.out.println("\n");
		System.out.println("Imprimir por consola en qué posición se encuentra la palabra “Recuperatorio”");
		System.out.println("La palabra "+recu+" se encuentra en la posicion: \n"+ listaString.getPosicion(recu));
		
		System.out.println("\n");
		System.out.println("Se cambie el orden de la lista de strings para que los elementos queden ordenados descendentemente.");
		ComparadorInverso comparadorInverso =new ComparadorInverso(comparadorString);
		
		listaString.setComparator(comparadorInverso);
		System.out.println("\n");
		for(String s: listaString){
			System.out.println(s+" ");
		}
		
		
		
		ComparadorCantAlumnos comparadorCantAlumnos = new ComparadorCantAlumnos();
		ComparadorInverso compInverso = new ComparadorInverso(comparadorCantAlumnos);
		
		
		ListaVinculada<ElementoUniversidad> listaPuntoI = new ListaVinculada<ElementoUniversidad>(comparadorCantAlumnos);
		listaPuntoI.setComparator(compInverso);
		
		Alumno alumno1 = new Alumno("John", "Doe", 12000000);
		Alumno alumno2 = new Alumno("Federico", "Lopez", 35999888);
		Alumno alumno3 = new Alumno("Juana", "Garcia", 27123455);
		Alumno alumno4 = new Alumno("Mora", "Diaz", 37124425);
		Alumno alumno5 = new Alumno("Flora", "Rivas", 34555111);
		Alumno alumno6 = new Alumno("Martin", "Gomez", 34111222);
		Alumno alumno7 = new Alumno("Roman", "Bazan", 32555111);
		Alumno alumno8 = new Alumno("Juan", "Juarez",33222444);
		Alumno alumno9 = new Alumno("Julio","Cesar" , 33222111);
		Alumno alumno10 = new Alumno("Bernardino", "Rivas", 30987654);
		Alumno alumno11 = new Alumno("José", "Paso", 33322112);
		Alumno alumno12 = new Alumno("Isaac", "Newton", 12343565);
		
		alumno1.addInteres("intercambio");
		alumno2.addInteres("redes");
		alumno2.addInteres("php");
		alumno2.addInteres("java");
		alumno2.addInteres("Python");
		alumno3.addInteres("programacion");
		alumno3.addInteres("php");
		alumno3.addInteres("java");
		alumno4.addInteres("psicologia");
		alumno4.addInteres("Freud");
		alumno5.addInteres("historia");
		alumno5.addInteres("antigua");
		alumno6.addInteres("romanos");
		alumno6.addInteres("egipcios");
		alumno6.addInteres("griegos");
		alumno7.addInteres("argentina");
		alumno8.addInteres("sucesiones");
		alumno8.addInteres("algebra");
		alumno9.addInteres("sucesiones");
		alumno9.addInteres("algebra");
		alumno10.addInteres("matematicas");
		alumno11.addInteres("problemas");
		alumno12.addInteres("sucesiones");
		
		System.out.println("\n");
		System.out.println("PUNTO I");
		
		GrupoUniversitario historia = new GrupoUniversitario("Historia");
		GrupoUniversitario humanas = new GrupoUniversitario("Humanas");
		GrupoUniversitario exactas = new GrupoUniversitario("Exactas");
		GrupoUniversitario unicen = new GrupoUniversitario("Unicen");
		GrupoUniversitario olimpiadasMatematicas = new GrupoUniversitario("OlimpiadasMatematicas");
		GrupoUniversitario losFibo = new GrupoUniversitario("LosFibo");
		GrupoUniversitario matea2 = new GrupoUniversitario("Matea2");
		
		
		historia.addElemento(alumno5);
		historia.addElemento(alumno6);
		historia.addElemento(alumno7);
		
		
		humanas.addElemento(historia);
		humanas.addElemento(alumno4);
		
		
		exactas.addElemento(alumno2);
		exactas.addElemento(alumno3);
		
		
		unicen.addElemento(exactas);
		unicen.addElemento(humanas);
		unicen.addElemento(alumno1);

		
		losFibo.addElemento(alumno10);
		losFibo.addElemento(alumno11);
		losFibo.addElemento(alumno12);
		
		
		matea2.addElemento(alumno8);
		matea2.addElemento(alumno9);

		
		olimpiadasMatematicas.addElemento(matea2);
		olimpiadasMatematicas.addElemento(losFibo);
	
		
		listaPuntoI.insertarOrdenado(olimpiadasMatematicas);
		listaPuntoI.insertarOrdenado(unicen);
		
		
		System.out.println("\n");
		for(ElementoUniversidad l : listaPuntoI){
			System.out.println(l +"\n");
		}
	}		
}
