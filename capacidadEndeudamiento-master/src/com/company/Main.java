package com.company;

import clases.CapacidadEndedudamiento;
import java.util.Scanner;

public class Main {
    //Recuerda que aca empieza todo
    public static void main(String[] args) {
        //Con este objeto de la clase Scanner puedes capturar informacion por consola cada ves que lo uses
        // recuerda cerrar el flujo de consulta cada ves lo uses sobre para que los uses in.close()
        Scanner in = new Scanner(System.in);
        //int ingMesuales;

        String entrada = "SI";
        while (entrada.equals("SI")) {
            System.out.println("Desea realizar el valoramiento de endeudamiento (SI/NO): ");
            String valor = in.next().toUpperCase();
            if (valor.equals("SI")) {
                System.out.println("Ingrese sus ingresos mensuales: ");
                Integer ingMesuales = in.nextInt();
                if (ingMesuales != null) {
                    System.out.println("Ingrese el valor de sus gastos fijos: ");
                    Integer gastosFijos = in.nextInt();
                    if (gastosFijos != null) {
                        System.out.println("Ingrese el valor de sus gastos variables: ");
                        Integer gastosVariables = in.nextInt();
                        if (gastosVariables != null) {
                            CapacidadEndedudamiento endeudamiento = new CapacidadEndedudamiento(ingMesuales, gastosFijos, gastosVariables);
                            System.out.println(endeudamiento.getCapacidadEndeudamiento(ingMesuales, gastosFijos, gastosVariables));
                            continue;
                        } else {
                            System.out.println("El valor ingresado no es válido.");
                            break;
                        }
                    } else {
                        System.out.println("El valor ingresado no es válido.");
                        break;
                    }
                } else {
                    System.out.println("El valor ingresado no es válido.");
                    break;
                }
            } else {
                entrada = "NO";
                System.out.println("Muchas gracias por uso. Hasta la próxima");
            }
        }

            //Esto te dara la primera entrada al proceso de solicitar los datos para instancir nuestro objeto
            // CapacidadEndedudamiento()
            //Valida las entradas de los usuarios que no vayas a convertir una "A" numero y el calculo no te funcione
            //Utiliza el metodo is numeric para vada entrada de ser necesarios

        in.close();
    }

    public static boolean isNumeric(String value) {
        // implementa un bloque try catch aca
        try {
            Double.parseDouble(value);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
