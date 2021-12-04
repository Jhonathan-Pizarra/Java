/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author chalosalvador
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[5];

        for (int i = 0; i < estudiantes.length; i++) {
            Estudiante estudiante;
            boolean duplicado;
            do {
                duplicado =  false;

                System.out.println("Ingrese los datos del estudiante " + (i + 1));
                System.out.println("Nombre: ");
                String nombre = scan.nextLine();

                System.out.println("Edad: ");
                int edad = scan.nextInt();

                System.out.println("Ingrese las 2 materias");

                Materia materias[] = new Materia[2];

                for (int j = 0; j < materias.length; j++) {
                    System.out.println("Materia " + (j + 1));
                    scan.nextLine();
                    System.out.println("Nombre: ");
                    String nombreMateria = scan.nextLine();

                    System.out.println("Nivel: ");
                    int nivel = scan.nextInt();

                    materias[j] = new Materia(nombreMateria, nivel);;
                }

                estudiante = new Estudiante(nombre, edad, materias);

                for (int k = 0; k < estudiantes.length; k++) {
                    if (estudiante.equals(estudiantes[k])) {
                        System.out.println("El estudiante ya existe.");
                        scan.nextLine();
                        duplicado = true;
                    }
                }
            } while (duplicado);

            estudiantes[i] = estudiante;
            System.out.println("Se ha ingresado el estudiante con los siguientes datos: ");
            System.out.println(estudiantes[i]);
            scan.nextLine();

        }

        String posiciones = "";
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes.length; j++) {
                if (i != j && estudiantes[i].equals(estudiantes[j])) {
                    posiciones += (i + 1) + ", ";
                }
            }
        }

        if (!posiciones.equals("")) {
            System.out.println("Se han encontrado duplicados en las posiciones: ");
            System.out.println(posiciones);
        }

    }

}
