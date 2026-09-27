public class MainBiblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Harry Potter 1", "J. K. Rowling","SDF456", 5,30.00);
        Libro libro2 = new Libro("Harry Potter 2", "J. K. Rowling","BKI278");
        
        libro2.mostrarFicha();
        
        boolean prestado = libro1.prestar();
        if(prestado){
            System.out.println("Libro prestado!");
        }else{
            System.out.println("No hay copias disponibles para prestar!");
        }
        libro1.devolver();
        boolean precioRepo = libro1.setPrecioReposicion(45.00);
        if(precioRepo){
            System.out.println("Precio actualizado");
        }else{
            System.out.println("No se pudo actualizar el precio!");
        }
        libro1.mostrarFicha();
    }
}
