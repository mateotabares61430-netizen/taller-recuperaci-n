package cuentabanco;

public class Main {

    public static void main(String[] args) {

        System.out.println(" cuenta de ahorros ");
        CuentaAhorros ahorros = new CuentaAhorros("AH-001", 1000, 5);
        ahorros.mostrarInfo();

        System.out.println();
        ahorros.depositar(500);       
        ahorros.retirar(200);      
        ahorros.retirar(2000);
        ahorros.aplicarInteres();

        System.out.println("Saldo final ahorros: " + ahorros.getSaldo());


        System.out.println("Cuenta corriente");
        CuentaCorriente corriente = new CuentaCorriente("CC-001", 500, 300);
        corriente.mostrarInfo();

        corriente.depositar(100);
        corriente.retirar(800);       // usa el sobregiro, saldo pasa a -200
        corriente.retirar(200);       // rechazado, limite disponible es solo 100

        System.out.println();
        System.out.println("Saldo final corriente: " + corriente.getSaldo());
    }
    
}
