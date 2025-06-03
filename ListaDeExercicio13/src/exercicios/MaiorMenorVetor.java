package exercicios;

import java.util.Scanner;

public class MaiorMenorVetor {
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

     
        int maior = vetor[0];
        int menor = vetor[0];

        
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

  
        System.out.println("O maior valor do vetor é: " + maior);
        System.out.println("O menor valor do vetor é: " + menor);

        sc.close();
    }
}