
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Transaccion> transacciones = new ArrayList<>();

        Informacion informacion = new Informacion("Diego", "Pineda", "Calarca", 25);
        Transaccion transaccion = new Ingreso(125546, "Nequi", 0);
        
        
        int menu;
        
        

        do {
            System.out.println("=====SISTEMA DE FINANZAS FAMILIA======");
            System.out.println("1:Agregar Saldo.");
            System.out.println("2:Pago.");
            System.out.println("3:Consultar saldo");
            System.out.println("4:Ver Historial.");
            System.out.println("5:Salir.");

            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Su informacion: " + informacion + " \nIngrese monto a agregar: ");
                    double ingreso = scanner.nextDouble();
                    Transaccion tIngreso = new Ingreso(125546, "Nequi", ingreso);
                    transacciones.add(tIngreso);

                    transaccion.calcularIngreso(ingreso);
                    break;
                case 2:
                    System.out.println("Su informacion es: " + informacion + " \nIngrese monto a pagar: ");
                    double pago = scanner.nextDouble();
                    Transaccion tPago = new Pago(125546, "Nequi", pago);
                    transacciones.add(tPago);

                    transaccion.calcularResta(pago);
                    break;
                case 3:
                    System.out.println("Saldo actual es: " + transaccion.consultarSaldo());
                    break;

                case 4:
                    System.out.println("Historial de transacciones: ");

                    for (Transaccion t : transacciones) {
                        System.out.println("Tipo de cuenta"+ t.tipoCuenta + " Monto: " + t.monto);
                        break;
                    }
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        } while (menu !=5);
        scanner.close();
    }
}
