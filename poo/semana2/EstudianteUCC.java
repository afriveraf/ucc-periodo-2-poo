package semana2;

public class EstudianteUCC {

    // atributos
    private int id;
    private int cedula;
    private String nombres;
    private String apellidos;
    private int edad;
    private double estatura;

    // constructor: el metodo constructor se reconoce por tener el mismo nombre de
    // la clase
    public EstudianteUCC(int id, int cedula, String nombres, 
                        String apellidos, int edad, double estatura) {
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String toString() {
        return "EstudianteUCC{" + "id:" + id +
                ", cedula:" + cedula + ", nombres:" + nombres +
                ", apellidos:" + apellidos + ", edad:" + edad + ", estatura:" + estatura +
                '}';
    }

}
