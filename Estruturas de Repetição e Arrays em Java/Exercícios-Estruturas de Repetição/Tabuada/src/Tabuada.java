import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tabuada: ");
        int tabuada = scanner.nextInt();

        System.out.println("tabauda de "+tabuada);

        for(int i = 1 ; i <= 10 ; i++ ){
            System.out.println(tabuada + "x" + i + "=" + (tabuada * i));
        }
    }
}
