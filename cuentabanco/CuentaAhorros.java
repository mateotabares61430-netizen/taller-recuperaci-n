package cuentabanco;

class CuentaAhorros extends Cuenta {

    private double interes;

    public CuentaAhorros(String numeroCuenta, double saldo, double interes) {
        super(numeroCuenta, saldo);
        this.interes = interes;
    }

    public double getInteres() { 
        return interes; 
    }
    public void setInteres(double interes) { 
        this.interes = interes; 
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
            System.out.println("Retiro exitoso. Saldo actual: " + getSaldo());
        } else {
            System.out.println("Retiro rechazado. Saldo insuficiente. Saldo actual: " + getSaldo());
        }
    }

    public void aplicarInteres() {
        double ganancia = getSaldo() * interes / 100;
        setSaldo(getSaldo() + ganancia);
        System.out.println("Interes aplicado. Ganancia: " + ganancia + ". Saldo actual: " + getSaldo());
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Tipo: Cuenta Ahorros");
        System.out.println("Numero de cuenta: " + getNumeroCuenta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Interes: " + interes + "%");
    }
    
}
