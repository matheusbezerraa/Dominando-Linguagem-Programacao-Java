class Calculador implements OperacaoMatematica {

    @Override
    public void soma(double operando1, double opernado2){
        System.out.println("Soma: "+operando1+opernado2);
    }
    @Override
    public void subtracao(double operando1, double opernado2){
        System.out.println("Subtração: "+(operando1-opernado2));
    }
    @Override
    public void multiplicacao(double operando1, double opernado2){
        System.out.println("Multiplicação: "+(operando1*opernado2));
    }
    @Override
    public void divisao(double operando1, double operando2){
        System.out.println("Divisão: "+(operando1/operando2));
    }
}
