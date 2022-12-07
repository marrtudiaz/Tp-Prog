package main;



import Comparadores.ComparadorApellido;
import Comparadores.ComparadorDni;
import Comparadores.ComparadorMultiple;
import Comparadores.ComparadorNombre;


public class mainAlumno {
	public static void main(String[] args) {
		
		ComparadorApellido comparadorApellido = new ComparadorApellido();		
		ComparadorNombre comparadorNombre = new ComparadorNombre();
		ComparadorDni comparadorDni = new ComparadorDni();
		ComparadorMultiple comparadorMultiple = new ComparadorMultiple(comparadorApellido,comparadorNombre);
		ComparadorMultiple compMultiple = new ComparadorMultiple(comparadorMultiple,comparadorDni);
		
		
		ListaVinculada<Alumno> listaAlumnos = new ListaVinculada<Alumno>(compMultiple);
		
		Alumno alumno1 = new Alumno("John", "Doe", 12000000);
		Alumno alumno2 = new Alumno("Federico", "Lopez", 35999888);
		Alumno alumno3 = new Alumno("Juana", "Garcia", 27123455);
		Alumno alumno4 = new Alumno("Mora", "Diaz", 37124425);
		Alumno alumno5 = new Alumno("Flora", "Rivas", 34555111);
		Alumno alumno6 = new Alumno("Martin", "Gomez", 34111222);
		Alumno alumno7 = new Alumno("Roman", "Bazan", 32555111);
		Alumno alumno8 = new Alumno("Juan", "Juarez",33222444);
		Alumno alumno9 = new Alumno("Juan","Juarez" , 33222111);
		
		
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
		
		
		
		listaAlumnos.insertarOrdenado(alumno1);
		listaAlumnos.insertarOrdenado(alumno2);
		listaAlumnos.insertarOrdenado(alumno3);	
		listaAlumnos.insertarOrdenado(alumno5);
		listaAlumnos.insertarOrdenado(alumno4);
		listaAlumnos.insertarOrdenado(alumno6);
		listaAlumnos.insertarOrdenado(alumno7);
		listaAlumnos.insertarOrdenado(alumno8);
		listaAlumnos.insertarOrdenado(alumno9);
		
		
		System.out.println("\n");
		for(Alumno a : listaAlumnos){
			System.out.println(a +" ");
		}
	
	
	}
	
}