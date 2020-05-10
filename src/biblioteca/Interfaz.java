package biblioteca;

import java.util.Scanner;


public class Interfaz {
	
	public Interfaz(){
    }
    
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
                
        opciones();
        
        int opcion;
        do{ 
           
        opcion = scanner.nextInt();
        scanner.nextLine(); 
        
        
        if (opcion==1){
           
        crearLibro();
        opciones();        
        }
        
        else if(opcion==2){
            
            crearCliente();
            opciones();
        }
        
        else if(opcion==3){
            
            prestarLibro();
            opciones();
        }
                        
        else if(opcion==4){
            
            devolverLibro();
            opciones();
            }
        
        else if (opcion==5){
            
            listadoLibros();
            opciones();
        }
        
        else if (opcion==6){
            
            listadoClientes();
            opciones();
        }
        }
        while(opcion!=7);
        if(opcion==7){
            System.out.println("Gracias por usar la biblioteca");
            }
        }
            
            
    
    public static void opciones(){
        
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido a la biblioteca" + "\nElija una opcion: ");
        System.out.println("1) Agregar un libro");
        System.out.println("2) Agregar clientes");
        System.out.println("3) Prestar un libro a un cliente");
        System.out.println("4) Devolver un libro");
        System.out.println("5) Mostrar listado de libros");
        System.out.println("6) Mostrar listado de clientes");
        System.out.println("7) Salir");
    }
    
    public static void crearLibro(){
        
        Scanner scanner = new Scanner(System.in);
        BaseDatos biblioteca = BaseDatos.getBaseDatos();
        
        System.out.println("Escribe el nombre del libro: ");
        String titulo = scanner.nextLine();
        
        System.out.println("Escribe el nombre del autor");
        String autorLibro = scanner.nextLine();
               
        System.out.println("Escribe la fecha entre comillas");        
        String fecha = scanner.nextLine();
        
        System.out.println("Escribe la categoria");
        String categoria = scanner.nextLine();
        
        System.out.println("Escribe la cantidad de ejemplares");
        int ejemplares = scanner.nextInt();
               
        Libro libro = new Libro(titulo, autorLibro, fecha, categoria, ejemplares, biblioteca);
        
        System.out.println(libro);
        System.out.println(titulo + ", ah sido creado\n");
    }
    
    public static void crearCliente(){
        
        Scanner scanner = new Scanner(System.in);
        BaseDatos biblioteca = BaseDatos.getBaseDatos();
        
        System.out.println("Escriba el nombre del cliente: ");
            String nombre = scanner.nextLine();
            
            System.out.println("Escriba el apellido del cliente: ");
            String apellido = scanner.nextLine();
            
            Cliente cliente = new Cliente(nombre, apellido, biblioteca);
            
            System.out.println(cliente);
            System.out.println(nombre + " ah sido creado\n");
    }
    
    public static void prestarLibro(){
        
        Scanner scanner = new Scanner(System.in);
        BaseDatos baseDatos = BaseDatos.getBaseDatos();
    
        System.out.println("Seleccione el libro que quiere: ");
            String libro = scanner.nextLine();
            
            System.out.println("Seleccione el nombre del cliente");
            String cliente = scanner.nextLine();
            
            for(int i=0; i<baseDatos.libros.size();i++){
                if(libro.equals(baseDatos.libros.get(i).titulo)){
                for(int j=0; j<baseDatos.clientes.size(); j++){
                    if(cliente.equals(baseDatos.clientes.get(j).nombre)){
                        Prestamo prestamo = new Prestamo(baseDatos.libros.get(i), baseDatos.clientes.get(j), baseDatos);
                        baseDatos.prestamos.add(prestamo);
                        System.out.println(libro + ", fue prestado para " + cliente);
                        }
                }       
            }
            }
    }
    
    public static void devolverLibro(){
        Scanner scanner = new Scanner(System.in);
        BaseDatos baseDatos = BaseDatos.getBaseDatos();
        
        System.out.println("Escriba el nombre del cliente que va a devolver el libro");
            String cliente = scanner.nextLine();
            
            System.out.println("Escriba el nombre del libro que va a devolver el cliente");
            String libroPrestado = scanner.nextLine();
            
            for(int i=0; i<baseDatos.clientes.size(); i++){
                if(cliente.equalsIgnoreCase(baseDatos.clientes.get(i).nombre)){
                    for(int j=0; j<baseDatos.libros.size(); j++){
                        if(libroPrestado.equalsIgnoreCase(baseDatos.libros.get(j).titulo)){
                            baseDatos.prestamos.remove(libroPrestado);
                            baseDatos.libros.get(j).ejemplares++;
                            System.out.println(baseDatos.libros.get(j).titulo + " fue devuelto a la biblioteca");
                        }
                    }
                }                    
                }
    }
    
    public static void listadoLibros(){
        
    	BaseDatos biblioteca = BaseDatos.getBaseDatos();
        
        for(int i=0; i<biblioteca.libros.size(); i++){
            System.out.println(biblioteca.libros.get(i));//PORQUE SE REPITE 2 VECES
            }
    }
    
    public static void listadoClientes(){
        
        BaseDatos biblioteca = BaseDatos.getBaseDatos();
        
        System.out.println(biblioteca.clientes);
    }

}
