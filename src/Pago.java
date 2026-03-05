public class Pago extends Transaccion {
    
    public Pago(int id, String tipoCuenta, double monto, String nombre, String apellido, String telefono){
        super(id, tipoCuenta, monto,nombre,apellido,telefono);
    }

    @Override
    public double calcularResta(double pago){
        monto -= pago;
        return monto;
    }
    @Override
    public double calcularIngreso(double valor) {
        monto += valor;
        return monto;
    }
}
