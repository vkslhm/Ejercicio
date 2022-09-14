import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int password;
    do{
    System.out.print("Ingrese su pin: ");
    password = keyboard.nextInt();
    if (password != 1234)
      System.out.println("El pin no es correcto.");
    }
      while (password != 134340);
  }
}