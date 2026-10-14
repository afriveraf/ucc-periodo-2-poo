package poo.taller;

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

    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente + ", productos=" + Arrays.toString(productos) + ", fecha=" + fecha
                + ", numeroTarjetaCredito=" + numeroTarjetaCredito + "]";
    }

    
}
