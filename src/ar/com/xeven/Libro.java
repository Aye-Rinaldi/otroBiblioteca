package ar.com.xeven;

public class Libro extends Publicacion implements Prestable{
    //atrib
    private Boolean prestado=false;

    //constructor
    public Libro(String isbn, String titulo, String anioPublicacion) {
        super(isbn, titulo, anioPublicacion);
    }

    //metodos
    @Override
    public void presta() {
        if (this.prestado)
            System.out.println("Ese libro ya esta prestado");
        else
            this.prestado = true; //lo presta
    }

    @Override
    public void devuelve() {
        this.prestado = false;
    }

    @Override
    public Boolean estaPrestado() {
        return this.prestado;
    }

    @Override
    public String toString() {
        return super.toString()+" ("+(this.prestado ? "prestado" : "no prestado")+ ")";
    }
}
