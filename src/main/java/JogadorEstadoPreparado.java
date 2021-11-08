public class JogadorEstadoPreparado implements JogadorEstado {
    private JogadorEstadoPreparado() {};
    private static JogadorEstadoPreparado instance = new JogadorEstadoPreparado();
    public static JogadorEstadoPreparado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Preparado.";
    }

    public String preparar(Jogador jogador) {
        return "Jogador não foi preparado.";
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
