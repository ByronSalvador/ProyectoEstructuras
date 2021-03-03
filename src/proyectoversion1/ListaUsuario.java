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
public class ListaUsuario {
    NodoUsuario cabeza;
    
    public ListaUsuario(){
        cabeza = null;
    }
    
    public ListaUsuario(NodoUsuario nuevoNodo){
        cabeza = nuevoNodo;
    }
    
    public void ingresarNodo(NodoUsuario nuevoNodo){
        if(cabeza == null){
            cabeza = nuevoNodo;
        }else{
            NodoUsuario q; //para recorrer
            q = cabeza;
            while(q.enlace !=null){
                q = q.enlace;
            }
            q.enlace = nuevoNodo;
        }      
    }

    @Override
    public String toString() {
        String infoUsuarios="";
        NodoUsuario q=cabeza;
        while(q!=null){
            infoUsuarios += q.usuario.toString();
            q=q.enlace;
        }
        return "USUARIOS: " + "\n" + infoUsuarios;
    }
    
    
}
