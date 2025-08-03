package questao14;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float valor, total = 0;
        int cliente;

        System.out.print("Valor da compra: ");
        valor = entrada.nextFloat();

        System.out.println("1 - Comum");
        System.out.println("2 - VIP");
        System.out.println("3 - Funcionário");
        System.out.print("Cliente: ");
        cliente = entrada.nextInt();

        if(cliente == 2){
            total = valor * 0.95f;
        } else  if(cliente == 3){
            total = valor * 0.90f;
        }

        System.out.print("Total da compra: " + total);
    }
}
