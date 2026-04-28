package producto;

public class Main {

public static void main(String[] args) {
    ProductoAlimenticio productoalimenticio1 = new ProductoAlimenticio("Ramen", 10000, "02-2027");
    ProductoAlimenticio productoalimenticio2 = new ProductoAlimenticio("Pastel de pollo", 4500, "30-04-2026");
    ProductoElectronico productoelectronico1 = new ProductoElectronico("Microondas", 250000, 12);
    ProductoElectronico productoelectronico2 = new ProductoElectronico("Air fryer", 400000, 24);

    productoalimenticio1.calcularPrecioFinal();
    productoalimenticio2.calcularPrecioFinal();
    productoelectronico1.calcularPrecioFinal();
    productoelectronico2.calcularPrecioFinal();
    }
    
}
