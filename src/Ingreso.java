public class Ingreso extends Transaccion {
     public Ingreso(int id, String tipoCuenta, double monto){
        super(id, tipoCuenta, monto);
    }
    
    @Override
    public double calcularIngreso(double ingreso){
       monto += ingreso;
       return monto;
    } 

    @Override
    public double calcularResta(double valor) {
      monto -= valor;
      return monto; 
   }
}
