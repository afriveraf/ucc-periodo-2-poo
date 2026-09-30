package poo.semana5;

public class Estudiante {

    // atributos
    private String nombre;
    private String documento;
    private int edad;
    private String programa;

    // constructores
    public Estudiante() {
    }

    public Estudiante(String nombre, String documento, int edad, String programa) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.programa = programa;
    }

    // getters and setters
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        if(nombre == null || nombre.trim().equals("")){
            System.out.println("No se puede modificar el valor con una cadena vacia");
        } else {
            this.nombre = nombre;
        }
    }

    public String getDocumento(){
        return this.documento;
    }

    public void setDocumento(String documento){
        this.documento = documento;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        if(edad >= 0){
            this.edad = edad;
        } else{
            System.out.println("La edad debe ser igual o mayor a 0");
        }
    }

    public String getPrograma(){
        return this.programa;
    }

    public void setPrograma(String programa){
        this.programa = programa;
    }

    // toString
    public String toString(){
        return "Estudiante [nombre: " + this.nombre + ", documento: " + this.documento + ", edad: " + this.edad + ", programa: " + this.programa + " ]";
    }

}
