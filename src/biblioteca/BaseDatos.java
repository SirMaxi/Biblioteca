package biblioteca;

import java.util.ArrayList;

public class BaseDatos {
	
	ArrayList<Libro> libros = new ArrayList<Libro>();
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();  
	    
	private static BaseDatos baseDatos;

	private BaseDatos(){
	    
	}

	public static BaseDatos getBaseDatos(){
	    if(baseDatos == null){
	        baseDatos = new BaseDatos();
	    }
	    return baseDatos;
	}


	    public void listadoClientes(){
	        System.out.println("Listado de clientes:");
	        for(int i=0; i<clientes.size(); i++){
	            System.out.println((i+1) + ") " + clientes.get(i).nombre + "," + clientes.get(i).apellido);
	        }
	    }
	        
	    public void listaLibrosCliente(){
	        System.out.println("\nListado de libros prestados por cliente: ");
	        for(int i=0; i<clientes.size(); i++){
	            System.out.println(prestamos);
	        }
	    }
	    public void listadoLibrosPrestados(){
	        System.out.println("\nListado de los libros ya prestados: ");
	        for(int i=0; i<libros.size(); i++){
	            System.out.println(libros.get(i).ejemplares + " - " + libros.get(i).titulo);
	        }
	    }
	    public void listarLibrosQueContengan(String palabra){
	        for(int i=0; i<libros.size(); i++){
	            Libro libro = libros.get(i);
	            if (libro.titulo.contains(palabra)){
	                System.out.println(libro.titulo);
	            }
	    }    
	}
	    public void devolverLibro(Cliente cliente, Libro libroPrestado, BaseDatos baseDatos){
	        prestamos.remove(libroPrestado);
	        libroPrestado.ejemplares++;
	    }

}
