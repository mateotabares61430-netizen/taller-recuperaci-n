package vehiculo;

public class Vehiculo {

    private String marca;
    private int velocidad;
    

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = 0;
    }

    public void acelerar() {

        System.out.println("acelerando... ");
        velocidad = getVelocidad() + 10;
        System.out.println("velocidad: " + getVelocidad());

    }
    
    public void mostrarEstado() {

        

    }

}
