package questao01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int n1, n2;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.print("Informe o segundo número: ");
        n2 = entrada.nextInt();

        if(n1>n2){
            System.out.print("O maior número é: " + n1);
        } else
            System.out.print("O maior número é: " + n2);
    }
}