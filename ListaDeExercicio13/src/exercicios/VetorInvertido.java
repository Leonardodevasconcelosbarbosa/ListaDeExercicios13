package exercicios;

import java.util.Scanner;

public class VetorInvertido {
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

        
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = temp;
        }

        
        System.out.println("Vetor invertido:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        sc.close();
    }
}