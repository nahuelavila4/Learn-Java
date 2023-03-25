import java.util.Scanner;

//Implementar la clase operaciones. Se deben cargar dos valores enteros, calcular su suma, resta, multiplicación y división, cada una en un método, imprimir dichos resultados. 

public class Operaciones {
    private Scanner teclado;
    private int valor1, valor2;

    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese valor 1");
        valor1 = teclado.nextInt();
        System.out.println("Ingrese valor 2");
        valor2 = teclado.nextInt();
    }
    public void sumar(){
        int suma = valor1 + valor2;
        System.out.println("Suma: "+suma);
    }
    public void resta(){
        int resta = valor1 - valor2;
        System.out.println("Resta: "+resta);
    }
    public void multiplicacion(){
        int multi = valor1 * valor2;
        System.out.println("Multiplicacion: "+multi);
    }
    public void division(){
        int div = valor1 / valor2;
        System.out.println("Division: "+div);
    }
    public static void main(String[] args) {
        Operaciones operacion1 = new Operaciones();
        operacion1.inicializar();
        operacion1.sumar();
        operacion1.resta();
        operacion1.multiplicacion();
        operacion1.division();
    }
}
