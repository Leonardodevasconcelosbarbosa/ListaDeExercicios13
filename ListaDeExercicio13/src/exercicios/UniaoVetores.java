package exercicios;

import java.util.Scanner;

public class UniaoVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Informe o tamanho do primeiro vetor: ");
        int n1 = sc.nextInt();
        int[] vetor1 = new int[n1];
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < n1; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = sc.nextInt();
        }

        
        System.out.print("Informe o tamanho do segundo vetor: ");
        int n2 = sc.nextInt();
        int[] vetor2 = new int[n2];
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < n2; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = sc.nextInt();
        }

       
        int[] vetorUniao = new int[n1 + n2];

 
        for (int i = 0; i < n1; i++) {
            vetorUniao[i] = vetor1[i];
        }

        
        for (int i = 0; i < n2; i++) {
            vetorUniao[n1 + i] = vetor2[i];
        }

        System.out.println("\nVetor união:");
        for (int i = 0; i < vetorUniao.length; i++) {
            System.out.print(vetorUniao[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}