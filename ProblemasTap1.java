package problemastap;

import java.util.*;

public class ProblemasTap1 {
    
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        String ropa = scan.nextLine();   
        while (scan.hasNext()==true){            
            
         if (ropa.isEmpty()){
             System.out.println();
         }
         else{ 
             if (ropa.indexOf("i") == -1) {
            System.out.println("S");
        }
        else{
            System.out.println("N");
        }
         }
         ropa = scan.nextLine();
        }
      
        
      
    }
    
}


