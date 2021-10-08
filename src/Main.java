import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        int count;

        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese número: ");
        count=leer.nextInt();

        Algoritmos algoritmo1 = new Algoritmos(count);

        int []n_primos=algoritmo1.numerosPrimos();
        int[]fibonacci=algoritmo1.fibo();

        System.out.println("Los números primos son: ");
        for (int i=0;i<count;i++){
            System.out.print(n_primos[i] + ", ");
        }

        System.out.println("\n"+"La sucesión de fibonacci son: ");
        for (int i=0;i<count;i++){
            System.out.print(fibonacci[i] + ", ");
        }

    }
}
