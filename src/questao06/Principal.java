package questao06;

import java.util.Scanner;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1,n2,n3, maior;

        System.out.print("Informe o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.print("Informe o Segundo número: ");
        n2 = entrada.nextInt();
        System.out.print("Informe o terceiro número: ");
        n3 = entrada.nextInt();

        maior = n1;

        if(n2 > maior && n2 > n3){
            maior = n2;
        } else if(n3 > maior){
            maior = n3;
        }

        System.out.print("O maior é número é " + maior);
    }
}