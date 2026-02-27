public class Informacion {
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected int edad;

    public Informacion(String nombre, String apellido, String direccion, int edad ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Direccion: " + direccion);
        System.out.println("Edad: " + edad);
    }
}
