package Main;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
  Scanner entrada = new Scanner (System.in);

    int numero1;
    int numero2;
    int suma;

    System.out.print ("Escriba el primer número: ");
    numero1 = entrada.nextInt();

    System.out.print("Escriba el segundo número: ");
    numero2 = entrada.nextInt();

    suma = numero1 + numero2;

    System.out.println ("La suma es: " + suma);
  }
  
}