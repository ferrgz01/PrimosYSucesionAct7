import javax.swing.*;
import java.util.Scanner;

public class Algoritmos {
    int num;

    //Constructor
    public Algoritmos(int count){
        this.num=count;
    }

    //Método números primos.
    public int[] numerosPrimos(){
        boolean primo;
        int cont = 0;
        int[] n_primos = new int[num];

        for (int n = 2; cont < num; n ++) {
            primo = true;
            for (int i = 2; i <= Math.sqrt(n) && primo; i ++) {
                if ((n % i) == 0) {
                    primo = false;
                }
            }
            if (primo) {
                n_primos[cont] = n;
                cont ++;
            }
        }


        return n_primos;
    }

    //Método serie de Fibonacci.
    public int[] fibo(){
        int f1=0;
        int f2=1;
        int[] fibonacci =new int[num];

        for (int i=2; i<=num; i++){
            fibonacci[i-2]=f1;
            fibonacci[i-1]=f2;
            f2 = f1 + f2;
            f1 = f2 - f1;
        }
        return fibonacci;
    }

}


