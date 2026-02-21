package View;

import java.util.Scanner;
import Controller.Somatoria;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Erro! N deve ser maior que zero.");
        } else {

            // Instanciando a classe da função recursiva
            Somatoria somatoria = new Somatoria();

            double resultado = somatoria.calcularSomatoria(n);

            System.out.println("Resultado da somatória é: " + resultado);
        }

        sc.close();
    }
}