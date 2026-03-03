import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Informacion informacion = new Informacion("Diego", "Pineda", "Calarca", 25);
        Transaccion transaccion = new Ingreso(125546, "Nequi", 0);
        
        
        int menu;
        
        

        do {
            System.out.println("=====SISTEMA DE FINANZAS FAMILIA======");
            System.out.println("1:Agregar Saldo.");
            System.out.println("2:Pago.");
            System.out.println("3:Consultar saldo");
            System.out.println("4:Salir.");

            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Su informacion: " + informacion + " \nIngrese monto a agregar: ");
                    double ingreso = scanner.nextDouble();
                    transaccion.calcularIngreso(ingreso);
                    break;
                case 2:
                    System.out.println("Su informacion es: " + informacion + " \nIngrese monto a pagar: ");
                    double pago = scanner.nextDouble();
                    transaccion.calcularResta(pago);
                    break;
                case 3:
                    System.out.println("Saldo actual es: " + transaccion.consultarSaldo());
                    break;
                default:
                    System.out.println("Opcion invalida..");
                    break;
            }
        } while (menu !=4);
        scanner.close();
    }
}
