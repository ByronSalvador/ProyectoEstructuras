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
public class Cliente {
    String cedula;
    String nombres;
    String apellidos;
    String telefono;
    String direccion;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Método para validar una cédula
    public static boolean esCedulaValida(String cedula) {
        StringBuilder c = new StringBuilder(cedula);
        boolean digitoAux = true;
        int digito;
        if (c.length() == 10 || c.length() == 11) {
            if (c.charAt(9) == '-') {
                c = c.deleteCharAt(9);
            } else if (c.length() == 11) {
                return false;
            }
            for (int i = 0; i < 10; i++) {
                digitoAux &= Character.isDigit(c.charAt(i));
            }
            if (digitoAux) {
                int verificador = Character.getNumericValue(c.charAt(9));
                int sumaImpares = 0;
                int sumaPares = 0;
                int sumaTotal;
                int decena;
                for (int i = 0; i < 9; i++) {
                    if (i % 2 == 0) {
                        digito = Character.getNumericValue(c.charAt(i));
                        digito = digito * 2;
                        if (digito > 9) {
                            digito -= 9;
                        }
                        c.replace(i, i + 1, Integer.toString(digito));
                    }
                }
                for (int i = 0; i < 9; i++) {
                    if (i % 2 == 0) {
                        sumaImpares += Character.getNumericValue(c.charAt(i));
                    }
                }
                for (int i = 0; i < 9; i++) {
                    if (i % 2 != 0) {
                        sumaPares += Character.getNumericValue(c.charAt(i));
                    }
                }
                sumaTotal = sumaImpares + sumaPares;
                decena = (sumaTotal / 10) + 1;
                decena *= 10;
                decena -= sumaTotal;
                if (decena == 10) {
                    decena -= 10;
                }
                if (decena == verificador) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //Método toString para imprimir la información de un cliente
    @Override
    public String toString() {
        return "Cédula: " + cedula + "\nNombres: " + nombres + "\nApellidos: " + apellidos + "\nTeléfono: " + telefono + "\nDirección: " + direccion;
    }
}