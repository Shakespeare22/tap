package problemastap;
import java.util.Scanner;
public class FelicitacionesFidel {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);        
    while (sc.hasNext()){
    int cantD = 0;        
    int total = 0;
    int firmantes = sc.nextInt();
    String entrada = "";

    for (int i = 0;i<firmantes;i++){
        entrada = sc.next();

        for (int j = 0;j < entrada.length();j++){

            if ((entrada.charAt(j)== 'D') && (cantD < 2)){
                cantD++;                                        
            }
            if ((entrada.charAt(j) == 'R') && (cantD>0)){
                total++;
                cantD--;                               
                
            }                
            
        }
    }
    System.out.println(total);
    }
    }
}













