// Link de acesso dos exercicios: https://github.com/loiane/curso-java-basico/blob/master/exercicios/Exercicios%20Aula%2019.pdf
// personalizado por : Anna Karoline Nunes.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
        //mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
        //seja, B[i] = A[i].

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        // atribuindo os valores do vetor
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição "+ i);
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.print("Vetor A : " );
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("Vetor B : " );
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println(); // pula alinha

    }
}
