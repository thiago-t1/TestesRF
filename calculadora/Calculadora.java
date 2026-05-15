package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas.
 * Desenvolvida como módulo de cálculos para o sistema FinançApp.
 *
 * @author Thiago
 * @version 1.1
 */
public class Calculadora {

    /**
     * Método principal que recebe os operandos e a operação desejada.
     *
     * @param a Primeiro número inteiro da operação.
     * @param b Segundo número inteiro da operação.
     * @param op String representando a operação ("+", "-", "*", "/").
     * @return O resultado da operação em formato numérico (double) ou Double.NaN em caso de erro.
     */
    public double calc(int a, int b, String op) {
        switch (op) {
            case "+":
                return somar(a, b);
            case "-":
                return subtrair(a, b);
            case "*":
                return multiplicar(a, b);
            case "/":
                return dividir(a, b);
            default:
                System.out.println("Erro: Operação inválida ('" + op + "').");
                return Double.NaN; 
        }
    }

    /**
     * Realiza a soma de dois números inteiros.
     * @param a Primeiro número
     * @param b Segundo número
     * @return A soma de a e b
     */
    private double somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números inteiros.
     * @param a Primeiro número
     * @param b Segundo número
     * @return A subtração de a por b
     */
    private double subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números inteiros.
     * @param a Primeiro número
     * @param b Segundo número
     * @return A multiplicação de a por b
     */
    private double multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números inteiros, com validação de divisão por zero.
     * @param a Dividendo
     * @param b Divisor
     * @return O resultado da divisão, ou Double.NaN se houver tentativa de divisão por zero.
     */
    private double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: Não é possível realizar divisão por zero.");
            return Double.NaN;
        }
        // Conversão (cast) para double para evitar perda de precisão na divisão de inteiros
        return (double) a / b;
    }
}