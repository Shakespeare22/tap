package problemastap;
import java.util.*;


public class DosGeniosBis {


    /*  en acerar intervalo, se acera el genio analizado, si la posicion evaluda es k , se acera k+1,k-1 y k,
     ademas de la posicon k del oro genio*/
    public static ArrayList acerarIntervalo(int indiceActual, ArrayList<Integer> arreglo, int K){
        if ((indiceActual + (K - 1)) >= arreglo.size()){

                for (int j = indiceActual; j <= (arreglo.size() - 1); j++) {
                    arreglo.set(j, 0);
                }

        }else{
                for (int j = indiceActual; j < K; j++) {
                    arreglo.set(j, 0);
                }
        }


        if ((indiceActual - (K - 1)) <= 0  ){

            for (int j = 0 ; j < indiceActual; j++) {
                arreglo.set(j , 0);
            }

        }else{
            for (int j = (indiceActual - K); j < indiceActual; j++) {
                arreglo.set(j, 0);
            }
        }

        return arreglo;
    }

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
                }
            }
            genio1.add(contarCorrectas);
        }
        for(int i = 0;i<cont;i++){
            int contarCorrectas = 0;
            for (int j = i+1;j<=K+i;j++){
                if (lista2.contains(j)){
                    contarCorrectas++;
                }
            }
            genio2.add(contarCorrectas);
        }
        // System.out.println(genio1);
         //  System.out.println(genio2);

        ArrayList<Integer> auxG1 = genio1;
        ArrayList<Integer> auxG2 = genio2;
        int indiceActual;
        int salida = 0;
        int nroAnalizando = K;
        
        for (int i = P; i > 0;i--){ //itero la cantidad de veces ue puede rotar a mirar


                if (auxG1.contains(nroAnalizando)) {    //pregunto si contiene el K analizado

                                                        //    System.out.println("i1 " + i);
                    salida = salida + auxG1.get(auxG1.indexOf(nroAnalizando));
                    indiceActual = auxG1.indexOf(nroAnalizando); //posicion actual
                                                          //   System.out.println("Posicion Actual: " + indiceActual);
                    auxG1.set(indiceActual, 0); //acero actual y actual de el otro array
                    auxG2.set(indiceActual, 0);
                    auxG1 = acerarIntervalo( indiceActual,auxG1 ,K);

                                                        //   System.out.println("G1: " + auxG1);
                                                        //    System.out.println("G2: "+ auxG1);



                } else if (auxG2.contains(nroAnalizando))

                {                                     //System.out.println("analizando " + nroAnalizando);
                                                        //  System.out.println("i2 " + i);
                    salida = salida + auxG2.get(auxG2.indexOf(nroAnalizando));
                    indiceActual = auxG2.indexOf(nroAnalizando); //posicion actual
                                                        //  System.out.println("Posicion Actual2: " + indiceActual);
                    auxG1.set(indiceActual, 0); //acero actual y actual de el otro array
                    auxG2.set(indiceActual, 0);
                                                        //   System.out.println("Salida: "+ salida);
                    auxG2 = acerarIntervalo( indiceActual,auxG2 ,K);

                                                        //      System.out.println("G1: " + auxG1);
                                                        //      System.out.println("G2: "+ auxG1);
                                                        //       System.out.println("Salida: "+ salida);
                } else { nroAnalizando--; // si no contiene los disminuyo y analizo igual lo que haya
                                                        ////    System.out.println("nroAnalizando " + nroAnalizando);

                    if (auxG1.contains(nroAnalizando)) {
                                                            //     System.out.println("i1 " + i);
                        salida = salida + auxG1.get(auxG1.indexOf(nroAnalizando));
                        indiceActual = auxG1.indexOf(nroAnalizando); //posicion actual
                                                            //   System.out.println("Posicion Actual: " + indiceActual);
                        auxG1.set(indiceActual, 0); //acero actual y actual de el otro array
                        auxG2.set(indiceActual, 0);
                                                            //      System.out.println("G1: " + auxG1);
                                                            //      System.out.println("G2: "+ auxG1);
                        auxG1 = acerarIntervalo( indiceActual,auxG1 ,K);
                                                            //     System.out.println("Salida: "+ salida);

                    } else if (auxG2.contains(nroAnalizando))

                    {                                      //   System.out.println("nroAnalizando " + nroAnalizando);

                                                            //    System.out.println("i2 " + i);
                        salida = salida + auxG2.get(auxG2.indexOf(nroAnalizando));
                        indiceActual = auxG2.indexOf(nroAnalizando); //posicion actual
                                                            //  System.out.println("Posicion Actual2: " + indiceActual);
                        auxG1.set(indiceActual, 0); //acero actual y actual de el otro array
                        auxG2.set(indiceActual, 0);
                                                            //  System.out.println("Salida: "+ salida);

                        auxG2 = acerarIntervalo( indiceActual,auxG2 ,K);

                        // System.out.println("G1: " + auxG1);
                       // System.out.println("G2: "+ auxG1);
                      //  System.out.println("Salida: "+ salida);
                    }




                }


        }

       // System.out.println(auxG1);
     //   System.out.println(auxG2);

        System.out.println(salida);
    }

}

