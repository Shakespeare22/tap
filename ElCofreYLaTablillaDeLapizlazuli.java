
package problemastap;
import java.util.Arrays;
import java.util.Scanner;
public class ElCofreYLaTablillaDeLapizlazuli {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int entrada;
        int [] arr2 = new int[3];
        int [] arr1 = new int[3];
        int max1,max2=0;
        int salida = 1;
        for (int i = 0;i<3 ;i++){
            arr1[i] = scan.nextInt();
        }        
        for (int i = 0;i<3 ;i++){            
            arr2[i] = scan.nextInt();
            
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
         
        for(int i = 0;i<3;i++){
            if (arr1[i]<= arr2[i] == false){
                salida = 0;
            }
        }
        System.out.print(salida);
        
    }
}
