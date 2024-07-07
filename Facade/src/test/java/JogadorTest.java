import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JogadorTest {

        @Test
        void deveRetornarRevisaoVar() {
            Jogador jogador = new Jogador();
            VAR.getInstancia().addJogadorComLanceRevisao(jogador);

            assertEquals(false, jogador.realizarLance());
        }
        @Test
        void deveRetornarRevisaoArbitro() {
            Jogador jogador = new Jogador();
           Arbitro.getInstancia().addJogadorComLanceRevisao(jogador);

            assertEquals(false, jogador.realizarLance());
        }
        @Test
        void deveRetornarRevisaoBandeirinha() {
            Jogador jogador = new Jogador();
            Bandeirinha.getInstancia().addJogadorComLanceRevisao(jogador);

            assertEquals(false, jogador.realizarLance());
        }
        @Test
        void deveRetornarClienteSemPendencia() {

            Jogador jogador = new Jogador();
            assertEquals(true, jogador.realizarLance());
        }

    }

