import java.util.Scanner;
class Main {
  public static void main(String[] args){
    Scanner teclado = new Scanner (System.in);
    int contador = 0; 
    double nota = 0.0;
    int minor = 0;
    int major = 0;
    while (contador <10)
           {
    System.out.println("Escriba la nota:");
      nota= teclado.nextDouble ();
       if (nota >= 7.0) {
        major = major +1;
        contador += 1;
       }
       else
       {
        minor = minor +1;
        contador += 1; 
       }
}
System.out.println ("Estudiantes que tienen nota mayor o igual a 7 = " +major);
System.out.println ("Estudiantes que tienen nota menor a 7 = " +minor);
  }
}