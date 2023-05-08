public class App {
    public static void main(String[] args) throws Exception {
        String nomeUm = "Matheus";
        String nomeDois = new String("Matheus");

        System.out.println(nomeUm == nomeDois);//false

        String umNome = "Flavia";
        String doisNome = "Flavia";

        System.out.println(umNome.equals(doisNome));//true
    }
}
