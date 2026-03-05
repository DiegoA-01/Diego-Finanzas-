public class Ingreso extends Transaccion {
     public Ingreso(int id, String tipoCuenta, double monto, String nombre, String apellido, String telefono){
        super(id, tipoCuenta, monto,nombre,apellido,telefono);
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
