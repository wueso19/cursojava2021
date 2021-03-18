/**
 * Requerimiento 1: Crear el algoritmo para calcular el área de un rectángulo
 * y un triángulo rectángulo de altura 3 metros y la base de 4 metros.
 * Nota: Resolver usando variables enteras, int, con un algoritmo
 * de programación estructurada.
 */
package requerimiento1;

public class CalcularArea {

    public static void main(String[] args) {
        int base = 3;
        int altura = 4;
        int areaRectangulo = base * altura;
        int areaTriangulo = areaRectangulo / 2;

        System.out.println("El area de un rectángulo con base 4m y altura 3m es: " + areaRectangulo + "m²");
        System.out.println("El area de un triángulo rectángulo con base 4m y altura 3m es: " + areaTriangulo + "m²");
    }
}
