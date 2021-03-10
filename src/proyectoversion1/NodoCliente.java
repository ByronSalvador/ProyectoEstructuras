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
public class NodoCliente {
        Cliente cliente;
        NodoCliente enlace;
    
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

