package taller;

import java.util.Arrays;
import java.util.Date;

public class Pedido {
    
    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;
    
    public Pedido(Cliente cliente, Producto[] productos, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void mostrarPedido(){
        System.out.println("\t----Detalles del pedido:----");
        System.out.println(cliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Número de Tarjeta: " + numeroTarjetaCredito);
        System.out.println("Cantidad de productos: " + productos.length);
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Número de producto: " + productos[i].getNumero());
        }
    }

    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente + ", productos=" + Arrays.toString(productos) + ", fecha=" + fecha
                + ", numeroTarjetaCredito=" + numeroTarjetaCredito + "]";
    }

    
}
