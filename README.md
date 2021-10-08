# Java

import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
    String [] nomes = {"Calel", "Borges", "Jesus", "Verônica", "Silveira", "Rodrigues"};
    int [] idades = new int [6];

    Scanner obj = new Scanner(System.in);
      
        for (int i = 0; i < nomes.length; i++){
            System.out.println("Digite a idade do(a) " + nomes[i]);
            idades[i] = obj.nextInt();          
            }

        for (int i = 0; i < nomes.length; i++){
        System.out.println(nomes[i] + ": " + idades[i]);
         }        
    }
}
