import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JogadorTest {
    Jogador jogador;

    @BeforeEach
    public void setUp() {
        jogador = new Jogador();
    }

    // Jogador preparado

    @Test
    public void naoDevePrepararJogadorPreparado() {
        jogador.setEstado(JogadorEstadoPreparado.getInstance());
        assertEquals("Jogador não foi preparado.", jogador.preparar());
    }

    @Test
    public void deveTransferirJogadorPreparado() {
        jogador.setEstado(JogadorEstadoPreparado.getInstance());
        assertEquals("Jogador foi transferido.", jogador.transferir());
    }

    @Test
    public void deveMachucarJogadorPreparado() {
        jogador.setEstado(JogadorEstadoPreparado.getInstance());
        assertEquals("Jogador foi machucado.", jogador.machucar());
    }

    @Test
    public void naoDeveRecuperarJogadorPreparado() {
        jogador.setEstado(JogadorEstadoPreparado.getInstance());
        assertEquals("Jogador não foi recuperado.", jogador.recuperar());
    }

    @Test
    public void deveAposentarJogadorPreparado() {
        jogador.setEstado(JogadorEstadoPreparado.getInstance());
        assertEquals("Jogador foi aposentado.", jogador.aposentar());
    }

    // Jogador transferido

    @Test
    public void devePrepararJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertEquals("Jogador foi preparado.", jogador.preparar());
    }

    @Test
    public void naoDeveTransferirJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertEquals("Jogador não foi transferido.", jogador.transferir());
    }

    @Test
    public void deveMachucarJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertEquals("Jogador foi machucado.", jogador.machucar());
    }

    @Test
    public void naoDeveRecuperarJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertEquals("Jogador não foi recuperado.", jogador.recuperar());
    }

    @Test
    public void deveAposentarJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertEquals("Jogador foi aposentado.", jogador.machucar());
    }
}
