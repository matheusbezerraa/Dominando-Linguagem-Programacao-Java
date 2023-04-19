package edu.matheus.segundaAula;
public class boletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7;

        if(mediaFinal < 6){
            System.out.println("REPROVADO");
        }else if(mediaFinal == 6){
            System.out.println("PROVA MINERVA");
        }else{
            System.out.println("APROVADO");
        }
        
    }
    
}
