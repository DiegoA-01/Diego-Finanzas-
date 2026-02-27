public abstract class Transaccion {
     protected int id;
     protected String tipoCuenta;
     protected double monto;
   

    public Transaccion(int id, String tipoCuenta, double monto){
        this.id = id;
        this.tipoCuenta = tipoCuenta;
        this.monto = monto;
    }
    public abstract double calcular(double valor);


    public  double consultarSaldo() {
       return monto;
    }
}
