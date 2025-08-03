package questao21;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade, tempo;

        System.out.print("Idade: ");
        idade = entrada.nextInt();
        System.out.print("Tempo de serviço: ");
        tempo = entrada.nextInt();

        if(idade >= 65 || tempo >= 30 || (idade >= 60 && tempo >= 25)){
            System.out.print("Parabéns, você já pode aposentar!");
        } else System.out.print("Infelizmente você ainda não pode aposentar1");
    }
}
