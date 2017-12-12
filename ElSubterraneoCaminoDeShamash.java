
package problemastap;
import java.util.*;
public class ElSubterraneoCaminoDeShamash {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
     long entrada = scan.nextLong();
     long resto;
     
     String reverso = "";
     String  salida = "";
     while (entrada > 0){
         resto = entrada % 60;
         
         for (int i = 0;i< (resto/10) ;i++){             
             salida +="L";             
         }
         for (int i = 0;i< (resto % 10);i++){
             salida +="I";
             
         }         
         if (entrada>59){
         salida+=".";
         }
         entrada = entrada / 60;
    }
     
     System.out.println(salida);
    
}
}