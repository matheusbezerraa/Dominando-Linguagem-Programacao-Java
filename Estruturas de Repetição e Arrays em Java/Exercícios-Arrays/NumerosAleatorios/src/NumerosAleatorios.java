import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Random random = new Random();

        int numerosAleatorios[] = new int[10];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero+" ");
            
        }

        System.out.println("Sucessores dos numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero+1)+" ");
            
        }
    }
}
