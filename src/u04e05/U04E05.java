
package u04e05;

import java.util.Scanner;
public class U04E05 {
    public static void main(String args[]) {
      Scanner entrada = new Scanner (System.in);
      int radio;
      double perimetro, superficie;
      final double pi = Math.PI;
      System.out.print("Ingrese el radio del circulo: ");
      radio = entrada.nextInt();
      superficie = pi*(Math.pow(radio,2));
      perimetro = (2*pi*radio);
      System.out.println("La superficie del circulo es igual a; "+superficie);
      System.out.print("El perimetro del circulo es igual a; "+perimetro);
    }
}