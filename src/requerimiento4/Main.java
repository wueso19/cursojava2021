/**
 * Requerimiento 4: Crear el algoritmo para calcular el área de un rectángulo
 * y un triángulo rectángulo de altura n metros y la base de n metros.
 * Cuando el área supere los 789,5 metros cuadrados del rectángulo indicar
 * que la superficie ha superado el valor permitido.
 * Nota: Resolver usando clases y técnicas de la programación
 * orientada a objetos.
 */
package requerimiento4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresar base: ");
        double base = entrada.nextDouble();
        System.out.print("Ingresar altura: ");
        double altura = entrada.nextDouble();

        CalcularArea rectangulo = new CalcularArea(base, altura);
        double areaRectangulo = rectangulo.calcularAreaRectangulo(base, altura);
        double areaTriangulo = rectangulo.calcularAreaTriangulo(base, altura);

        if (areaRectangulo > 789.5) {
            System.out.println("La superficie ha superado el valor máximo permitido de 789,5m²");
            return;
        }
        System.out.println("El area de un rectángulo con base " + base + " m y altura " + altura + " m es: " + areaRectangulo + "m²");
        System.out.println("El area de un triángulo rectángulo con base " + base + " m y altura " + altura + " m es: " + areaTriangulo + "m²");

    }
}
