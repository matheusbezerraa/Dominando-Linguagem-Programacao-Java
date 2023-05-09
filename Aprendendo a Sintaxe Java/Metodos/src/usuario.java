public class usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("----------------------------------------");
        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("----------------------------------------");

        smartTv.ligar();
        smartTv.passarCanal();
        smartTv.diminuirVolume();
        System.out.println("Novo Status-> TV ligada: " + smartTv.ligada);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("Canal: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal: " + smartTv.canal);
    }
}
