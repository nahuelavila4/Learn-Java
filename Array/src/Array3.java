import java.util.Scanner;

//Desarrollar un programa que permita ingresar un vector de n elementos, ingresar n por teclado. Luego imprimir la suma de todos sus elementos 

public class Array3 {
    private int[] arr1;
    private Scanner teclado;

    public void cargar() {
        teclado = new Scanner(System.in);
        System.out.println("Cuantos valores va a ingresar?");
        int cantidad = teclado.nextInt();
        arr1 = new int[cantidad];
        for (int r = 0; r < arr1.length; r++) {
            System.out.println("Ingresar valor " + (r + 1));
            arr1[r] = teclado.nextInt();
        }
    }

    public void mostrar() {
        int suma = 0;
        System.out.println("");
        System.out.println("Array ingresado");
        for (int y = 0; y < arr1.length; y++) {
            System.out.println(arr1[y]);
            suma += arr1[y];
        }
        System.out.println("Suma de los elementos " + suma);
    }

    public static void main(String[] args) {
        Array3 nuevoarr = new Array3();
        nuevoarr.cargar();
        nuevoarr.mostrar();
    }
}
