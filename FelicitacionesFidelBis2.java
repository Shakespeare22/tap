package problemastap;
import java.util.Scanner;
public class FelicitacionesFidelBis2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);        
    while (sc.hasNext()){
    int contD = 0;        
    int contR = 0;        
    int contRD = 0;
    int total = 0;
    int firmantes = sc.nextInt();
    int j = 0;
    String entrada = "";
    String oracion = "";
    for (int i = 0;i<firmantes;i++){
        oracion = sc.next();
        for (int k = 0;k<oracion.length();k++){
        if (((oracion.charAt(k) == 'D') || (oracion.charAt(k) == 'R'))){
            entrada+=oracion.charAt(k);            
        }
        }
    }    
        System.out.println(entrada);
        while  (j+1 < entrada.length()){
            
                
            if (((entrada.charAt(j) == 'D') && (entrada.charAt(j+1) == 'R'))){
                total++;            
                j++;
            }else{
                  if (((entrada.charAt(j) == 'R') && (entrada.charAt(j+1) == 'R'))){
                    contR++;
                    j++;
                } else{ if (((entrada.charAt(j) == 'D') && (entrada.charAt(j+1) == 'D'))){
                    contD++;
                    j++;}
                    else {if (((entrada.charAt(j) == 'R') && (entrada.charAt(j+1) == 'D'))){
                          contRD++;
                          j++;                            
                            }                                                                        
                
                }
            }     
            }
        j++;
    }
    if(contRD>0){
    if(contD+contR>0) total += contRD;
    else total += contRD - 1;
}
    if (contD>contR)
        total+= contR;
        else 
            total+=contD;
    
    System.out.println(total);
    }
    }
}













