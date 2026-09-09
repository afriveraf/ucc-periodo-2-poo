package semana2;

public class EjecutarEstudianteUCC {
    public static void main(String[] args){
        // creación del objeto ObjEstudiante1 que se crea a partir de la clase EstudianteUCC
        EstudianteUCC objEstudianteUCC1 = new EstudianteUCC(1, 1234, "Andres Felipe", "Rivera", 35, 1.70);
        EstudianteUCC objEstudianteUCC2 = new EstudianteUCC(2, 1235, "Valery", "Sanchez", 28, 1.65);
        System.out.println(objEstudianteUCC1);
        System.out.println(objEstudianteUCC2);
    }
}
