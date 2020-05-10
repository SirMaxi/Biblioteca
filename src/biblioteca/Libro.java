package biblioteca;


public class Libro {
	
	String titulo;
    String fecha;
    String autorLibro;
    String categoria;
    int ejemplares;
    BaseDatos baseDatos;
   
  public Libro(String titulo, String autorLibro,String fecha, String categoria, int ejemplares, BaseDatos baseDatos){
        this.titulo = titulo;
        this.autorLibro = autorLibro;
        this.fecha = fecha;
        this.ejemplares = ejemplares;
        this.categoria = categoria;
        baseDatos.libros.add(this);
    }
    
    @Override
    public String toString(){
        return "Libro: " + titulo + "\nAutor: " + autorLibro + "\nFecha del libro: " + fecha + "\nCategoria: " + categoria + "\nEjemplares: " + ejemplares + "\n";
    }

}
