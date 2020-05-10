package biblioteca;


public class Prestamo {
	
	Cliente cliente;
    Libro libro;
    BaseDatos baseDatos;
    
    
    public Prestamo(Libro libro, Cliente cliente, BaseDatos baseDatos){
        this.cliente = cliente;
        this.libro = libro;
        libro.ejemplares--;
    }

}
