package poo.semana6;

public class ArregloTrabajador {
    public static void main(String[] args) {
        Trabajador[] trabajadores = new Trabajador[3];
        trabajadores[0] = new Trabajador(1234, "Andres", 1000d);
        trabajadores[1] = new Trabajador(1235, "Santiago", 2000d);
        trabajadores[2]= new Trabajador(1236, "Jonyer", 1500d);

        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println("Salario a pagar a: "+ trabajadores[i].getNombre() + " es: " + trabajadores[i].pagar());
        }
    }
}
