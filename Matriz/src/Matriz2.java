
//Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes por columna (es decir primero ingresar toda la primer columna, luego la segunda columna y así sucesivamente)
//Imprimir luego la matriz. 
import java.util.Scanner;

public class Matriz2 {
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar() {
        teclado = new Scanner(System.in);
        mat = new int[2][5];
        for (int x = 0; x < 5; x++) {
            System.out.println("Ingrese valores de la columna N° " + (x + 1));
            for (int y = 0; y < 2; y++) {
                mat[y][x] = teclado.nextInt();
            }
        }
    }

    public void mostrar() {
        System.out.println("Matriz completa");
        for (int c = 0; c < 2; c++) {
            for (int v = 0; v < 5; v++) {
                System.out.print(mat[c][v]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz2 matriz = new Matriz2();
        matriz.cargar();
        matriz.mostrar();
    }
}