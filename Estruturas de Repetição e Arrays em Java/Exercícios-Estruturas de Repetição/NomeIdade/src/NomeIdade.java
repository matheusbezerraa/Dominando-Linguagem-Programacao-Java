import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Para interromper clique '0' na opção para o nome");
            System.out.println("-------------------------------------------------");
            System.out.println("Nome: ");
            nome = scanner.next();
            if(nome.equals("0")){ 
                break;
            }
            System.out.println("Idade: ");
            idade = scanner.nextInt();

        };
        
    }
}
