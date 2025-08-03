package questao02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float peso, altura, imc;
        String classificacao;

        System.out.print("Informe o seu peso: ");
        peso = entrada.nextFloat();
        System.out.print("Informe a sua altura: ");
        altura = entrada.nextFloat();

        imc = peso/(altura * altura);

        if(imc < 18.5){
            classificacao = "Magreza";
        } else if (imc < 24.9){
            classificacao = "Saudável";
        } else if(imc < 29.9){
            classificacao = "Sobrepeso";
        } else if(imc < 34.9){
            classificacao = "Obesidade Grau I";
        } else if(imc < 39.9){
            classificacao = "Obesidade Grau II (Severa)";
        } else
            classificacao = "Obesidade Grau III (Mórbida)";

        System.out.printf("O seu imc é %.2f e você está %s", imc, classificacao);
    }
}