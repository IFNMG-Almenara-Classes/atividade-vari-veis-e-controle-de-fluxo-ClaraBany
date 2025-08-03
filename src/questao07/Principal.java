package questao07;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float l1,l2,l3;
        String resultado;

        System.out.println("Informe as medidas do triângulo");
        System.out.print("Lado 1: ");
        l1 = entrada.nextFloat();
        System.out.print("Lado 2: ");
        l2 = entrada.nextFloat();
        System.out.print("Lado 3: ");
        l3 = entrada.nextFloat();

        if(l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2){
            if(l1 == l2 && l1 == l3){
                resultado = "equilátero";
            } else if(l1 == l2 || l1 == l3 || l2 ==l3){
                resultado = "isósceles";
            } else{
                resultado = "escaleno";
            }
            System.out.println("O triângulo é " + resultado);
        } else
            System.out.print("As medidas não formam um triângulo");
    }
}