/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegovarela_lab2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class DiegoVarela_Lab2 {

    static Scanner entrada = new Scanner(System.in);
    static boolean in = false;

    public static void main(String[] args) {
        ArrayList<Casa> casas = new ArrayList();
        char resp = 's';

        while (resp == 's') {
            System.out.println("Registro de casas");
            System.out.println("Manejo de estados");
            System.out.println("Log in");
            System.out.println("Salir");
            int enter = entrada.nextInt();
            switch (enter) {
                case 1:
                    if (in = true) {
                        System.out.println("1) Crear Casas");
                        System.out.println("2) Listar Casas");
                        System.out.println("3) Modificar Casas");
                        System.out.println("4) Borrar Casas");
                        System.out.println("Ingrese la opcion que desea");
                        int ent = entrada.nextInt();
                        switch (ent) {
                            case 1:
                                System.out.println("Ingrese el numero de casa:");
                                int numcasa = entrada.nextInt();
                                System.out.println("Ingrese el numero de bloque:");
                                int numbloque = entrada.nextInt();
                                System.out.println("Ingrese el color de la casa:");
                                String col = entrada.next();
                                System.out.println("Ingrese el ancho de la casa:");
                                double anc = entrada.nextDouble();
                                System.out.println("Ingrese el largo de la casa:");
                                double lar = entrada.nextDouble();
                                System.out.println("Ingrese si ya fue comprada(Si o no):");
                                String comp = entrada.next();
                                System.out.println("Ingrese el numero de pisos:");
                                int numpiso = entrada.nextInt();
                                System.out.println("Ingrese el numero de baños:");
                                int numb = entrada.nextInt();
                                String dueño = "";
                                if (comp.equals("Si") || comp.equals("si")) {
                                    System.out.println("Ingrese el nombre del dueño:");
                                    dueño = entrada.next();
                                }
                                System.out.println("Ingrese el nkombre del inegienero a cargo:");
                                String ing = entrada.next();
                                System.out.println("Ingrese el estado de la casa(solo minusculas):");
                                String estado = entrada.next();
                                casas.add(new Casa(numcasa, numbloque, col, anc, lar, comp, numpiso, numb, numcasa, dueño, estado, ing));
                                break;
                            case 2:
                                for (Casa c : casas) {
                                    System.out.println(c);
                                }
                                break;
                            case 3:
                                for (Casa c : casas) {
                                    System.out.println(c);
                                }
                                System.out.println("Ingrese la posiocion de la casa que desea modificar:");
                                int mod = entrada.nextInt();
                                System.out.println("¿Que desea modificar?");
                                System.out.println("1) Numero de casa");
                                System.out.println("2) Numero de bloque");
                                System.out.println("3) Color");
                                System.out.println("4) Ancho");
                                System.out.println("5) Largo");
                                System.out.println("6) Si ya fue comprada");
                                System.out.println("7) Numero de pisos");
                                System.out.println("8) Numero de baños");
                                System.out.println("9) Numero de cuartos");
                                System.out.println("10) El nombre del dueño");
                                System.out.println("11) Ingeniero a crago");
                                switch () {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        break;
                                    case 5:
                                        break;
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        break;
                                    case 9:
                                        break;
                                    case 10:
                                        break;
                                    case 11:
                                        break;

                                }
                                break;
                            case 4:
                                break;
                        }
                    } else {
                        System.out.println("No se puede entrar usuario o contraseña no valido");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Ingrese su usuario:");
                    String us = entrada.next();
                    System.out.println("Ingrese su contraseña:");
                    String cont = entrada.next();
                    if (us.equals("leobanegas") && cont.equals("99")) {
                        in = true;
                    }
                    break;

                case 4:
                    resp = 'n';
                    break;
            }

        }
    }

}
