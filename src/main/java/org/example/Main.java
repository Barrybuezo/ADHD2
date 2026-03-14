package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precioCafe = 7.50;
        double precioTe = 6.00;
        double precioChocolate = 10;
        double precioCroissant = 15.75;
        double precioSandwich = 13.50;
        double precioPastel = 12.25;
        double total = 0;
        double iva;

        int cantidad;



        System.out.print("\nPara realizar un pedido");
        System.out.print("\nIngrese los siguientes datos");
        System.out.print("\nNombre del cliente: ");
        String nombreCliente = sc.nextLine();
        System.out.print("Número de mesa: ");
        int numeroMesa = sc.nextInt();


        int continuarPedido;
        do{
            System.out.println("\nMENÚ");
            System.out.println("1. Café ........... Q7.50");
            System.out.println("2. Té ............. Q6.00");
            System.out.println("3. Chocolate ...... Q10.00");
            System.out.println("4. Croissant ...... Q15.75");
            System.out.println("5. Sandwich ....... Q13.50");
            System.out.println("6. Pastel ......... Q12.25");
            System.out.println("0. Finalizar pedido");
            System.out.print("\nSeleccione una opción: ");
            int opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Café");
                    System.out.print("Cantidad: ");
                    cantidad = sc.nextInt();
                    total += cantidad * precioCafe;
                    break;
                case 2:
                    System.out.println("Té");
                    System.out.print("Cantidad: ");
                    cantidad = sc.nextInt();
                    total += cantidad * precioTe;
                    break;
                case 3:
                    System.out.println("Chocolate");
                    System.out.print("Cantidad: ");
                    cantidad = sc.nextInt();
                    total += cantidad * precioChocolate;
                    break;
                case 4:
                    System.out.println("Croissant");
                    System.out.print("Cantidad: ");
                    cantidad = sc.nextInt();
                    total += cantidad * precioCroissant;
                    break;
                case 5:
                    System.out.println("Sandwich");
                    System.out.print("Cantidad: ");
                    cantidad = sc.nextInt();
                    total += cantidad * precioSandwich;
                    break;
                case 6:System.out.println("Pastel");
                    System.out.print("Cantidad: ");
                    cantidad = sc.nextInt();
                    total += cantidad * precioPastel;
                    break;
                case 0:
                    break;
                default:
                    break;
            }

            do{
                System.out.print("\nDesee continuar con el pedido?");
                System.out.print("\n1. Si");
                System.out.print("\n2. No");
                System.out.print("\nSeleccione una opcion: ");
                continuarPedido = sc.nextInt();

                if(continuarPedido < 1 || continuarPedido > 2){
                    System.out.print("\nOpción no validad");
                }

            }while(continuarPedido < 1 || continuarPedido > 2);


        }while(continuarPedido != 2);

        iva = total*0.12;

        System.out.print("\n\t\t--Factura--");
        System.out.print("\n\t" + "Cliente: " + nombreCliente);
        System.out.print("\n\t" + "Numero de mesa: " + numeroMesa);
        System.out.print("\n\t" + "Iva: Q" + iva);
        System.out.print("\n\t" + "Total a pagar: Q" + total);

    }
}

