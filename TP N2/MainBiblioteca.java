public class MainBiblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Harry Potter 1", "J. K. Rowling","SDF456", 5,30.00);
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
            System.out.println("Libro prestado!");
        }
        libro1.mostrarFicha();
    }
}
