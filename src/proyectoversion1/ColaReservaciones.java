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
public class ColaReservaciones {
    NodoReservacion frente;
    NodoReservacion fin;
    
    public ColaReservaciones(){
        frente=fin=null;
    }
    
    public ColaReservaciones(NodoReservacion nuevoNodo){
        frente=nuevoNodo;
        fin = nuevoNodo;
    }
    
    public void ingresarNodo(NodoReservacion nuevoNodo){
        if(fin == null){
            fin = nuevoNodo;
            frente= nuevoNodo;
        }else{
            fin.enlace = nuevoNodo;
            fin = fin.enlace;
        }
    }
    
@Override
    public String toString() {
        String infoReservacion="";
        NodoReservacion q=frente;
        while(q!=null){
            infoReservacion += q.reservacion.toString();
            q=q.enlace;
        }
        return "RESERVACIONES: " + "\n" + infoReservacion;
    }
    
}
