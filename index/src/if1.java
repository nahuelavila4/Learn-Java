import java.util.Scanner;

public class if1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("ingresar num1: ");
        num1 = teclado.nextInt();
        System.out.println("Ingresar num2: ");
        num2 = teclado.nextInt();
        if (num1 > num2) {
            int suma = num1 + num2;
            int resta = num1 - num2;
            System.out.println("La suma de los num es " + suma + " y la resta " + resta);
        }
        System.out.println("La multiplicacion es " + num1 * num2 + " y la division " + num2 / num1);
    }
}