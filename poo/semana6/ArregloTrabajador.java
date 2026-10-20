package semana6;

public class ArregloTrabajador {    
    public static void main(String[] args) {
        Trabajador[] trabajadores = new Trabajador[3];
        trabajadores[0] = new Trabajador(1234, "Andres", 1000d);
        trabajadores[1] = new Operario(1235, "Santiago", 2000d, 120);
        trabajadores[2]= new Vendedor(1236, "Jonyer", 2000d, 21.52);

        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println("Salario a pagar a: "+ trabajadores[i].getNombre() + " es: " + trabajadores[i].pagar());
        }
    }
}
