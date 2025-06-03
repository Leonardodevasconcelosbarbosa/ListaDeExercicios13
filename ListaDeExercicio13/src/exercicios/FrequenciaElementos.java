package exercicios;

import java.util.Scanner;

public class FrequenciaElementos {
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

        
        int[] elementosUnicos = new int[n];
        int[] frequencias = new int[n];
        int tamanhoUnicos = 0;

        for (int i = 0; i < n; i++) {
            int elementoAtual = vetor[i];
            boolean achou = false;
          
            for (int j = 0; j < tamanhoUnicos; j++) {
                if (elementosUnicos[j] == elementoAtual) {
                    frequencias[j]++;
                    achou = true;
                    break;
                }
            }
            
            if (!achou) {
                elementosUnicos[tamanhoUnicos] = elementoAtual;
                frequencias[tamanhoUnicos] = 1;
                tamanhoUnicos++;
            }
        }

       
        System.out.println("\nFrequência dos elementos:");
        for (int i = 0; i < tamanhoUnicos; i++) {
            System.out.println("Elemento " + elementosUnicos[i] + ": " + frequencias[i] + " vez(es)");
        }

        sc.close();
    }
}