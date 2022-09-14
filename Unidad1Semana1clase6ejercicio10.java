import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner Entrada = new Scanner (System.in);
    System.out.println("Escriba la base: "); 
    double base = Entrada.nextDouble();
    System.out.println("Escriba el exponente: ");
    double exponente = Entrada.nextDouble();
    double resultado = Math.pov(base, exponente);
    System.out.println("Su resultado es de: " + resultado);
  }
}