public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.ligar(smartTv.ligada);
        smartTv.abaixar();

        smartTv.canalSpecifico(255);

        System.err.println("Tv ligada: " + smartTv.ligada);
        System.err.println("Canal Atual: " + smartTv.canal);
        System.err.println("Volume Atual: " + smartTv.volume);
    }
}
