package poo.semana5;

public class Libro {
    
    private int isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    public Libro(int isbn, String titulo, String autor, int anioPublicacion, boolean disponible){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
    }

    public int getIsbn(){
        return this.isbn;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }

    public int getAnioPublicacion(){
        return this.anioPublicacion;
    }
    public boolean isDisponible(){
        return this.disponible;
    }

    public void setIsDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public 
}
