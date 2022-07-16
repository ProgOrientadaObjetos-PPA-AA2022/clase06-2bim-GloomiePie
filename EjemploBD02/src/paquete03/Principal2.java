/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete01.Enlace;

/**
 *
 * @author SALA I
 */
public class Principal2 {
    public static void main(String[] args) {
        
        Enlace c = new Enlace();
        
        for (int i = 0; i < c.obtenerDataAuto().size(); i++) {
        System.out.printf("%s", c.obtenerDataAuto().get(i));
        }
    }
}
