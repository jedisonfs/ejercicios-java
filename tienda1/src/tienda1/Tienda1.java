
package tienda1;

import java.util.Scanner;


public class Tienda1 {


    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        String corpo;
        String frecu;
        String madre;
        String ancia;
        String nomBb;
        double descuento;
        int nproduc;
        int añoNacim;
        int edad;
        double totpagd;
        double totpag;
        double vproduc;
        char tienda;
        char ninBraz;
        char genero;

        System.out.println("¿Que tipo de usuario es ?");
        System.out.println("a. Corporativo");
        System.out.println("b. Frecuente");
        System.out.println("c. Madre lactante");
        System.out.println("d. Anciano");
        tienda = sc.next().charAt(0);

        switch (tienda) {
            case 'a':

                System.out.println("             CLIENTE CORPORATIVO           ");
                corpo = sc.nextLine();
                System.out.println("");
                System.out.println("Ingrese la cantidad de productos a pagar ");
                nproduc = sc.nextInt();
                System.out.println("Digite el valor del producto");
                vproduc = sc.nextInt();
                totpag = nproduc * vproduc;

                if (nproduc >= 5) {
                    //Corporativo
                    descuento = totpag * 0.4;
                    totpagd = totpag - descuento;

                    System.out.println("Numero de productos a pagar: " + nproduc);
                    System.out.println("Se le realizara un descuento de: " + descuento);
                    System.out.println("El total a pagar es de: " + totpagd);
                } else {
                    System.out.println("Su total a pagar es de: " + totpag);
                }
                break;

            case 'b':
                //Cliente Frecuente

                System.out.println("                  CLIENTE FRECUENTE                ");
                frecu = sc.nextLine();
                System.out.println("");
                System.out.println("Digite la cantidad de productos a pagar");
                nproduc = sc.nextInt();
                System.out.println("Digite el valor del producto");
                vproduc = sc.nextInt();
                totpag = nproduc * vproduc;

                if (nproduc >= 2) {
                    descuento = totpag * 0.35;
                    totpagd = totpag - descuento;
                    System.out.println("Numero de productos a pagar: " + nproduc);
                    System.out.println("Se le realizara un descuento de: " + descuento);
                    System.out.println("El total a pagar es de: " + totpagd);
                } else {
                    System.out.println("Su valor a pagar es de: " + totpag);
                }
                break;

            case 'c':
                //Cliente madre

                System.out.println("      CLIENTE MADRE LACTANTE     ");

                System.out.println("Escriba el nombre de la madre");
                madre = sc.next(); //--> REVISAR
                String apMa = sc.nextLine();
                System.out.println("Digite su año de nacimiento");
                añoNacim = sc.nextInt();

                edad = 2019 - añoNacim;

                System.out.println("Lleva a su bebé en brazoz");
                System.out.println("a. Si ");
                System.out.println("b. No");
                ninBraz = sc.next().charAt(0);   //**

                switch (ninBraz) {
                    case 'a':

                        System.out.println("Escriba el nombre del bebe");
                        nomBb = sc.next();
                        String apelBb = sc.nextLine(); //** -> REVISAR

                        System.out.println("Si se le puede hacer un descuento ");
                        System.out.println("");

                        System.out.println("Ingrese la cantidad de productos a pagar ");
                        nproduc = sc.nextInt();

                        System.out.println("Digite el valor del producto");
                        vproduc = sc.nextInt();

                        totpag = nproduc * vproduc;

                        if (nproduc >= 1) {
                            descuento = totpag * 0.9;
                            totpagd = totpag - descuento;
                            System.out.println("Nombre de la madre: " + madre + apMa);
                            System.out.println("Nombre del bebe es: " + nomBb + apelBb);
                            System.out.println("Año de nacimiento de la madres es: " + añoNacim);
                            System.out.println("Edad de la madre es: " + edad);
                            System.out.println("Se le realizar1a un descuento de: " + descuento);
                            System.out.println("El total a pagar es de: " + totpagd);
                        } else {
                            System.out.println("No hay ningun producto para hacer descuento");
                        }
                        break;
                    case 'b':
                        System.out.println("No se le puede hacer un descuento");
                        break;
                }
            default:
                System.out.println("La opcion ingresada es erronea");

            case 'd':
                System.out.println("                CLIENTE ANCIANO                 ");
                System.out.println("");
                System.out.println(" ¿ Que genero es usted ?");
                System.out.println("a. hombre");
                System.out.println("b. mujer");
                genero = sc.next().charAt(0);

                switch (genero) {
                    case 'a':

                        System.out.println("Digite su año de nacimiento");
                        añoNacim = sc.nextInt();

                        edad = 2019 - añoNacim;

                        System.out.println("Digite numero de producto que va a pagar");
                        nproduc = sc.nextInt();
                        System.out.println("Digite el valor del producto");
                        vproduc = sc.nextInt();
                        totpag = nproduc * vproduc;

                        if (nproduc > 2) {

                            descuento = totpag * 0.5;
                            totpagd = totpag - descuento;

                            System.out.println("Se realizara el descuento");
                            System.out.println("Su edad es de: " + edad);
                            System.out.println("Numero de productos a pagar: " + nproduc);
                            System.out.println("Se le realizara un descuento de: " + descuento);
                            System.out.println("Su años de nacimiento es de: " + añoNacim);
                            System.out.println("Su genero es: " + genero);
                            System.out.println("El total a pagar es de: " + totpagd);

                        } else {
                            System.out.println("Su total a pagar es de: " + totpag);
                        }
                        break;

                    case 'b':
                        System.out.println("Digite su año de nacimiento");
                        añoNacim = sc.nextInt();

                        edad = 2019 - añoNacim;

                        System.out.println("Digite numero de producto que va a pagar");
                        nproduc = sc.nextInt();
                        System.out.println("Digite el valor del producto");
                        vproduc = sc.nextInt();
                        totpag = nproduc * vproduc;

                        if (nproduc > 5) {

                            descuento = totpag * 0.55;
                            totpagd = totpag - descuento;

                            System.out.println("Se realizara el descuento");
                            System.out.println("Su edad es de: " + edad);
                            System.out.println("Numero de productos a pagar: " + nproduc);
                            System.out.println("Se le realizara un descuento de: " + descuento);
                            System.out.println("Su años de nacimiento es de: " + añoNacim);
                            System.out.println("Su genero es: " + genero);
                            System.out.println("El total a pagar es de: " + totpagd);
                        }
                        break;
                    default:
                        System.out.println("La opcion ingresada es erronea");
                }

        }
    }
    
}
