public class Jogador {
    private String nome;
    private JogadorEstado estado;

    public Jogador() {
        this.estado = JogadorEstadoPreparado.getInstance();
    }

    public void setEstado(JogadorEstado estado) {
        this.estado = estado;
    }

    public String preparar() {
        return estado.preparar(this);
    }

    public String transferir() {
        return estado.transferir(this);
    }

    public String machucar() {
        return estado.machucar(this);
    }

    public String recuperar() {
        return estado.recuperar(this);
    }

    public String aposentar() {
        return estado.aposentar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public JogadorEstado getEstado() {
        return estado;
    }
}
