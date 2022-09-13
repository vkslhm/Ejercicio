import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    System.out.println("Introduzca la cantidad de meses:");
    float NM = entrada.nextFloat();
    double precio, prima, descuento, deuda, cuota;
    if (NM >=1 && NM <=65) {
        precio = 23000 * 1.13;
        descuento = 0;
        if (NM == 36) {
            descuento = precio * 0.2;
            prima = (precio - descuento) * 0.15;
            deuda = (precio - descuento)-prima;
        } else {
            prima = precio * 015;
            deuda = precio - prima;
        }
        cuota = deuda / NM;
        System.out.println("precio: " + precio);
        System.out.println("descuento: " + descuento);
        System.out.println("deudas: " + deuda);
        System.out.println("cuotas: " + cuota);

    } else {
        System.out.println("Lea por favor.");
  }
}
}