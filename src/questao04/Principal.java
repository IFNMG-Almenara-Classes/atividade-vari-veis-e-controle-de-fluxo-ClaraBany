package questao04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a senha: ");
        int senhaInformada = entrada.nextInt();

        if(senhaInformada == 1234){
            System.out.print("ACESSO PERMITIDO");
        } else
            System.out.print("ACESSO NEGADO");
    }
}