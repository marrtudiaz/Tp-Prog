package main;

import java.util.ArrayList;

public class Alumno extends ElementoUniversidad  {
	private String apellido;
	private int dni;
	private int edad;
	private ArrayList<String> intereses;
	
	public Alumno(String nombre, String apellido, int dni, int edad) {
		super(nombre);
		this.apellido = apellido;
		this.dni = dni;
		this.edad=edad;
		this.intereses = new ArrayList<String>();
	}
	public Alumno(String nombre, String apellido, int dni) {
		super(nombre);
		this.apellido = apellido;
		this.dni = dni;
		this.intereses = new ArrayList<String>();
	}
	
	public String getApellido() {
		return apellido;
	}

	public int getDni() {
		return dni;
	}
	
	public int getEdad() {	
		return edad;
	}
	
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	
	public void setDni(int dni){
		this.dni=dni;
	}
	
	public void setEdad(int edad){
		this.edad=edad;
	}
	
	
	
	public void addInteres(String interes) {
		if(!existeInteres(interes)){
			intereses.add(interes);
		}
	}
	
	public ArrayList<String> getIntereses(){
		return new ArrayList<String>(intereses);
	}
	
	 public boolean existeInteres(String s){
	    	return intereses.contains(s);
	    }
	
	
	public int getCantidadAlumnos() {
		return 1;
	}
	
	public boolean equals(Object o) {
		try {
			Alumno a = (Alumno)o;
			return this.getDni() == a.getDni();
			
		} catch(Exception e) {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + this.getNombre() + ", apellido=" + this.apellido + ", dni=" + this.dni + ", intereses=" + this.getIntereses()
				+ "]";
	}

	
	
	
}
