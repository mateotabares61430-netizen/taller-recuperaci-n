package vehiculo;

public class Main {

public static void main(String[] args) {
    Carro carro = new Carro("Chevrolet", 0, 5);
    Moto moto = new Moto("Suzuki", 0, "250");

    carro.acelerar();
    carro.acelerar();
    carro.mostrarEstado();
    moto.acelerar();
    moto.acelerar();
    moto.acelerar();
    moto.acelerar();
    moto.acelerar();
    moto.mostrarEstado();

}


    
}
