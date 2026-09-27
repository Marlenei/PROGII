public class Producto{
    public String nombre;
    public String codigo;
    public double precio;
    public int stock;

    public void venderUnidades(int cantidad) { 
        if (cantidad>0 && cantidad<= stock){
            stock = stock - cantidad;
            System.out.println("Venta exitosa");
        }else if(cantidad<1){
            System.out.println("La cantidad debe ser mayor a 0");
        }else{
            System.out.println("No hay stock");
        }
     }
    public void reponerStock(int cantidad) { 
        if (cantidad>0){
            stock = stock + cantidad;
            System.out.println("Carga exitosa");
        }else{
            System.out.println("El valor debe ser positivo");
        }
     }
    public void actualizarPrecio(double precio) { 
        if(precio>0){
            this.precio = precio;
            System.out.println("Precio modificado exitosamente");
        }else{
            System.out.println("Precio no fue modificado, debe ser mayor a 0");
        }
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