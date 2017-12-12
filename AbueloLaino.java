

package problemastap;
import java.util.*;

public class AbueloLaino {
 public static void main (String[] args)   {     
                
		Scanner s = new Scanner(System.in);                		
		while (s.hasNext()){  
                ArrayList<String> lista = new ArrayList<String>();    
                String r = s.next();
                lista.add(r);
            if (lista.get(0).indexOf("i") == -1) {                 
                System.out.println("S");
            }
            else{           
                System.out.println("N");
        }                 
    }
	}
}
     
 

