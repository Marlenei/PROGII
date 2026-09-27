public class Libro {
    private final String titulo;
    private final String autor;
    private final String isbn;
    private int copiasDisponibles;
    private double precioReposicion;

    private static final String sinTitulo = "Sin título";
    private static final String sinAutor = "Autor desconocido";
    private static final String sinISBN = "ISBN pendiente";
    private static final int sinCopias = 0;
    private static final double sinPrecio = 15000.0;

    public Libro(String titulo, String autor, String isbn, int copiasDisponibles, double precioReposicion) {
       if (titulo == null || titulo.isBlank()) {
            System.out.println("Título inválido o vacío. Se asigna valor por defecto");
            this.titulo = sinTitulo;
        } else {
            this.titulo = titulo;
        }
        if (autor == null || autor.isBlank()) {
            System.out.println("Autor inválido o vacío. Se asigna valor por defecto");
            this.autor = sinAutor;
        } else {
            this.autor = autor;
        }
        if (isbn == null || isbn.isBlank()) {
            System.out.println("ISBN invalido o vacio. Se asigna valor por defecto");
            this.isbn = sinISBN;
        } else {
            this.isbn = isbn;
        }
        if (copiasDisponibles < 0) {
            System.out.println("Copias disponibles no puede ser negativo. Se asigna: " + sinCopias);
            this.copiasDisponibles = sinCopias;
        } else {
            this.copiasDisponibles = copiasDisponibles;
        }
        if (precioReposicion>0) {
            this.precioReposicion = precioReposicion;
        } else {
            System.out.println("Precio de reposición inválido. Debe ser mayor a 0. Se asigna valor por defecto: $" + sinPrecio);
            this.precioReposicion = sinPrecio;
        }
    }

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.copiasDisponibles=1;
        this.precioReposicion=sinPrecio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public double getPrecioReposicion() {
        return precioReposicion;
    }

    public boolean setPrecioReposicion(double precio) {
        if (precio>0) {
            this.precioReposicion = precio;
            System.out.println("Precio de reposicion actualizado exitosamente a: $" + precio);
            return true;
        } else {
            System.out.println("No se pudo cambiar el precio, debe ser mayor a 0");
            return false;
        }
    }

    public boolean prestar() {
        if (copiasDisponibles > 0) {
            copiasDisponibles--;
            System.out.println("Prestamo realizado. Copias restantes: " + copiasDisponibles);
            return true;
        } else {
            System.out.println("No hay copias disponibles");
            return false;
        }
    }

    public void devolver() {
        copiasDisponibles++;
        System.out.println("Devolucion exitosa. Copias disponibles: " + copiasDisponibles);
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
