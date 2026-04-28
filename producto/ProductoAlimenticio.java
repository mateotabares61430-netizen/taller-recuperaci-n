package producto;

class ProductoAlimenticio extends Producto {

    private String fechaVencimiento;

    public ProductoAlimenticio(String nombre, double precio, String fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public void calcularPrecioFinal() {
        super.calcularPrecioFinal();
        precio = getPrecio() * 0.90;
        System.out.println("Precio final del producto alimenticio con 10% de descuento: " + getPrecio());
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
    }
    
}
