import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner Lector = new Scanner
      (System.in);
            int contra;
        System.out.println("Registre su contraseña:");
        contra = Lector.nextInt();
        while(contra != 123){
          
        System.out.println("La contraseña es inválida.");
            contra = Lector.nextInt();
        }
        System.out.println("La contraseña es válida.");
  
  }
}