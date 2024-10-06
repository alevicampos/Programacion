package org.example;

import java.util.Scanner;

public class Ejercicio1 {

    public void ejercicio1() {
        //declaro las varibles que necesito para las notas
        double nota1;
        double nota2;
        double nota3;
        //declaro la variable que necesito para alojar la media de las tres notas.
        double media;
        Scanner entrada = new Scanner(System.in);

        // solicito que el usuario introduzca las tres notas y las guardo en las variables creadas
        System.out.println("Introduce la nota del primer trimestre (0-10)");
        nota1 = entrada.nextDouble();
        System.out.println("Introduce la nota del segundo trimestre (0-10)");
        nota2 = entrada.nextDouble();
        System.out.println("Introduce la nota del tercer trimestre (0-10)");
        nota3 = entrada.nextDouble();

        // para asegurarme de que las notas se encuentran entre 0 y 10 creo un while

        while (nota1>10 || nota2>10 || nota3>10 || nota1<0 || nota2<0 || nota3<0){
            System.out.println("NOTA fuera de rango (0-10). Vuelve a introducirlas...");
            System.out.println("Introduce la nota del primer trimestre (0-10)");
            nota1 = entrada.nextDouble();
            System.out.println("Introduce la nota del segundo trimestre (0-10)");
            nota2 = entrada.nextDouble();
            System.out.println("Introduce la nota del tercer trimestre (0-10)");
            nota3 = entrada.nextDouble();
        }
            // introduzco el valor de la variable media
        media= (nota1+nota2+nota3)/3;

        if (media>=5){
            System.out.println("La media obtenida es " + media);
            System.out.println("APROBADO");

        }else{
            System.out.println("La media obtenida es " + media);
            System.out.println("SUSPENSO");
        }
    }
}
