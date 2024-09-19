/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioenclase3;

import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear dos cuentas bancarias
        CuentaBancaria cuenta1 = new CuentaBancaria(0.00);
        CuentaBancaria cuenta2 = new CuentaBancaria(0.00);

        while (true) {
            System.out.println("\n=== Menu: Banco el amigo que te roba. ===");
            System.out.println("1. Abonar");
            System.out.println("2. Debitar");
            System.out.println("3. Consultar saldos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    abonar(scanner, cuenta1, cuenta2);
                    break;
                case 2:
                    debitar(scanner, cuenta1, cuenta2);
                    break;
                case 3:
                    mostrarSaldos(cuenta1, cuenta2);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    public static void abonar(Scanner scanner, CuentaBancaria cuenta1, CuentaBancaria cuenta2) {
        System.out.println("\nSeleccione la cuenta para abonar:");
        System.out.println("1. Cuenta No 1");
        System.out.println("2. Cuenta No 2");
        System.out.print("Ingrese su opción: ");
        int cuenta = scanner.nextInt();

        System.out.print("Ingrese el monto para abonar: ");
        double monto = scanner.nextDouble();

        if (cuenta == 1) {
            cuenta1.abonar(monto);
        } else if (cuenta == 2) {
            cuenta2.abonar(monto);
        } else {
            System.out.println("");
            System.out.println("Cuenta no válida.");
        }
    }

    public static void debitar(Scanner scanner, CuentaBancaria cuenta1, CuentaBancaria cuenta2) {
        System.out.println("\nSeleccione la cuenta para debitar:");
        System.out.println("1. Cuenta No 1");
        System.out.println("2. Cuenta No 2");
        System.out.print("Ingrese su opcion: ");
        int cuenta = scanner.nextInt();

        System.out.print("Ingrese el monto para debitar: ");
        double monto = scanner.nextDouble();

        if (cuenta == 1) {
            cuenta1.debitar(monto);
        } else if (cuenta == 2) {
            cuenta2.debitar(monto);
        } else {
            System.out.println("");
            System.out.println("Cuenta no valida.");
        }
    }

    public static void mostrarSaldos(CuentaBancaria cuenta1, CuentaBancaria cuenta2) {
        System.out.println("\nSaldo de la Cuenta No 1: " + cuenta1.consultarSaldo());
        System.out.println("Saldo de la Cuenta No 2: " + cuenta2.consultarSaldo());
    }
}
