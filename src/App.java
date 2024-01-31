import calculadora.Calculadora;

public class App {
  public static void main(String[] args) throws Exception {

    Calculadora calculadora = new Calculadora();
    int soma = calculadora.somarDoisNumeros(2, 2);
    int subtracao = calculadora.subtrairDoisNumeros(3, 2);
    int multiplicacao = calculadora.multiplicarDoisNumeros(4, 2);
    int divisao = calculadora.dividirDoisNumeros(8, 2);

    System.out.println("Soma: %s".formatted(soma));
    System.out.println("Subtração: %s".formatted(subtracao));
    System.out.println("Multiplicação: %s".formatted(multiplicacao));
    System.out.println("Divisão: %s".formatted(divisao));
  }
}
