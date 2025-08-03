package questao05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float total;

        System.out.print("Número de laranjas compradas: ");
        int quantidade = entrada.nextInt();

        if(quantidade < 12){
            total = quantidade * 0.50f;
        } else
            total = quantidade * 0.30f;

        System.out.printf("Valor total da compra = R$%.2f", total);
    }
}