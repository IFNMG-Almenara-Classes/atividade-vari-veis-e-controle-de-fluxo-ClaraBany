package questao11;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int n;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número positivo: ");
        n = entrada.nextInt();

        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
