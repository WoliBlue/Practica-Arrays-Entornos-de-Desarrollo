package tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.MisArrays;

public class MedianaNotasTest {

	  private static int[] notasValidas;
	    private static int[] notasInvalidas;

	    @BeforeAll
	    public static void setUp() {
	        notasValidas = new int[] { 8, 7, 6, 9, 10 };
	        notasInvalidas = new int[] { 8, 7, 6, 9, 11 };
	    }

	    @Test
	    public void testMedianaNotasValoresValidos() {
	        float mediana = MisArrays.medianaNotas(notasValidas);
	        assertEquals(8.0f, mediana);
	    }

	    @Test
	    public void testMedianaNotasValoresInvalidos() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            MisArrays.medianaNotas(notasInvalidas);
	        });
	    }
	}
