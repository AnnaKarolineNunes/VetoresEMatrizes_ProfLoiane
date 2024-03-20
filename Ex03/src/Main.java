// Link de acesso dos exercicios: https://github.com/loiane/curso-java-basico/blob/master/exercicios/Exercicios%20Aula%2019.pdf
// personalizado por : Anna Karoline Nunes.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
        //mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
        //ser o quadrado do respectivo elemento de A, ou seja:
        //B[i] = A[i] * A[I].

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i] *  vetorA[i];
        }

        System.out.println("Vetor A : ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("Vetor B : ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}