package questao16;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.print("Informe um numero: ");
        n = entrada.nextInt();

        System.out.println("Tabuada Multiplicação");
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",i,n,i*n);
        }
        System.out.println("Tabuada Divisão");
        for(int i=1;i<=10;i++){
            System.out.printf("%d / %d = %.2f\n",n,i,(float)n/i);
        }
    }
}
