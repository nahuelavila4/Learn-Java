import java.util.Scanner;

public class while3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos valores va a ingresar?");
        int cantidad = teclado.nextInt();
        int inicial = 1;
        int par = 0, impar = 0;
        while(inicial <= cantidad){
            System.out.println("Ingresar valor: ");
            int actual = teclado.nextInt();
            if(actual % 2 == 0){
                par++;
            } else {
                impar++;
            }
            inicial++;
        }
        System.out.println(par+" numeros ingresados son pares");
        System.out.println(impar+" numeros ingresados son impares");

    }
}
