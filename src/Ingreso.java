public class Ingreso extends Transaccion {
     public Ingreso(int id, String tipoCuenta, double monto){
        super(id, tipoCuenta, monto);
    }
    
    @Override
    public double calcular(double ingreso){
       monto += ingreso;
       return monto;
    } 
    
}
