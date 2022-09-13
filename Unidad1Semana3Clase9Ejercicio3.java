import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);

    int numero1;

    System.out.print("Ingrese el primer número: ");
    numero1 = entrada.nextInt();

    if (numero1 >= 100) {
      System.out.println("El número " + numero1 + " es mayor o igual que 100");
    
    }
    else if (numero1 >= 50) {
      System.out.println("El número " + numero1 + " es mayor o igual que 50, aunque es mayor que 100");

    }
    else if (numero1 >=0) {
      System.out.println("El número " + numero1 + " es mayor o igual que cero, aunque es menor que 50");
    } else {
      System.out.println("El número " + numero1 + " es menor que cero");
    }
  }
}