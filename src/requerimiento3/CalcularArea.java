/**
 * Requerimiento 3: Crear el algoritmo para calcular el área de un rectángulo
 * y un triángulo rectángulo de altura n metros y la base de n metros.
 * Cuando el área supere los 367,5 metros cuadrados del rectángulo,
 * indicar que la superficie ha superado el valor permitido.
 * Nota: Resolver usando variables del tipo double, implementado
 * el algoritmo en un método separándolo del programa principal.
 */
package requerimiento3;

import java.util.Scanner;

public class CalcularArea {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresar base: ");
        double base = entrada.nextDouble();
        System.out.print("Ingresar altura: ");
        double altura = entrada.nextDouble();

        double areaRectangulo = calcularAreaRectangulo(base, altura);
        double areaTriangulo = calcularAreaTriangulo(base, altura);

        if (areaRectangulo > 367.5) {
            System.out.println("La superficie ha superado el valor máximo permitido de 367,5m²");
            return;
        }
        System.out.println("El area de un rectángulo con base " + base + " m y altura " + altura + " m es: " + areaRectangulo + "m²");
        System.out.println("El area de un triángulo rectángulo con base " + base + " m y altura " + altura + " m es: " + areaTriangulo + "m²");

    }

    static double calcularAreaRectangulo(double base, double altura) {

        double areaRectangulo = altura * altura;
        return areaRectangulo;
    }

    static double calcularAreaTriangulo(double base, double altura) {

        double areaTriangulo = calcularAreaRectangulo(base, altura) / 2;
        return areaTriangulo;
    }

}
