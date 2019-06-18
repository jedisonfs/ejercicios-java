package ejerciciosarrays;

import java.util.Scanner;

public class Ejerciciosarrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int[] n = new int[10];
        int med;

        System.out.println("Digite 10 numeros ");
        for (int cont = 0; cont <= n.length; cont++) {
            n[cont] = sc.nextInt();

            sum += n[cont] ;
            med= sum /10;

            if ((n[cont] >=1)); {
                System.out.println("El numero es positivo: "+n[cont]+" y la mediana es: "+med);
            }
           // if (n[cont]<=0){
            //    System.out.println("");
            //}
        }
    }

}
