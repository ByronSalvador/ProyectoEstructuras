/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoversion1;

/**
 *
 * @author salva
 */
public class ArregloLibro {
    Libro libros [];
    int numLibros;
    
    public ArregloLibro(){
        //numLibros = 0;
    }
    public ArregloLibro(int n){
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
            }
        }
        
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
