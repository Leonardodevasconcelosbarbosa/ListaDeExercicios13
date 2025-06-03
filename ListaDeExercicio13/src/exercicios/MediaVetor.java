package exercicios;

import java.util.Scanner;

public class MediaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        
        double[] vetor = new double[tamanho];

      
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = sc.nextDouble();
        }

     
        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }

        
        double media = soma / tamanho;

  
        System.out.println("A média dos elementos do vetor é: " + media);

        sc.close();
    }
}