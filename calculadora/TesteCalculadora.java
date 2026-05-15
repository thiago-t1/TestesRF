package calculadora;

/**
 * Classe responsável por executar testes funcionais no módulo Calculadora.
 * 
 * @author Thiago
 * @version 1.0
 */
public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== INÍCIO DOS TESTES FUNCIONAIS ===\n");

        executarTeste(calc, "Soma", 10, 5, "+", 15.0);
        executarTeste(calc, "Subtração", 20, 8, "-", 12.0);
        executarTeste(calc, "Multiplicação", 4, 6, "*", 24.0);
        executarTeste(calc, "Divisão", 15, 3, "/", 5.0);
        
        System.out.println("--- Testes de Tratamento de Erros ---");
        executarTeste(calc, "Divisão por Zero", 10, 0, "/", Double.NaN);
        executarTeste(calc, "Operação Inválida", 10, 5, "x", Double.NaN);

        System.out.println("\n=== FIM DOS TESTES ===");
    }

    /**
     * Método auxiliar para padronizar a saída dos testes no console.
     */
    private static void executarTeste(Calculadora calculadora, String nomeTeste, int a, int b, String op, double resultadoEsperado) {
        System.out.println("Teste: " + nomeTeste);
        System.out.println("Entradas: a = " + a + ", b = " + b + ", op = '" + op + "'");
        
        double resultadoObtido = calculadora.calc(a, b, op);
        
        System.out.println("Resultado Esperado: " + resultadoEsperado);
        System.out.println("Resultado Obtido: " + resultadoObtido);
        
        // Validação do teste (tratando o caso específico do Double.NaN)
        boolean passou = (Double.isNaN(resultadoEsperado) && Double.isNaN(resultadoObtido)) 
                         || (resultadoEsperado == resultadoObtido);
                         
        System.out.println("Status: " + (passou ? "[PASSOU]" : "[FALHOU]"));
        System.out.println("-------------------------------------");
    }
}