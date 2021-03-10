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
    
    public Reservacion eliminarNodo(){
        if (fin == null){
            return null;
        }
        else {
            NodoReservacion q = frente;
            if (frente == fin){
                frente = null;
                fin = null;
            }
            else {
                frente = frente.enlace;
            }
            return q.reservacion;
        }
    }
    
    public Reservacion eliminarNodo(int codigo){
        NodoReservacion q = frente;
        NodoReservacion t = frente;
        int b = 1;
        
        while((q.reservacion.codigo == codigo) && (b == 1)){
            if (q.enlace != null){
                t = q;
                q = q.enlace;
            }
            else {
                b = 0;
            }
        }
        
        if(b == 0){
            return null;
        }
        else {
            if (frente == fin)
            return null; //kajsdkl
        }
        return null; //arasras
    }
    
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
