package biblioteca;

import java.util.ArrayList;


public class Autor {
	
	String nombre;
    String apellido;
    String nacionalidad;
    String fecha;
    ArrayList<Libro> librosEscritos = new ArrayList<Libro>();
    
    public Autor (String nombre, String apellido, String nacionalidad, String fecha){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    @Override
    public String toString(){
        return "\nNombre y apellido del autor: " + nombre + ", " + apellido + "\nNacionalidad: " + nacionalidad + "\nFecha de nacimiento: " + fecha;
    }

}
