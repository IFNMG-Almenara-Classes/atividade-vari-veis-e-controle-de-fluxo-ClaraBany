package questao17;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, total = 1;

        System.out.print("Informe um número: ");
        n = entrada.nextInt();

        for(int i=n; i>0; i--){
            total *= i;
        }

        System.out.printf("%d! = %d", n, total);
    }
}
