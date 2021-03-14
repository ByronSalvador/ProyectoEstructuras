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
public class ColaReservaciones {
    //Punteros (referencias) frente y fin de la cola
    NodoReservacion frente;
    NodoReservacion fin;
    
    //Costructor vacío de una cola de reservaciones
    public ColaReservaciones(){
        frente=fin=null;
    }
    
    //Constructor de una cola de reservaciones
    //El parámetro de entrada es un nodo de reservación
    public ColaReservaciones(NodoReservacion nuevoNodo){
        frente=nuevoNodo;
        fin = nuevoNodo;
    }
    
    //Método para ingresar un nodo (reservación) a la cola
    public void ingresarNodo(NodoReservacion nuevoNodo){
        if(fin == null){
            fin = nuevoNodo;
            frente= nuevoNodo;
        }else{
            fin.enlace = nuevoNodo;
            fin = fin.enlace;
        }
    }
    
    //Método para buscar un nodo (reservación) en la cola
    public Reservacion buscarNodo(int codigo){
        NodoReservacion q = frente;
        while((q != null) && (q.reservacion.codigo != codigo)){
            q = q.enlace;
        }
        
        if(q == null){
            return null;
        }
        else {
            return q.reservacion;
        }
    }
    
    //Método toString que imprime todas las reservaciones de la cola
    @Override
    public String toString() {
        String infoReservacion="";
        NodoReservacion q=frente;
        while(q!=null){
            infoReservacion += q.reservacion.toString();
            q=q.enlace;
            infoReservacion += "\n\n";
        }
        return "RESERVACIONES: " + "\n" + infoReservacion;
    }
}