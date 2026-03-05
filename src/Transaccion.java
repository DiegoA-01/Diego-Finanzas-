public abstract class Transaccion {
     protected int id;
     protected String tipoCuenta;
     protected double monto;
     protected String nombre,apellido,telefono;
   

    public Transaccion(int id, String tipoCuenta, double monto,String nombre, String apellido,String telefono){
        this.id = id;
        this.tipoCuenta = tipoCuenta;
        this.monto = monto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    public abstract double calcularIngreso(double valor);
    public abstract double calcularResta(double valor);


    public  double consultarSaldo() {
       return monto;
    }

    public void  mostrarInfo(){
        System.out.println("Nombre: " + nombre + "Apellido: " + "Telefono: " + telefono );
    }
}
