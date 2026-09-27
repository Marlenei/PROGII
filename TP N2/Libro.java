public class Libro {
    private final String titulo;
    private final String autor;
    private final String isbn;
    private int copiasDisponibles;
    private double precioReposicion;

    public Libro(String titulo, String autor, String isbn, int copiasDisponibles, double precioReposicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.copiasDisponibles = copiasDisponibles;
        this.precioReposicion = precioReposicion;
    }

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public boolean prestar() { 
        if(copiasDisponibles>0) return true;
        
        return false;
    }
    public void devolver() { 
        copiasDisponibles =+ 1;
        System.out.println("Libro devuelto");
     }
    public boolean setPrecioReposicion(double precio) {
        precioReposicion = precio;
        return true;
    }
    public void mostrarFicha() { 
            System.out.println("_________________________________\n");
            System.out.println("Ficha de producto:");
            System.out.println("\nAutor: "+this.autor);
            System.out.println("\nTitulo: "+this.titulo);
            System.out.println("\nISBN: "+this.isbn);
            System.out.println("\nPrecio: "+this.precioReposicion);
            System.out.println("\nCopias:"+this.copiasDisponibles);
            System.out.println("_________________________________\n");
    }
}
