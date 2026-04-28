package vehiculo;

class Moto extends Vehiculo {

    private String cilindraje;

    public Moto(String marca, int velocidad, String cilindraje) {
        super(marca, velocidad);
        this.cilindraje = cilindraje;

    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("moto encendida a : " + getVelocidad() + " km/h");
        System.out.println("cilindraje de la moto: " + cilindraje);
    }    
    
}
