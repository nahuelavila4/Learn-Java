import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner teclado = new Scanner(System.in);
        int num1, num2, suma, producto;
        System.out.println("Ingrese primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese segundo numero: ");
        num2 = teclado.nextInt();
        suma = num1 + num2;
        producto = num1 * num2;
        System.out.println("La suma de los numeros es: ");
        System.out.println(suma);
        System.out.println("La multiplicacion de los numeros es: ");
        System.out.println(producto);
    }
}
