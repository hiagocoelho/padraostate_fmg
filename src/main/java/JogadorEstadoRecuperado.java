public class JogadorEstadoRecuperado implements JogadorEstado {
    private JogadorEstadoRecuperado() {};
    private static JogadorEstadoRecuperado instance = new JogadorEstadoRecuperado();
    public static JogadorEstadoRecuperado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Recuperado.";
    }

    public String preparar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoPreparado.getInstance());
        return "Jogador foi preparado.";
    }

    public String transferir(Jogador jogador) {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        return "Jogador foi transferido.";
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
        return "Jogador foi aposentado.";
    }
}
