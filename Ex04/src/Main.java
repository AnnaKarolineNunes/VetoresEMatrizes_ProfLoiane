// Link de acesso dos exercicios: https://github.com/loiane/curso-java-basico/blob/master/exercicios/Exercicios%20Aula%2019.pdf
// personalizado por : Anna Karoline Nunes.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
        //mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
        //raiz quadrada do respectivo elemento de A, ou seja:
        //B[i] = sqrt(A[i]).

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição " + i );
            vetorA[i] = scanner.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Vetor A :  ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.print("Vetor B : ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}