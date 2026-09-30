package poo.semana5;

public class MainEstudiante {
    
    public static void main(String[] args) {
        // crear objeto clase Estudiante
        Estudiante objEstudiante1 = new Estudiante("Andrés", "12324", 36, "Ingeniería de Sistemas");
        Estudiante objEstudiante2 = new Estudiante("Maria", "8918234", 22, "Ingeniería Industrial");
        Estudiante objEstudiante3 = new Estudiante("Miguel", "234027", 18, "Ingeniería de Sistemas");

        // mostrar la información del objeto
        System.out.println(objEstudiante1);
        System.out.println(objEstudiante2);
        System.out.println(objEstudiante3);

        // uso de metodos get y set
        System.out.println("edad de estudiante 1: " + objEstudiante1.getEdad());// 36
        System.out.println("edad de estudiante 2: " + objEstudiante2.getEdad());//22
        System.out.println("edad de estudiante 3: " + objEstudiante3.getEdad());//18

        //cambiar el nombre del objeto objEstudiante2
        System.out.println("antes del cambio: " + objEstudiante2.getNombre());
        objEstudiante2.setNombre("María Isabel");
        System.out.println("despues del cambio: " + objEstudiante2.getNombre()); // María Isabel

        // cambiar el nombre del programa del objEstudiante2
        objEstudiante2.setPrograma("Ingeniería de Sistemas");
        System.out.println(objEstudiante2);
        // validar que la edad sea mayor o igual a 0
        objEstudiante1.setEdad(-1);
        objEstudiante1.setEdad(35);
        System.out.println(objEstudiante1);
        // validar el nombre no sea vacio
        objEstudiante1.setNombre(null);
        System.out.println(objEstudiante1);
        objEstudiante1.setNombre("");// muestra msj de no poder modificar
        objEstudiante1.setNombre("    "); // muestra msj de no poder modificar
        objEstudiante1.setNombre("Juan");
        System.out.println(objEstudiante1);
        

    }
}
