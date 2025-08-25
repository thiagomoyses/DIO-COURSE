public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(boolean state) {
        if(state) {
            System.err.println("A TV ja esta ligada.");
        } else {
            ligada = true;
        }
    }

    public void desligar(boolean state) {
        if(!state) {
            System.err.println("A TV ja esta desligada.");
        } else {
            ligada = false;
        }
    }

    public void aumentar() {
        volume++;
    }

    public void abaixar() {
        volume--;
    }

    public void proximoCanal() {
        canal++;
    }

    public void anteriorCanal() {
        if(canal == 1){
            System.err.println("Ja esta no ultimo canal");
        } else {
            canal--;
        }
    }

    public void canalSpecifico(int novoCanal) {
        if(novoCanal <= 0){
            System.err.println("Canal invalido");
        } else {
            canal = novoCanal;
        }
    }
}