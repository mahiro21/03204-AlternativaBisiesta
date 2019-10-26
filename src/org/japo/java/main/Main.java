/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH);

    public static void main(String[] args) {

        //variables
        int año;
        int resto;

        System.out.printf("Alternativa Bisiesta%n===================%n");
        try{
        System.out.print("Análisis año ...: ");
        año = SCN.nextInt();

        System.out.println("---");
        //Carne
        if (año % 400 == 0 || año % 400 != 0 && año % 100 != 0 && año % 4 == 0) {
           System.out.printf("El año %d ....: SI es bisiesto%n", año);  
        }
        else{
        System.out.println("El año 2019 ....: NO es bisiesto"); 
        }
        }
        catch (Exception e){
        System.out.println("ERROR: Entrada incorrecta"); 
        }
        }
  
}
