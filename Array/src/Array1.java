import java.util.Scanner;

// Desarrollar un programa que permita ingresar un vector de 8 elementos, e
// informe:
// El valor acumulado de todos los elementos del vector.
// El valor acumulado de los elementos del vector que sean mayores a 36.
// Cantidad de valores mayores a 50.

public class Array1{
    private int[] cargar;
    public void cargar(){
        Scanner teclado = new Scanner(System.in);
        cargar = new int[8];
        for(int x = 0; x < 8; x++){
            System.out.println("Ingrese valor "+(x+1));
            cargar[x] = teclado.nextInt();
        }
    }
    public void acumulado(){
        int suma = 0;
        for(int x = 0; x < 8; x++){
            suma += cargar[x];
        }
        System.out.println("El valor acumulado es "+suma);
    }
    public void mayor36(){
        int sumamayor36 = 0;
        for(int x = 0; x < 8; x++){
            if(cargar[x] >= 36){
                sumamayor36 += cargar[x];
            }
        }
        System.out.println("El valor acumulado de los elementos mayores a 36 es "+sumamayor36);
    }
    public void cantmayor50(){
        int mayores50 = 0;
        for(int x = 0; x < 8; x++){
            if(cargar[x] >= 50){
                mayores50++;
            }
        }
        System.out.println("Elementos mayores a 50 son "+mayores50);
    }
    public static void main(String[] args) {
        Array1 valores = new Array1();
        valores.cargar();
        valores.acumulado();
        valores.mayor36();
        valores.cantmayor50();
    }
}


