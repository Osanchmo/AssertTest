import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

public class MotxillaTest {

    @Test
    public void MagatzemNoNull() {
        ProblemaMochila motxilla;
        motxilla = new ProblemaMochila(30);

        assertNotNull(motxilla.almacen);
    }

    @Test
    public void MotxillaNotNull() {
        ProblemaMochila motxilla;
        motxilla = new ProblemaMochila(30);

        assertNotNull(motxilla.mochila);
    }

    @Test
    public void TestProblemaVerified() throws Exception {
        ProblemaMochila motxilla;
        motxilla = new ProblemaMochila(30);
        motxilla.resolverProblema();

        motxilla.cargarDatos();

        assertEquals("Error en problema1", motxilla.mochila.size(), 10);
    }

    @Test
    public void TestProblemaWithFail() throws Exception {
        ProblemaMochila motxilla;
        motxilla = new ProblemaMochila(30);
        motxilla.resolverProblema();
        //fails
        assertEquals("Error en problema", motxilla.mochila.size(), 7);
    }

}