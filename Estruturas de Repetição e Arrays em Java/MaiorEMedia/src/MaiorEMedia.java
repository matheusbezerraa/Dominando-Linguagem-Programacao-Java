import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = 0 ;
        int soma = 0;
        int media;
        int count = 0;

        do{
            System.out.println("numero: ");
            numero = scanner.nextInt();
            if(numero>maior){
                maior = numero;
            };
            soma = numero + soma;
            count = count + 1;

        }while(count < 5);

        media = (soma/count);

        System.out.println("Maior numero: "+ maior);
        System.out.println("soma de todos: "+soma);
        System.out.println("a media: "+media);
    }
}
