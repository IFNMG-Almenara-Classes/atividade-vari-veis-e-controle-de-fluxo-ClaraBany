package questao20;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.print("Informe um número: ");
        n = entrada.nextInt();

        if(n%3 == 0){
            if(n%5 == 0){
                return;
            }
            System.out.print("Divisivel por 3");
        }else if(n%5 == 0){
            System.out.print("Divisível por 5");
        }
    }
}
