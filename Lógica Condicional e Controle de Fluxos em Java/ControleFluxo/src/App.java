public class App {
    public static void main(String[] args) throws Exception {
       
        int numero = 4;

        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("certo");
                break;
            case 4:
                 System.out.println("errado");
                 break;
            default:
                break;
        }
    }
}
