package edu.matheus.primeiraAula;
public class MinhaClasse {

    public static void main(String[] args){
        String primeiroNome = "Matheus";
        String segundoNome = "Bezerra";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome + " " + segundoNome;
    }
}
