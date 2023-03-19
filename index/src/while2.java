import java.util.Scanner;

public class while2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner teclado = new Scanner(System.in);
        int numeros = 1;
        int suma = 0;
        while(numeros <= 10){
            int valor;
            System.out.println("Ingresar valor");
            valor = teclado.nextInt();
            suma = suma + valor;
            numeros++;
        }
        System.out.println("Suma de valores: "+suma);
    }
}
