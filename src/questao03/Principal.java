package questao03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.print("Digite um número: ");
        n = entrada.nextInt();

        String resultado = (n%2 == 0) ? "par" : "ímpar";
        System.out.print("O número é " + resultado);
    }
}