
package problemastap;
import java.util.*;


public class DosGenios {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        int entrada, N,P,K;
        N = scan.nextInt();
        P =  scan.nextInt();
        K =  scan.nextInt();        
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        ArrayList<Integer> genio1 = new ArrayList<Integer>();
        ArrayList<Integer> genio2 = new ArrayList<Integer>();
        int cont =  scan.nextInt();
        
        for (int i = 0;i<cont;i++){ //Carga de las listas de entrada
            lista1.add(scan.nextInt());
        }
        cont = scan.nextInt();
        for (int i = 0;i<cont;i++){
            lista2.add(scan.nextInt());
        }
        cont = N - K + 1;
        for(int i = 0;i<cont;i++){//carga de listas genio1 y genio2, con los valores de cantidad de materias en los rangos.
            int contarCorrectas = 0;
            for (int j = i+1;j<=K+i;j++){
                if (lista1.contains(j)){
                contarCorrectas++;
                }else{
                    if (lista2.contains(j)){
                        contarCorrectas++;
                    }
                }                                
            }
            genio1.add(contarCorrectas);
        }
        /*for(int i = 0;i<cont;i++){
            int contarCorrectas = 0;
            for (int j = i+1;j<=K+i;j++){
                if (lista2.contains(j)){
                contarCorrectas++;
                }                                
            }
            genio2.add(contarCorrectas);
        }*/
          System.out.println(genio1);
          //System.out.println(genio2);
        
        }
        
}

