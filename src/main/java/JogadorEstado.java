public interface JogadorEstado {
    String getEstado();

    String preparar(Jogador jogador);

    String transferir(Jogador jogador);

    String machucar(Jogador jogador);

    String recuperar(Jogador jogador);

    String aposentar(Jogador jogador);
}
