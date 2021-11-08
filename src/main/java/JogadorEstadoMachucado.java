public class JogadorEstadoMachucado implements JogadorEstado{
    private JogadorEstadoMachucado() {};
    private static JogadorEstadoMachucado instance = new JogadorEstadoMachucado();
    public static JogadorEstadoMachucado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Machucado.";
    }

    public String preparar(Jogador jogador) {
        return "Jogador não foi preparado.";
    }

    public String transferir(Jogador jogador) {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        return "Jogador não foi transferido.";
    }

    public String machucar(Jogador jogador) {
        return "Jogador não foi machucado.";
    }

    public String recuperar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoRecuperado.getInstance());
        return "Jogador se recuperou.";
    }

    public String aposentar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        return "Jogador se aposentou.";
    }
}
