import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int num, numbers, minor = 0, major = 0;
 Scanner entrada = new Scanner (System.in);

System.out.println ("¿Cuántos datos ingresará?");
num = entrada.nextInt ();
      
for (int i = 1; i <= num; i++) {
      
System.out.println ("Número " + i);
 numbers = entrada.nextInt ();
   if (numbers < 100){;
  major++;}
  if (numbers > 100){;
  minor++;}
      }
         System.out.println ("Números menores a cien: " + minor);
        System.out.println ("Números mayores a cien: " + major);
  }
}