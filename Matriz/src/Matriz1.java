import java.util.Scanner;

public class Matriz1 {
    private Scanner teclado;
    private int[][] mat;

    public void cargar() {
        teclado = new Scanner(System.in);
        mat = new int[3][4];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.println("Ingrese valor");
                mat[x][y] = teclado.nextInt();
            }
        }
    }

    public void primerfila() {
        System.out.println("Primer fila");
        for (int y = 0; y < 4; y++) {
            System.out.println(mat[0][y]);
        }
    }

    public void ultimafila() {
        System.out.println("Ultima fila");
        for (int y = 0; y < 4; y++) {
            System.out.println(mat[2][y]);
        }
    }

    public void primercolumna() {
        System.out.println("Ultima columna");
        for (int r = 0; r < 3; r++) {
            System.out.println(mat[r][0]);
        }
    }

    public static void main(String[] args) {
        Matriz1 orden = new Matriz1();
        orden.cargar();
        orden.primerfila();
        orden.ultimafila();
        orden.primercolumna();
    }
}