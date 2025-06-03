package exercicios;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = sc.nextInt();

       
        int[] vetor = new int[tamanho];

        
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

       
        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);

        sc.close();
    }
}