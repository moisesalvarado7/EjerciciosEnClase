/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioenclase3;

/**
 *
 * @author USUARIO
 */
public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void abonar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("");
            System.out.printf("Se han abonado %.2f a la cuenta.%n", monto);
        } else {
            System.out.println("El monto a abonar debe ser positivo.");
        }
    }

    public void debitar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("");
            System.out.printf("Se han debitado %.2f de la cuenta.%n", monto);
        } else if (monto > saldo) {
            System.out.println("");
            System.out.println("Fondos insuficientes.");
        } else {
            System.out.println("El monto a debitar debe ser positivo.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}
