/**
 * Requerimiento 2: Crear el algoritmo para calcular el área de un rectángulo
 * y un triángulo rectángulo de altura n metros y la base de n metros.
 * Cuando el área supere los 124,5 metros cuadrados del rectángulo,
 * indicar que la superficie ha superado el valor permitido.
 * Nota: Resolver usando variables del tipo float con un
 * algoritmo de programación estructurado.
 */
package requerimiento2;

import java.util.Scanner;

public class CalcularArea {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresar base: ");
        float base = entrada.nextFloat();
        System.out.print("Ingresar altura: ");
        float altura = entrada.nextFloat();

        float areaRectangulo = base * altura;
        if (areaRectangulo > 124.5) {
            System.out.println("La superficie ha superado el valor máximo permitido de 124,5m²");
            return;
        }
        float areaTriangulo = areaRectangulo / 2;

        System.out.println("El area de un rectángulo con base " + base + "m y altura " + altura + "m es: " + areaRectangulo + "m²");
        System.out.println("El area de un triángulo rectángulo con base " + base + "m y altura " + altura + "m es: " + areaTriangulo + "m²");

    }
}
