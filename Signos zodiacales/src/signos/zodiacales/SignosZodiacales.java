package signos.zodiacales;

import java.util.Scanner;

public class SignosZodiacales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        System.out.println("Escriba su nombre");
        nombre = sc.nextLine();

        int mes, dia, año;
        System.out.println("Escriba el Dia de nacimiento");
        dia = sc.nextInt();

        System.out.println("Escriba el Mes de nacimiento");
        mes = sc.nextInt();

        if (dia >= 20 && mes <= 1 || dia <= 18 && mes == 2) {
            System.out.println("Tu eres Acuario");

        }
        if (dia >= 19 && mes <= 2 || dia <= 20 && mes == 3) {
            System.out.println("Tu eres Picis ");

        }
        if (dia >= 21 && mes <= 3 || dia <= 19 && mes == 4) {
            System.out.println("Tu eres Aries ");

        }
        if (dia >= 20 && mes <= 4 || dia <= 20 && mes == 5) {
            System.out.println("Tu eres Tauro ");
        }
        if (dia >= 21 && mes <= 5 || dia <= 20 && mes == 6) {
            System.out.println("Tu eres Geminis");
        }
        if (dia >= 21 && mes <= 6 || dia <= 22 && mes == 7) {
            System.out.println("Tu eres cancer");
        }
        if (dia >= 23 && mes <= 7 || dia <= 22 && mes == 8) {
            System.out.println("Tu eres Virgo");
        }
        if (dia >= 23 && mes <= 9 || dia <= 22 && mes == 10) {
            System.out.println("Tu eres Libre");
        }
        if (dia >= 23 && mes <= 10 || dia <= 21 && mes == 11) {
            System.out.println("Tu eres Escorpion");
        }
        if (dia >= 22 && mes <= 11 || dia <= 21 && mes == 12) {
            System.out.println("Tu eres Sagitario");
        }
        if (dia >= 20 && mes <= 22 || dia <= 19 && mes == 1) {
            System.out.println("Tu eres Capricornio");
        } else {
            System.out.println("Los datos ingresados son erroneos");
        }
    }
}
