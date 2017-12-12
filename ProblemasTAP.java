
package problemastap;
import java.util.Scanner;


public class ProblemasTAP {

   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int num1 = entrada.nextInt();       
       int div1,div2 = 0;
       
       div1 = sumarDivisores (num1);
       div2 = sumarDivisores (div1);
       
       if (num1*2 == div2) {
           System.out.println ("Superperfect Number");
       }
       else{
           System.out.println ("Non a Superperfect Number");
       }
           
       
   }
   
       public static int sumarDivisores(int num){
           int cont = 0;
           for (int i = 1; i<=num;i++){
               if (num % i == 0){
                   cont+=i;
               }
           }
           return cont;
       }
      
       
       
      
       }

       
    
    

