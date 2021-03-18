package requerimiento4;

public class CalcularArea {

    private double base, altura;

    public CalcularArea(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularAreaRectangulo(double base, double altura) {

        double areaRectangulo = altura * altura;
        return areaRectangulo;
    }

    public double calcularAreaTriangulo(double base, double altura) {

        double areaTriangulo = calcularAreaRectangulo(base, altura) / 2;
        return areaTriangulo;
    }

}
