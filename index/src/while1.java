import java.util.Scanner;

public class while1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner teclado = new Scanner(System.in);
        int num1;
        int x = 1;
        System.out.println("ingrese num");
        num1 = teclado.nextInt();
        while(x <= num1){
            System.out.println(x);
            x++;
        }
    }
}
