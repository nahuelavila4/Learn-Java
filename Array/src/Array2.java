import java.util.Scanner;

//Realizar un programa que pida la carga de dos vectores numéricos enteros de 4 elementos. Obtener la suma de los dos vectores, dicho resultado guardarlo en un tercer vector del mismo tamaño. Sumar componente a componente. 

public class Array2 {
    private int[] array1;
    private int[] array2;
    private int[] suma;
    public void cargar() {
        Scanner teclado = new Scanner(System.in);
        array1 = new int[4];
        array2 = new int[4];
        for (int x = 0; x < 4; x++) {
            System.out.println("Ingrese valor " + (x+1) + " del primer array");
            array1[x] = teclado.nextInt();
            System.out.println("Ingrese valor " + (x+1) + " del segundo array");
            array2[x] = teclado.nextInt();
        }
    }

    public void suma() {
        suma = new int[4];
        for (int t = 0; t < 4; t++) {
            suma[t] = array1[t] + array2[t];
        }
        System.out.println("Array de la suma");
        for(int r = 0; r < 4; r++){
            System.out.println(suma[r]);
        }
    }

    public static void main(String[] args) {
        Array2 sumaarray = new Array2();
        sumaarray.cargar();
        sumaarray.suma();
    }
}
