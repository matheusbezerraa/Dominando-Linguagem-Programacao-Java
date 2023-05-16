public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro();

        carro1.setCor("vermelho");
        carro1.setModelo("Civic");
        carro1.setCapacidadeTanque(50);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(39));

        System.out.println("--------------------------------------------------");

        Carro carro2 = new Carro("cinza", "City", 70);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(46));
    }
}
