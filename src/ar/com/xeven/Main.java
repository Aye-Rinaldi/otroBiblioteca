package ar.com.xeven;

/*
 Se quiere informatizar una biblioteca.
Las características comunes de las revistas y de los libros son el código ISBN, el
título, y el año de publicación. Los libros tienen además un atributo prestado.
Cuando se crean los libros, no están prestados. Las revistas tienen un número.
 */

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("123456","La Ruta Prohibida","2007");
        Libro libro2 = new Libro("789101","Los Otros","2016");
        Libro libro3 = new Libro("123456","La Ruta Prohibida","2007");
        Revista revista1 = new Revista("444555","Año Cero","2019",344);
        Revista revista2 = new Revista("002244","National Geographic","2003",255);
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(revista1);
        System.out.println(revista2);
        libro2.presta();
        if (libro2.estaPrestado())
            System.out.println("El libro esta prestado");
        libro2.presta();
        libro2.devuelve();
        if (libro2.estaPrestado())
            System.out.println("El libro esta prestado");
        libro3.presta();
        System.out.println(libro2);
        System.out.println(libro3);
    }
}
