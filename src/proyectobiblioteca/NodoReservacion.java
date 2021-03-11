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
public class NodoReservacion {
        Reservacion reservacion;
        NodoReservacion enlace;
    
    public NodoReservacion(Reservacion reservacion){
        this.reservacion = reservacion;
        enlace = null;
    }

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    public NodoReservacion getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoReservacion enlace) {
        this.enlace = enlace;
    }
}
