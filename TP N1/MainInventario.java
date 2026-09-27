public class MainInventario {
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.codigo= "ASD123";
        producto1.nombre="Lata durazno";
        producto1.precio=30.00;
        producto1.stock=2;

        producto1.venderUnidades(1);
        producto1.mostrarFicha();
        producto1.reponerStock(5);
        producto1.actualizarPrecio(22.00);
        producto1.mostrarFicha();
    }

}
