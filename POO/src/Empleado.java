import java.util.Scanner;

// Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su sueldo. 
// Confeccionar los métodos para la carga, otro para imprimir sus datos y por último 
// uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000) 
public class Empleado {
    private Scanner teclado;
    private String nombre;
    private float sueldo;

    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre empleado");
        nombre = teclado.next();
        System.out.println("Ingrese sueldo empleado");
        sueldo = teclado.nextFloat();
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldo);
    }

    public void impuestos() {
        if (sueldo >= 3000) {
            System.out.println("Debe pagar impuestos");
        } else {
            System.out.println("No debe pagar impuestos");
        }
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.inicializar();
        empleado1.mostrar();
        empleado1.impuestos();
    }

}
