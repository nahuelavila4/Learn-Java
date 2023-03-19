import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, num4, promedio, suma;
        System.out.println("Ingresar num1: ");
        num1 = teclado.nextInt();
        System.out.println("Ingresar num2: ");
        num2 = teclado.nextInt();
        System.out.println("Ingresar num3: ");
        num3 = teclado.nextInt();
        System.out.println("Ingresar num4: ");
        num4 = teclado.nextInt();
        suma = num1 + num2 + num3 + num4;
        promedio = suma / 4;
        System.out.println("La suma de los numeros es: ");
        System.out.println(suma);
        System.out.println("El promedio de los numeros es: ");
        System.out.println(promedio);

    }
}
