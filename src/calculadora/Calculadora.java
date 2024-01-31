package calculadora;

public class Calculadora {

  public Calculadora() {
    mostrarMenu();
  }

  private void mostrarMenu() {
    int opcao = 0;

    do {
      mostrarOpcoes();
      opcao = Integer.parseInt(System.console().readLine());

      if (opcao == 0) {
        System.out.println("Saindo...");
        break;
      }

      System.out.println("Digite o primeiro número:");
      int a = Integer.parseInt(System.console().readLine());

      System.out.println("Digite o segundo número:");
      int b = Integer.parseInt(System.console().readLine());

      switch (opcao) {
        case 1:
          System.out.println("Soma: %s".formatted(somarDoisNumeros(a, b)));
          break;
        case 2:
          System.out.println("Subtração: %s".formatted(subtrairDoisNumeros(a, b)));
          break;
        case 3:
          System.out.println("Multiplicação: %s".formatted(multiplicarDoisNumeros(a, b)));
          break;
        case 4:
          System.out.println("Divisão: %s".formatted(dividirDoisNumeros(a, b)));
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (opcao != 0);
  }

  private void mostrarOpcoes() {
    System.out.println("Escolha uma opção:");
    System.out.println("1 - Somar");
    System.out.println("2 - Subtrair");
    System.out.println("3 - Multiplicar");
    System.out.println("4 - Dividir");
    System.out.println("0 - Sair");
  }

  public int somarDoisNumeros(int a, int b) {
    return a + b;
  }

  public int subtrairDoisNumeros(int a, int b) {
    return a - b;
  }

  public int multiplicarDoisNumeros(int a, int b) {
    return a * b;
  }

  public int dividirDoisNumeros(int a, int b) {
    return a / b;
  }
}
