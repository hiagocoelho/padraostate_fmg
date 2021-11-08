public class JogadorEstadoTransferido implements JogadorEstado {

    private JogadorEstadoTransferido() {};
    private static JogadorEstadoTransferido instance = new JogadorEstadoTransferido();
    public static JogadorEstadoTransferido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Transferido.";
    }

    public String preparar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoPreparado.getInstance());
        return "Jogador foi preparado.";
    }

    public String transferir(Jogador jogador) {
        return "Jogador não foi transferido.";
    }

    public String machucar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoMachucado.getInstance());
        return "Jogador foi machucado.";
    }

    public String recuperar(Jogador jogador) {
        return "Jogador não foi recuperado.";
    }

    public String aposentar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        return "Jogador se aposentou.";
    }

}
