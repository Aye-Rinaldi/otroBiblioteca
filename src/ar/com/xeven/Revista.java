package ar.com.xeven;

public class Revista extends Publicacion {
    //atrib
    private int numero;

    //constructor
    public Revista(String isbn, String titulo, String anioPublicacion, int numero) {
        super(isbn, titulo, anioPublicacion);
        this.numero = numero;
    }
}
