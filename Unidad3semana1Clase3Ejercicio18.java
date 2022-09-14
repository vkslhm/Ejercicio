import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ingresar=new Scanner(System.in);
    double nota;
    System.out.println("Escriba un número del 1 al 10");
    nota=ingresar.nextDouble();
    while(nota<1 | nota>10)
    {
    System.out.println("El número escrito no es correcto");
    nota=ingresar.nextDouble();
    }
  }
}