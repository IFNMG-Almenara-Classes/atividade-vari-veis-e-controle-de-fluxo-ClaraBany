package questao19;

import java.util.Scanner;

public class Principal {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int n;
        String dia = "";

        System.out.print("Informe um número de 1 a 7: ");
        n=entrada.nextInt();

        switch (n){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                System.out.print("Número inválido");
        }

        System.out.print("Dia da semana = " + dia);
    }
}
