public class Calculator {

  public static void main(String[] args) {
    if (args.length != 3) {
      printHelp();
      System.exit(2);
    }
    String op = args[0].toLowerCase();
    double a;
    double b;
    try {
      a = Double.parseDouble(args[1]);
      b = Double.parseDouble(args[2]);
    } catch (NumberFormatException e) {
      System.out.println("Error: Los operandos deben ser números.");
      printHelp();
      System.exit(2);
      return;
    }
    switch (op) {
      case "add":
        System.out.println(a + b);
        break;
      case "sub":
        System.out.println(a - b);
        break;
      case "mul":
        System.out.println(a * b);
        break;
      case "div":
        if (b == 0) {
          System.out.println("Error: división por cero.");
          System.exit(1);
        }
        System.out.println(a / b);
        break;
      default:
        System.out.println("Error: operación no válida: " + op);
        printHelp();
        System.exit(2);
    }
  }

private static void printHelp() {
    System.out.println("Uso:");
    System.out.println(" java Calculator <op> <a> <b>");
    System.out.println("Operaciones:");
    System.out.println(" add | sub | mul | div");

    System.out.println("Códigos de salida:");
    System.out.println(" 0 OK, 1 error, 2 uso incorrecto");

    System.out.println("Ejemplos:");
    System.out.println(" java Calculator add 2 3");
    System.out.println(" java Calculator div 10 2");
    System.out.println(" java Calculator mul 4 5");
}

}
