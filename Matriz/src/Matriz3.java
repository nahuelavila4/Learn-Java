
//Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primer fila con la segundo. Imprimir luego la matriz. 
import java.util.Scanner;

public class Matriz3 {
    private Scanner teclado;
    private int[][] mat;
    private int[][] auxiliar;

    public void cargar() {
        teclado = new Scanner(System.in);

        System.out.println("Ingrese cantidad filas");
        int filas = teclado.nextInt();
        System.out.println("Ingrese cantidad columnas");
        int col = teclado.nextInt();
        mat = new int[filas][col];
        for (int x = 0; x < mat.length; x++) {
            System.out.println("Ingrese valores de la fila " + (x + 1));
            for (int y = 0; y < mat[x].length; y++) {
                mat[x][y] = teclado.nextInt();
            }
        }
    }

    public void intercambiar() {
        System.out.println("Intercambio primera y segunda fila");
        for (int y = 0; y < mat[0].length; y++) {
            int auxiliar = mat[0][y];
            mat[0][y] = mat[1][y];
            mat[1][y] = auxiliar;
        }
    }

    public void mostrar() {
        System.out.println("Matriz completa");
        for (int x = 0; x < mat.length; x++) {
            for (int y = 0; y < mat[x].length; y++) {
                System.out.print(mat[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz3 matriz = new Matriz3();
        matriz.cargar();
        matriz.intercambiar();
        matriz.mostrar();
    }
}