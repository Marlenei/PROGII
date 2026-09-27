public class Producto{
    public String nombre;
    public String codigo;
    public double precio;
    public int stock;

    public void venderUnidades(int cantidad) { 
        if (cantidad>0 && cantidad<= stock){
            stock = stock - cantidad;
            System.out.println("Venta exitosa");
        }
     }
    public void reponerStock(int cantidad) { 
        if (cantidad>0){
            stock = stock + cantidad;
            System.out.println("Carga exitosa");
        }
     }
    public void actualizarPrecio(double precio) { 
        this.precio = precio;
     }
    public void mostrarFicha() { 
            System.out.println("_________________________________\n");
            System.out.println("Ficha de producto:");
            System.out.println("\nCodigo: "+this.codigo);
            System.out.println("\nNombre: "+this.nombre);
            System.out.println("\nPrecio: "+this.precio);
            System.out.println("\nStock:"+this.stock);
            System.out.println("_________________________________\n");
     }
}