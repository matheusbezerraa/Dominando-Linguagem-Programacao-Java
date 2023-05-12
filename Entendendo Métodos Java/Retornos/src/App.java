public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double areaQuadrado = Quadrilateros.area(5);
        System.out.println("area do quadrado: "+areaQuadrado);

        double areaRetangulo = Quadrilateros.area(5, 10);
        System.out.println("area do retangulo: "+ areaRetangulo);

        double areaTrapezio = Quadrilateros.area(8, 7, 9);
        System.out.println("area do trapezio: "+ areaTrapezio);
    }
}
