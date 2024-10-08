package com.mycompany.ejercicio2_quiz;

import java.util.Scanner;

/**
 *
 * @author 1029600405
 */

public class Ejercicio2_quiz {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        float[] altura= new float[5];
        float suma=0;
        
        for (int i = 0; i < altura.length ; i++) {
            System.out.println("Ingresar la altura "+(i+1)+": ");
            altura[i]= sc.nextFloat();
            
            suma += altura[i];
        }
        
        float promedio= suma/5;
        
        int altos=0;
        int bajos=0;
        
        for (int i = 0; i < altura.length ; i++) {
            if (altura[i]>promedio) {
                altos= altos+1;
            }
            else{
                bajos= bajos+1;
            }
        }
        
        System.out.println("El promedio de altura es: "+promedio);
        System.out.println(altos+" personas son mas altas que el promedio");
        System.out.println(bajos+" personas son mas bajas que el promedio");
    }
}
