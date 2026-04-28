package vehiculo;

class Carro extends Vehiculo {

    private int puertas;
    
    public Carro(String marca, int velocidad, int puertas) {
        super(marca, velocidad);
        this.puertas = puertas;
    }
    
    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("carro encendido a : " + getVelocidad() + " km/h");
        System.out.println("número de puertas del carro: " + puertas);
    }

}
