
import java.util.Scanner;
//El mayor de dos números (Operador Ternario)
public class Clase9 {
    public static void main(String[] args) {
      /* Scanner scanner = new Scanner(System.in);

       // Ingreso de números
       System.out.print("Ingrese el primer número: ");
       int num1 = scanner.nextInt();

       System.out.print("Ingrese el segundo número: ");
       int num2 = scanner.nextInt();

       // Uso del operador ternario
       int mayor = (num1 > num2) ? num1 : num2;

       // Resultado
       System.out.println("El número mayor es: " + mayor);

       scanner.close();*/
      
      /*Scanner entrada = new Scanner (System.in);
      float nota1,nota2,nota3,suma;

		//Guardamos las tres notas
		System.out.println("Digite las tres calificaciones: ");
		nota1 = Float.parseFloat(entrada.nextLine());
		nota2 = Float.parseFloat(entrada.nextLine());
		nota3 = Float.parseFloat(entrada.nextLine());

		suma = nota1 + nota2 + nota3;

		System.out.println("\nLa suma es: "+suma);*/
      
       /*Scanner entrada = new Scanner (System.in);
		float guillermo, luis, juan,total;
		System.out.println("Digite la cantidad de dinero de Guillermo: ");
		guillermo = Float.parseFloat(entrada.nextLine());

		luis = guillermo / 2;
		juan = (luis + guillermo)/ 2;
		total = luis + guillermo + juan;
		System.out.println("El dinero de Luis es: US$" + luis);
		System.out.println("El dinero de Juan es: US$" + juan);
		System.out.println("El dinero entre los tres es: US$" + total);*/
        
        /*Scanner entrada = new Scanner(System.in);
	System.out.println("Digite un mes del anio: ");
	var mes = Integer.parseInt(entrada.nextLine());
	var estacion = "Estacion desconocida";
	if (mes == 1 || mes ==2 || mes == 3){
            estacion ="Verano";
        }
	else if(mes == 4 || mes == 5 || mes == 6){
		estacion ="Otonio";
	}
	else if(mes == 7 || mes == 8 || mes == 9){
		estacion = "Invierno";
	}
	else if (mes == 10 || mes == 11 || mes == 12){
	}

	System.out.println("estacion = " + estacion);*/
        
     /*Scanner entrada = new Scanner(System.in);
		System.out.println("Digite un numero de mes: ");{
		var mes = Integer.parseInt(entrada.nextLine());
		var estacion = "Estacion desconocida";
		switch(mes){
			case 1: case 2: case 3:
			estacion ="Verano";
			break;
		case 4: case 5: case 6:
			estacion ="Otonio";
			break;
		case 7: case 8: case 9:
			estacion = "Invierno";
			break;
		case 10: case 11: case 12:
			estacion = "Primavera";
	}
	System.out.println("estacion = " + estacion);*/
    
    //Ejercicio: sistema de calificaciones con if else, como tarea hacerlo también con la sentencia de control switch
                /*Scanner entrada = new Scanner (System.in);
		System.out.println("Digite un numero entre 0 y 10: ");
		var calificación = Integer.parseInt(entrada.nextLine());
		if(calificación >= 9 && calificación <= 10){
			System.out.println("A");
		}
		else if(calificación >=8 && calificación < 9){
			System.out.println("B");
		}
		else if(calificación >=7 && calificación <8){
			System.out.println("C");
		}
		else if(calificación >=6 && calificación <7){
			System.out.println("D");
		}
		else if(calificación >=0 && calificación <6){
			System.out.println("F");
		}
		else{
			System.out.println("Fuera de rango");
                }*/
        //Clase 11
        //Ejercicio 1 Con Estructura if else

       	/*Scanner sc = new Scanner(System.in);

	double nota1, nota2, nota3, promedio;

      	System.out.print("Ingrese la primera calificación: ");
       	nota1 = sc.nextDouble();

       	System.out.print("Ingrese la segunda calificación: ");
       	nota2 = sc.nextDouble();

       	System.out.print("Ingrese la tercera calificación: ");
       	nota3 = sc.nextDouble();

       	promedio = (nota1 + nota2 + nota3) / 3;

       	if (promedio >= 70) {
           	System.out.println("El alumno está aprobado con: " + promedio);
       	} else {
           	System.out.println("El alumno está desaprobado con: " + promedio);
       	}

       	sc.close();*/

        //Ejercicio 2 Descuento
	/*Scanner entrada = new Scanner(System.in);
	double compra, descuento, precioFinal;

       	System.out.print("Digite la cantidad a pagar: ");
       	compra = entrada.nextDouble();

       	if (compra > 100) {
         	descuento = compra * 0.20;
       	} else {
           		descuento = 0;
       	}

       	precioFinal = compra - descuento;

       	System.out.println("El precio a pagar es: $" + precioFinal);

       	entrada.close();*/
        
        //Ejercicio 3 Comparacion de dos numeros
		/*Scanner entrada = new Scanner(System.in);

		// Declaración de variables
		double num1, num2, resultado;
		System.out.print("Ingrese el primer número: ");
		num1 = entrada.nextDouble();

		System.out.print("Ingrese el segundo número: ");
		num2 = entrada.nextDouble();

		if (num1 == num2) {
			resultado = num1 * num2;
		} else if (num1 > num2) {
			resultado = num1 - num2;
		} else {
			resultado = num1 + num2;
		}
		System.out.println("El resultado es: " + resultado);
		entrada.close();*/

/*
Clase 12 Ejercicio 1: Construir un programa que, dado un número total de
horas, devuelve el número de semanas, días y horas equivalentes.
Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,
6 días y 16 horas.
*/
		/*Scanner sc = new Scanner(System.in);

		final int HORAS_POR_SEMANA = 7 * 24;
		final int HORAS_POR_DIA = 24;

		System.out.print("Ingrese el total de horas: ");
		int horasTotales = sc.nextInt();
		int semanas = horasTotales / HORAS_POR_SEMANA;
		int horasRestantes = horasTotales % HORAS_POR_SEMANA;

		int dias = horasRestantes / HORAS_POR_DIA;
		int horas = horasRestantes % HORAS_POR_DIA;

		System.out.println(horasTotales + " horas equivalen a:");
		System.out.println(semanas + " semanas, " + dias + " días y " + horas + " horas.");

		sc.close();*/

/*
Clase 12 Ejercicio 2: Hacer un programa que calcule el cuadro de una suma,
el usuario debe ingresar el valor de a y el valor de b.
Formula: (a+b)2=a2+b2+2*a*b
Para esto deberán utilizar la clase Math y un método llamado pow
 */
		/*Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese el valor de a: ");
		double a = sc.nextDouble();

		System.out.print("Ingrese el valor de b: ");
		double b = sc.nextDouble();

		double aCuadrado = Math.pow(a, 2);
		double bCuadrado = Math.pow(b, 2);
		double dobleProducto = 2 * a * b;

		double resultado = aCuadrado + bCuadrado + dobleProducto;

		System.out.println("El resultado de (a + b)^2 es: " + resultado);

		sc.close();*/

/*Clase 12 Ejercicio 3: La calificacion final de un estudiante de informática
se calcula con base a las calificaciones de cuatro aspectos de su
rendimiento académico: participación, primer examen parcial, segundo
examen parcial y examen final. Sabiendo que las calificaciones anteriores
entran a la calificación final con ponderaciones de 10%, 25%, 25%
y 40%, Hacer un programa que calcule e imprima la calificación final
obtenida por un estudiante.
Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,
la calificación final.
*/
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la calificación de participación: ");
		double participacion = sc.nextDouble();
		System.out.print("Ingrese la calificación del primer examen parcial: ");
		double parcial1 = sc.nextDouble();
		System.out.print("Ingrese la calificación del segundo examen parcial: ");
		double parcial2 = sc.nextDouble();
		System.out.print("Ingrese la calificación del examen final: ");
		double examenFinal = sc.nextDouble();
		double calificacionFinal = (participacion * 0.10) + (parcial1 * 0.25) + (parcial2 * 0.25) + (examenFinal * 0.40);
		System.out.println("La calificación final del estudiante es: " + calificacionFinal);
		sc.close();*/

  }

}
