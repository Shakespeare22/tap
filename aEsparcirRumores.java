/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemastap;
import java.util.*;

public class aEsparcirRumores {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float cantHabitantes = scan.nextLong();
        int cantHoras = scan.nextInt();
        int cantHorasPasaron = scan.nextInt();
        float iniciantes = cantHabitantes;
        if ((cantHabitantes>=1) && (cantHabitantes<=10E+12)&&(cantHorasPasaron>=1)&&(cantHorasPasaron<=100000000)){
        for (int i = 1;i<=cantHoras;i++){
            iniciantes = iniciantes / 2;
        }
        if (iniciantes>=1){
        System.out.printf("%.0f",iniciantes);
        System.out.println();
        } else
            System.out.println(1);
        
        iniciantes = cantHabitantes;
        for (int i = 1;i<=cantHoras-cantHorasPasaron;i++){
            iniciantes = iniciantes/2;
        }
        System.out.printf("%.0f",iniciantes);
        }
    }

}