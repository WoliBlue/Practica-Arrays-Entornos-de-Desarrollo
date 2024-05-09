package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.MisArrays;

public class MinimaNotaTest {
	  private static int[] notasValidas;
	    private static int[] notasInvalidas;

	    @BeforeAll
	    public static void setUp() {
	        notasValidas = new int[] { 8, 7, 6, 9, 10 };
	        notasInvalidas = new int[] { 8, 7, 6, 9, 11 };
	    }

	    @Test
	    public void testMinimaNotaValoresValidos() {
	        int minima = MisArrays.minimaNota(notasValidas);
	        assertEquals(6, minima);
	    }

	    @Test
	    public void testMinimaNotaValoresInvalidos() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            MisArrays.minimaNota(notasInvalidas);
	        });
	    }
}
