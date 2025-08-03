package questao18;

import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int n1, n2;

        System.out.print("Informe o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.print("Informe o segundo número: ");
        n2 = entrada.nextInt();

        for (int i=n1; i<=n2; i++){
            if(i < 2) continue;
            boolean primo = true;

            for(int j = 2; j <= Math.sqrt(i); j++){
                if (i%j==0){
                    primo = false;
                }
            }
            if (primo){
                System.out.println(i);
            }
        }
    }
}
