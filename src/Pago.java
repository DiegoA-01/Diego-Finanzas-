public class Pago extends Transaccion {
    
    public Pago(int id, String tipoCuenta, double monto){
        super(id, tipoCuenta, monto);
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
