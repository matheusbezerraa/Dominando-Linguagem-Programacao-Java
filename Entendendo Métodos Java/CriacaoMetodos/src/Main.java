public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("calculadora: ");
        Calculadora.soma(1,1);
        Calculadora.subtracao(10, 5);
        Calculadora.multiplicacao(5, 5);
        Calculadora.divisao(10, 2);

        System.out.println("Mensagem: ");
        Mensagem.ObterMensagem(9);
        Mensagem.ObterMensagem(16);
        Mensagem.ObterMensagem(22);

        System.out.println("emprestimo: ");
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, 2);
    }
}
