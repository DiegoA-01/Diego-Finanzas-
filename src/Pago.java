public class Pago extends Transaccion {
    
    public Pago(int id, String tipoCuenta, double monto){
        super(id, tipoCuenta, monto);
    }

    @Override
    public double calcular(double pago){
        monto -= pago;
        return monto;
    }
}
