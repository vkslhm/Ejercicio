import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner Entrada = new Scanner (System.in);
    int n1;
    int n2;

    System.out.println("Escriba el número menor:");
    n1 = Entrada.nextInt();
    System.out.println("Escriba el número mayor:");
    n2 = Entrada.nextInt();

    for (int i=n1; i<=n2; i++){
      System.out.println(i);
      }
  }
}