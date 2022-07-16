/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Ciudad;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Enlace c = new Enlace();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la ciudad: ");
        String ciu = sc.nextLine();
        System.out.println("Ingrese la poblacion: ");
        int p = sc.nextInt();
        Ciudad ciudad = new Ciudad(ciu, p);
        c.insertarCiudad(ciudad);

        System.out.println("Desea ingresar otra ciudad?\n"
                + "1) Si\n"
                + "2) No");
        int opcion = sc.nextInt();

        while (opcion < 2) {

            sc.nextLine();
            System.out.println("Ingrese el nombre de la ciudad: ");
            ciu = sc.nextLine();

            System.out.println("Ingrese la poblacion: ");
            p = sc.nextInt();

            ciudad = new Ciudad(ciu, p);
            c.insertarCiudad(ciudad);

            System.out.println("Desea ingresar otra ciudad?\n"
                    + "1) Si\n"
                    + "2) No");
            opcion = sc.nextInt();

        }

        System.out.println("Revise su base de datos");
        /*for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
        System.out.printf("%s", c.obtenerDataCiudad().get(i));
        }*/
    }
}
