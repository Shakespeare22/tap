package problemastap;
import java.util.Scanner;
public class FelicitacionesFidelBis {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);        
    while (sc.hasNext()){
    int contDR = 0;      
    int contRD = 0;      
    int contD = 0;
    int contR = 0;
    int total = 0; 
    int cRDpalabra = 0;
    boolean d = false;
    boolean r = false;
    boolean rd = false;
    boolean dr = false;
           
    int firmantes = sc.nextInt();
    String entrada = "";

    for (int i = 0;i<firmantes;i++){
        entrada = sc.next();
        cRDpalabra = 0;
        for (int j = 0;j < entrada.length();j++){
           
            if (entrada.charAt(j)== 'D'){                                
                d = true;
                if (r == true){                                                        
                    cRDpalabra++;
                    rd = true;
                }
            }else{
                if (entrada.charAt(j) == 'R'){
                    r = true;
                    if (d == true){                                                                                           
                       dr = true;
                }
                }
            } 
            if ((d == true) && (r == true) && (dr == true)){
                contDR++;
                d=false;
                r=false;
                dr=false;
            }
            
       }
        if ((d == true) && (r == true) && (rd == true)){
            if (cRDpalabra == 1){
                contRD++;
            }else{
                contDR+=cRDpalabra-1;
                contRD++;                
            }
            d=false;
            r=false;     
            rd=false;
        }
        if ((d == true) && (r == false) ){
            contD++;            
        }
        if ((d == false) && (r == true) ){
            contR++;            
        }
    }
    
    total+=contDR;
    if(contRD>0){
        if(contD+contR>0){
            total += contRD;
        }else{ 
            total += contRD - 1;
        }
    }
  if (contD>contR)
        total+= contR;
        else 
            total+=contD;
     if (total<0){
         total = 0;
     }
    System.out.println(total);
    }
    }
}
    

