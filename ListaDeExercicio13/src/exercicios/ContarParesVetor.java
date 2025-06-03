package exercicios;

import java.util.Scanner;

public class ContarParesVetor {
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

      
        int contadorPares = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Quantidade de números pares no vetor: " + contadorPares);

        sc.close();
    }
}