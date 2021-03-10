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
public class ListaClientes {
    NodoCliente cabeza;
    
    public ListaClientes(){
        cabeza = null;
    }
    
    public ListaClientes(NodoCliente nuevoNodo){
        cabeza = nuevoNodo;
    }
    
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

    @Override
    public String toString() {
        String infoClientes="";
        NodoCliente q=cabeza;
        while(q!=null){
            infoClientes += q.cliente.toString();
            q=q.enlace;
        }
        return "CLIENTES: " + "\n" + infoClientes;
    }
    
    
}
