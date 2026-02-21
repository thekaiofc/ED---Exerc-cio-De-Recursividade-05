package Controller;

public class Somatoria {

    // Construtor da classe
    public Somatoria() {
        // Utilizado apenas para instanciar o objeto
    }

    // Metodo recursivo que calcula a somatória S = 1 + 1/2 + 1/3 + ... + 1/N
    public double calcularSomatoria(int n) {

        /*
         * CONDIÇÃO DE PARADA:
         * Quando n for igual a 1, a somatória é igual a 1.
         */
        if (n == 1) {
            return 1.0;
        }

        /*
         * CHAMADA DOS PASSOS:
         * A somatória até n é definida como:
         * S(n) = 1/n + S(n - 1)
         * O termo atual (1/n) é somado ao resultado da somatória anterior.
         */
        return (1 / (double) n) + calcularSomatoria(n - 1);
    }
}
