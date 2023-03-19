import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int preguntas, aciertos;
        System.out.println("Ingrese cantidad de preguntas: ");
        preguntas = teclado.nextInt();
        System.out.println("Ingrese cantidad de aciertos: ");
        aciertos = teclado.nextInt();
        int porcentaje = aciertos * 100 / preguntas;
        System.out.println(porcentaje);
        if (porcentaje >= 90) {
            System.out.println("Usted esta en el nivel maximo");
        } else {
            if (porcentaje >= 75 && porcentaje < 90) {
                System.out.println("Nivel medio");
            } else {
                if (porcentaje >= 50 && porcentaje < 75) {
                    System.out.println("Nivel regular");
                } else {
                System.out.println("Fuera de nivel");
                }
            }
        }
    }
}
