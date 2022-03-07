/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("En que anda la vagancia");
        int a, b, c, p, mn, my;
        Scanner scanf = new Scanner (System.in);
        System.out.print("Tirame un numero: ");
        a=scanf.nextInt();
        System.out.print("Tirame otro numero numero: ");
        b=scanf.nextInt();
        System.out.print("Tirame un ultimo numero: ");
        c=scanf.nextInt();
        
        if(a==b) {
            if (a==c) {
            System.out.print("Todos los numeros son iguales \n"); }
            else {
            System.out.print("A y B son iguales \n");  }
        }
        else if (b==c){
            System.out.print("B y C son iguales \n"); }
        else if (a==c){
            System.out.print("A y C son iguales \n"); }
        else System.out.print("Todos los numeros son distintos \n");
        
        p= (a+b+c)/3;
        System.out.println("El promedio es: " + p);
        p= (a+b+c);
        System.out.println("La suma total es: " + p);
        
        
        }
    
    
    }
    

