package main;

public abstract class ElementoUniversidad {
		private String nombre;
	
		public ElementoUniversidad(String nombre){
			this.nombre=nombre;
		}
			
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre){
			this.nombre=nombre;
		}
		
		public abstract int getCantidadAlumnos();
}
