
package javaactividades2;
//Sacar área y perímetro de un rectángulo
import java.util.Scanner;

public class JavaActividades2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Ingrese la base del rectángulo: ");
       double base = scanner.nextDouble();

       System.out.print("Ingrese la altura del rectángulo: ");
       double altura = scanner.nextDouble();

       double area = base * altura;
       double perimetro = 2 * (base + altura);

       System.out.println("Área del rectángulo: " + area);
       System.out.println("Perímetro del rectángulo: " + perimetro);

       scanner.close();
    }
    
}
