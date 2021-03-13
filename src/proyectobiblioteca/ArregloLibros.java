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
    
    public ArregloLibros(){
        //numLibros = 0;
    }
    public ArregloLibros(int n){
        numLibros = n;
        libros = new Libro[numLibros];
        //Inicializar el arreglo de libros en null
        for(int i=0;i<numLibros;i++){
            libros[i]=null;
        }
    }
    
    public void ingresarLibro(Libro libro){
        for(int i=0; i<numLibros; i++){
            if(libros[i] == null){
                libros[i]=libro;
                break;
            }
        }
        
    }
    
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

    @Override
    public String toString() {
        String infoLibros="";
        for(int i = 0; i<numLibros; i++){
            infoLibros += libros[i].toString();
        }
        return "LIBROS: " + "\n" + infoLibros;
    }
    
    
    
}
