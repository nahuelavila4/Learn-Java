import java.util.Scanner;

public class Array5 {
    private Scanner teclado;
    private String[] paises;
    public void cargar(){
        teclado = new Scanner(System.in);
        paises = new String[5];
        for(int t = 0; t < paises.length; t++){
            System.out.println("Ingrese elemento "+(t+1));
            paises[t] = teclado.next();
        }
    }
    public void ordenar(){
        for(int k = 0; k < 4; k++){
            for(int x = 0; x < 4 - k; x++){
                if(paises[x].compareTo(paises[x+1]) > 0){
                    String auxiliar;
                    auxiliar = paises[x];
                    paises[x] = paises[x+1];
                    paises[x+1] = auxiliar;
                }
            }
        }
    }
    public void mostrar(){
        System.out.println("Array de paises ordenado");
        for(int r = 0; r < paises.length; r++){
            System.out.println(paises[r]);
        }
    }
    public static void main(String[] args) {
        Array5 countries = new Array5();
        countries.cargar();
        countries.ordenar();
        countries.mostrar();       
    }
}
