package questao12;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n, total = 0, qnt = 0, somaPar = -1;
        double media;

        do{
            System.out.print("Informe um número: ");
            n = entrada.nextInt();
            if(n%2 == 0){
                somaPar++;
            }
            total += n;
            qnt++;

        }while(n != 0);

        media = (double) total/(qnt-1);
        System.out.println("Números pares: " + somaPar);
        System.out.print("Média dos números : " + media);
    }
}
