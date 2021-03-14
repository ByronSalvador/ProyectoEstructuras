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
public class ListaClientes {
    //Puntero que apunta al primer elemento de la lista (cabeza)
    NodoCliente cabeza;
    
    //Constructor vacío (lista vacía)
    public ListaClientes(){
        cabeza = null;
    }
    
    //Constructor que toma como parámetro de entrada un nodo (Lista con un nodo)
    public ListaClientes(NodoCliente nuevoNodo){
        cabeza = nuevoNodo;
    }
    
    //Método para ingresar un nodo (cliente) a la lista
    public void ingresarNodo(NodoCliente nuevoNodo){
        if(cabeza == null){
            cabeza = nuevoNodo;
        }else{
            NodoCliente q; //para recorrer
            q = cabeza;
            while(q.enlace != null){
                q = q.enlace;
            }
            q.enlace = nuevoNodo;
        }      
    }
    
    //Método para busscar un nodo (cliente) por su cédula
    public Cliente buscarNodo(String cedula){
        NodoCliente q = cabeza;
        while((q != null) && (!q.cliente.cedula.equals(cedula))){
            q = q.enlace;
        }
        
        if(q == null){
            return null;
        }
        else {
            return q.cliente;
        }
    }
    
    
    //Método para identificar su un cliente se encuentra en la lista
    //El parámetro de entrada es una cédula
    public boolean estaRegistrado(String cedula){
        if (this.buscarNodo(cedula) == null)
            return false;
        else
            return true;
    }

    //Método toString que muestra ka información de todos los clientes
    @Override
    public String toString() {
        String infoClientes="";
        NodoCliente q=cabeza;
        while(q!=null){
            infoClientes += q.cliente.toString();
            q=q.enlace;
            infoClientes += "\n\n";
        }
        return "CLIENTES: " + "\n" + infoClientes;
    }
}