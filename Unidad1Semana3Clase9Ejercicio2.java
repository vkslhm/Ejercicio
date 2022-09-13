import java.util.Scanner;
class Main {
  public static void main (String[] args) {
    Scanner entrada = new Scanner (System.in);

  int numero1;
  int numero2;

  System.out.print("Introduzca el primer número: ");
  numero1 = entrada.nextInt();

  System.out.print("Introduzca el segundo número: ");
  numero2 = entrada.nextInt();

  if (numero1 == numero2)
  System.out.println("El número " + numero1 + "equivale a " + numero2);

  if (numero1 != numero2)
  System.out.println("El número " + numero1 + "es diferente a " + numero2);

  if (numero1 < numero2)
  System.out.println("El número " + numero1 + "es menor que " + numero2);

  if (numero1 > numero2)
  System.out.println("El número " + numero1 + "es mayor que " + numero2);

  if (numero1 <= numero2)
  System.out.println("El número " + numero1 + "es menor o igual que " + numero2);

  if (numero1 >= numero2)
  System.out.println("El número " + numero1 + "es mayor o igual " +  numero2);
  }
}