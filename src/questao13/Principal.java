package questao13;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            opcao = entrada.nextInt();

            if(opcao > 0 && opcao < 5) {
                int n1, n2;
                float resultado = 0;

                System.out.println("Digite o primeiro numero: ");
                n1 = entrada.nextInt();
                System.out.println("Digite o segundo numero: ");
                n2 = entrada.nextInt();

                switch(opcao) {
                    case 1:
                        resultado = n1 + n2;
                        break;
                    case 2:
                        resultado = n1 - n2;
                        break;
                    case 3:
                        resultado = n1 * n2;
                        break;
                    case 4:
                        resultado = (float) n1 / n2;
                }
                System.out.println("Resultado= " + resultado);
            }

        }while(opcao!=5);
    }
}
