package producto;

class ProductoElectronico extends Producto {

    private int garantiaMeses;

    public ProductoElectronico(String nombre, double precio, int garantiaMeses) {
        super(nombre, precio);
        this.garantiaMeses = garantiaMeses;
    }
    
    @Override
    public void calcularPrecioFinal() {
        super.calcularPrecioFinal();
        double tasaImpuesto = 0.19;
        double impuesto = getPrecio() * tasaImpuesto;
        precio = getPrecio() + impuesto;
        System.out.println("Precio final del producto electrónico con impuesto del 19%: " + getPrecio());
        System.out.println("Meses de garantía: " + garantiaMeses);
    }

}
