public class JogadorEstadoAposentado implements JogadorEstado {
    private JogadorEstadoAposentado() {};
    private static JogadorEstadoAposentado instance = new JogadorEstadoAposentado();
    public static JogadorEstadoAposentado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aposentado.";
    }

    public String preparar(Jogador jogador) {
        return "Jogador não preparado.";
    }

    public String transferir(Jogador jogador) {
        return "Jogador não foi transferido.";
    }

    public String machucar(Jogador jogador) {
        return "Jogador não foi machucado.";
    }

    public String recuperar(Jogador jogador) {
        return "Jogador não foi recuperado.";
    }

    public String aposentar(Jogador jogador) {
        return "Jogador não foi aposentado.";
    }
}
