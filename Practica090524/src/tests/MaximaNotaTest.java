package tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.MisArrays;
public class MaximaNotaTest {

	  private static int[] notasValidas;
	    private static int[] notasInvalidas;

	    @BeforeAll
	    public static void setUp() {
	        notasValidas = new int[] { 8, 7, 6, 9, 10 };
	        notasInvalidas = new int[] { 8, 7, 6, 9, 11 };
	    }

	    @Test
	    public void testMaximaNotaValoresValidos() {
	        int maxima = MisArrays.maximaNota(notasValidas);
	        assertEquals(10, maxima);
	    }

	    @Test
	    public void testMaximaNotaValoresInvalidos() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            MisArrays.maximaNota(notasInvalidas);
	        });
	    }
	}
