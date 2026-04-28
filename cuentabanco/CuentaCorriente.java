package cuentabanco;

class CuentaCorriente extends Cuenta {

    private double sobregiro;

    public CuentaCorriente(String numeroCuenta, double saldo, double sobregiro) {
        super(numeroCuenta, saldo);
        this.sobregiro = sobregiro;
    }

    public double getSobregiro() {
        return sobregiro;
    }
    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public void retirar(double monto) {
        double limiteDisponible = getSaldo() + sobregiro;
        if (monto > 0 && monto <= limiteDisponible) {
            setSaldo(getSaldo() - monto);
            System.out.println("Retiro exitoso. Saldo actual: " + getSaldo());
        } else {
            System.out.println("Retiro rechazado. Limite disponible: " + limiteDisponible);
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Tipo: Cuenta Corriente");
        System.out.println("Numero de cuenta: " + getNumeroCuenta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Sobregiro disponible: " + sobregiro);
    }
    
}
