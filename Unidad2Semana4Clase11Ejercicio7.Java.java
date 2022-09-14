import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ingresar=new Scanner (System.in);
    int num1, num2, resultado, opcion;
    System.out.println("Escriba el primer número: ");
    num1 = ingresar.nextInt();
    System.out.println("Escriba el segundo número ");
    num2 = ingresar.nextInt();
    System.out.println("+++++ Menú de opciones +++++");
    System.out.println("Escriba 1 para sumar los 2 números");
    System.out.println("Escriba 2 para sustraer los 2 números");
    System.out.println("Escriba 3 para elevarlos al cuadrados");
    System.out.println("Escriba 3 para multiplicar los 2 números");
    opcion = ingresar.nextInt();

    switch(opcion) {
      case 1 : {
        resultado = num1 + num2;
        System.out.println("La respuesta es: "+ resultado);
        break;
      }
      case 2:{
        resultado = num1 - num2;
        System.out.println("La respuesta es: "+ resultado);
        break;
      }
      case 3:{
        System.out.println("La respuesta de la elevacion al cuadrado "+ num1 +"es de: "+ Math.pow(num1,2));
        System.out.println("La respuesta de la elevacion al cuadrado "+ num2 +" es de: "+ Math.pow(num2,2));
        break;
      }
      case 4:{
        resultado = num1 * num2;
        System.out.println("La respuesta es: "+ resultado);
        break;
      }
      default:{
        System.out.println("Elija una opcion correcta.");
        break;
      }
    }
  }
}