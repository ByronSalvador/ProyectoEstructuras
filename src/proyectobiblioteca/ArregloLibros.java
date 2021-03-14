/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

/**
 *
 * @author salva
 */
public class ArregloLibros {
    Libro libros [];
    int numLibros;
    
    //Constructor para crear un arreglo de n libros
    public ArregloLibros(int n){
        numLibros = n;
        libros = new Libro[numLibros];
        //Inicializar el arreglo de libros en null
        for(int i=0;i<numLibros;i++){
            libros[i]=null;
        }
    }
    
    //Método para ingresar un libro en el arreglo
    public void ingresarLibro(Libro libro){
        for(int i=0; i<numLibros; i++){
            if(libros[i] == null){
                libros[i]=libro;
                break;
            }
        }
        
    }
    
    //Método para buscar un libro por su ISBN
    public Libro buscarLibro(String isbn){
        Libro q;
        for (int i=0; i<numLibros; i++){
            q = libros[i];
            if (q != null){
                if ((!isbn.equals(null)) && q.ISBN.equals(isbn))
                    return q;
            }
        }
        return null;
    }
    
    //Método que indica si un libro se encuentra en el arreglo
    //El parámetro de entrada es el ISBN del libro que se consulta
    public boolean estaRegistrado(String isbn){
        if (this.buscarLibro(isbn) == null)
            return false;
        else
            return true;
    }

    //El método toString muestra la información de todos los libros del arreglo
    @Override
    public String toString() {
        String infoLibros="";
        for(int i = 0; i<numLibros; i++){
            infoLibros += libros[i].toString();
            infoLibros += "\n\n";
        }
        return "LIBROS: " + "\n" + infoLibros;
    }
}