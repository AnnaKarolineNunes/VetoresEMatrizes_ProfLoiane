// Link de acesso dos exercicios: https://github.com/loiane/curso-java-basico/blob/master/exercicios/Exercicios%20Aula%2019.pdf
// personalizado por : Anna Karoline Nunes.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
        //mesmo tipo e tamanho e com os elementos do vetor A multiplicados
        //por 2, ou seja: B[i] = A[i] * 2.

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.print("Vetor A : " );
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("Vetor B : " );
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}