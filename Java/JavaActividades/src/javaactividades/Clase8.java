import java.util.Scanner;

package javaactividades;

public class Clase8 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       // Pedimos los datos
       System.out.print("Ingrese la base del rectángulo: ");
       double base = scanner.nextDouble();

       System.out.print("Ingrese la altura del rectángulo: ");
       double altura = scanner.nextDouble();

       // Cálculos
       double area = base * altura;
       double perimetro = 2 * (base + altura);

       // Resultados
       System.out.println("Área del rectángulo: " + area);
       System.out.println("Perímetro del rectángulo: " + perimetro);

       scanner.close();
   }
}
