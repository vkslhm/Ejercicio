import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner Entrada = new Scanner(System.in);
    float nota1, nota2, nota3, promedio;
    System.out.println("Registre su primera nota: ");
    nota1 = Entrada.nextFloat();
    System.out.println("Registre su segunda nota: ");
    nota2 = Entrada.nextFloat();
    System.out.println("Registre su tercera nota_:");
    nota3 = Entrada.nextFloat();
    promedio = (nota1 + nota2 + nota3) / 3;
    System.out.println("Su promedio es de: " + promedio);
    if (promedio >= 7) {
      System.out.println("Aprovado.");
    } else if (promedio >= 4) {
      System.out.println("Neutral");
    } else {
      System.out.println("Reprovado");
    }
  }
}