package TiposVariaveis;

public class tiposVariaveis{
    public static void main(String[] args) throws Exception {

        String meuNome = "Matheus";
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

       int numero = 5;

       numero = 10;

       System.out.println(numero);

       final double VALOR_DE_PI = 3.14; // para não alterar a variavel(usar caixa alta como boas praticas)
    } 
    
}
