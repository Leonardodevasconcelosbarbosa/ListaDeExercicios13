package exercicios;

import java.util.Scanner;

public class RemoverElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Digite o elemento a ser removido: ");
        int elemento = sc.nextInt();

 
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] == elemento) {
                count++;
            }
        }

       
        int[] novoVetor = new int[n - count];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] != elemento) {
                novoVetor[j] = vetor[i];
                j++;
            }
        }

        System.out.println("\nVetor após remover o elemento " + elemento + ":");
        if (novoVetor.length == 0) {
            System.out.println("Vetor está vazio após a remoção.");
        } else {
            for (int i = 0; i < novoVetor.length; i++) {
                System.out.print(novoVetor[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}