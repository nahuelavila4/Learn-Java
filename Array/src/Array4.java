import java.util.Scanner;

import javax.security.sasl.SaslException;

//Cargar un vector de n elementos. imprimir el menor y un mensaje si se repite dentro del vector.

public class Array4 {
    private Scanner teclado;
    private int[] arr1;

    public void cargar() {
        teclado = new Scanner(System.in);
        System.out.println("Cuantos valores va a ingresar?");
        int cantidad = teclado.nextInt();
        arr1 = new int[cantidad];
        for (int r = 0; r < arr1.length; r++) {
            System.out.println("Ingrese valor " + (r + 1));
            arr1[r] = teclado.nextInt();
        }
    }

    public void menor() {
        int menorr = arr1[0];
        int num = 0;
        boolean repite = false;
        for (int t = 1; t < arr1.length; t++) {
            if (arr1[t] == menorr) {
                num = arr1[t];
                repite = true;
            } else if (arr1[t] < menorr) {
                menorr = arr1[t];
            }
        }
        System.out.println("El valor menor del array es " + menorr);
        if (repite) {
            System.out.println("El valor " + num + " se repite");
        }
    }

    public static void main(String[] args) {
        Array4 nuevoarr = new Array4();
        nuevoarr.cargar();
        nuevoarr.menor();
    }
}
