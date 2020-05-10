package biblioteca;


public class Cliente {
	
	String nombre;
    String apellido;
    BaseDatos baseDatos;
    
    
    public Cliente(String nombre, String apellido, BaseDatos baseDatos){
        this.nombre = nombre;
        this.apellido = apellido;
        baseDatos.clientes.add(this);
        
    }
    
    @Override
    public String toString(){
        return "\nNombre: " + nombre + "\nApellido: " + apellido;
    }

}
