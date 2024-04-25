/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

public class Principal {
    public static void main(String[] args) {
        
        InstitucionEducativa ie = new InstitucionEducativa();
        
        String n = "Jean Iñiguez";
        String ti = "Privada";
        int na = 30;
        int nd = 1;
        int ns = 2;
        
        ie.establecerNombre(n);
        ie.establecerTipoInstitucion(ti);
        ie.establecerNumeroAlumnos(na);
        ie.establecerNumeroDocentes(nd);
        ie.establecerNumeroSedes(ns);
        
        
        System.out.printf("Informacion\n\nNombre y Apellido: %s\nTipo de Institución: %s\n"
        + "Numero de Alumnos: %d\n"
        + "Numero de Docentes: %d\n"
        + "Numero de Sedes: %d\n", ie.obtenerNombre(), ie.obtenerTipoInstitucion(), ie.obtenerNumeroAlumnos(),
        ie.obtenerNumeroDocentes(), ie.obtenerNumeroSedes());
        
    }
}
