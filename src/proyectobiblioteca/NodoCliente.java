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
//Nodo para representar u cliente
public class NodoCliente {
    Cliente cliente;    //Campo "info" del nodo
    NodoCliente enlace; //Campo "liga" del nodo
    
    public NodoCliente(Cliente cliente){
        this.cliente = cliente;
        enlace = null;
    }

    public Cliente getUsuario() {
        return cliente;
    }

    public void setUsuario(Cliente cliente) {
        this.cliente = cliente;
    }

    public NodoCliente getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoCliente enlace) {
        this.enlace = enlace;
    }
}