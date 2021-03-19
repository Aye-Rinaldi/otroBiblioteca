package ar.com.xeven;

public class Publicacion {
    //atr
    private  String isbn;
    private  String titulo;
    private  String anioPublicacion;

    //constructor
    public Publicacion(String isbn, String titulo, String anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    //toString

    @Override
    public String toString() {
        return "ISBN: "+isbn+", titulo: "+titulo+
                ", año de publicacion: "+anioPublicacion;
    }
}
