package boletin;

import java.util.Scanner;

public class Boletin {

    public static void main(String[] args) {

        String jornada;
        String observadores;
        String estudiantesNom[] = new String[5];

        double notEspa[] = new double[3];// Nota de Español
        double notBiol[] = new double[3]; // Nota de Biologia
        double notAlgebra[] = new double[3];// Nota de Algebra
        double notSistemas[] = new double[2];// Nota de Sistemas
        double notTrigo[] = new double[3];// Nota deNota de trigonometria
        double promedioEspa = 0; //Promedio de Español
        double promedioBiol = 0; // Promedio de Biologia
        double promedioAlge = 0; //Promedio de Algebra
        double promedioSiste = 0; // Promedio de Sistemas
        double promedioTrigo = 0; //Promedio de Trigonometria
        double[][] notprom = {{promedioEspa},{promedioBiol},{promedioSiste},{promedioTrigo}};
        int j = 0;

        Scanner sc = new Scanner(System.in);

        do {
            j++;
            //    for (int i = 0; i < estudiantesNom.length; i++) {

            // }
            System.out.println(" Digite el nombre del estudiante [" + j + "]");
            estudiantesNom[j] = sc.nextLine();

            System.out.println("Digite cual es su Jornada");
            jornada = sc.nextLine();

            System.out.println("Digite las notas de la Materias");
            System.out.println("");

            for (int i = 0; i < notEspa.length; i++) {
                System.out.print("Digite nota [" + (i + 1) + "] de Español : ");
                notEspa[i] = sc.nextDouble();
                promedioEspa += notEspa[i] / 3;
            }
            for (int i = 0; i < notBiol.length; i++) {
                System.out.print("Digite la nota [" + (i + 1) + "] de Biologia : ");
                notBiol[i] = sc.nextDouble();
                promedioBiol += notBiol[i] / 3;
            }
            for (int i = 0; i < notAlgebra.length; i++) {
                System.out.print("Digite la nota [" + (i + 1) + "] de Algebra : ");
                notAlgebra[i] = sc.nextDouble();
                promedioAlge += notAlgebra[i] / 3;
            }
            for (int i = 0; i < notSistemas.length; i++) {
                System.out.print("Digite la nota [" + (i + 1) + "] de Sistemas : ");
                notSistemas[1] = sc.nextDouble();
                promedioSiste += notSistemas[i];
            }
            for (int i = 0; i < notTrigo.length; i++) {
                System.out.print("Digite la nota [" + (i + 1) + " de Trigonometria : ");
                notTrigo[i] = sc.nextDouble();
            }
        } while (j < 2);

        System.out.println("");
        System.out.println("");
        System.out.println("");


            System.out.println("Nombre : " + estudiantesNom[1]);
            System.out.println("Jornada : "+jornada );

                         System.out.println("Promedio : "+notprom[0][2]);

    
    
}
}
