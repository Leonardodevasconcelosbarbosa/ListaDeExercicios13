package exercicios;

import java.util.Scanner;

public class BuscarElemento {
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

        System.out.print("Digite o elemento para buscar: ");
        int elemento = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (vetor[i] == elemento) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Elemento " + elemento + " está presente no vetor.");
        } else {
            System.out.println("Elemento " + elemento + " não foi encontrado no vetor.");
        }

        sc.close();
    }
}