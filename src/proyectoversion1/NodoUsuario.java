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
public class NodoUsuario {
        Usuario usuario;
        NodoUsuario enlace;
    
    public NodoUsuario(Usuario usuario){
        this.usuario = usuario;
        enlace = null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public NodoUsuario getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoUsuario enlace) {
        this.enlace = enlace;
    }
 
}

