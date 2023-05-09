import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
        System.out.println("digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("digite seu nome: ");
        String nome = scanner.next();

        System.out.println("digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("------------------------------");
        System.out.println("sua altura: "+altura);
        System.out.println("seu nome: "+ nome);
        System.out.println("seu sobrenome: "+sobrenome);
        System.out.println("sua idade é: "+idade);
    }
}
