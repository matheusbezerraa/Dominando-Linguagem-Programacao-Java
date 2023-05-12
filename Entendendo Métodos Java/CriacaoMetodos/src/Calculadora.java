public class Calculadora {
    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;

        System.out.println("a soma de "+numero1+" + "+numero2+" = "+resultado);
    }

    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;

        System.out.println("a subtração de "+numero1+" - "+numero2+" = "+resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;

        System.out.println("a multiplicação de "+numero1+" * "+numero2+" = "+resultado);
    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;

        System.out.println("a divisão de "+numero1+" / "+numero2+" = "+resultado);
    }
}
