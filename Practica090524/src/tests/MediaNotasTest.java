package tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.MisArrays;

public class MediaNotasTest {
	
	    private static int[] notasValidas;
	    private static int[] notasInvalidas;

	    @BeforeAll
	    public static void setUp() {
	        notasValidas = new int[] { 8, 7, 6, 9, 10 };
	        notasInvalidas = new int[] { 8, 7, 6, 9, 11 };
	    }

	    @Test
	    public void testMediaNotasValoresValidos() {
	        float media = MisArrays.mediaNotas(notasValidas);
	        assertEquals(8.0f, media);
	    }

	    @Test
	    public void testMediaNotasValoresInvalidos() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            MisArrays.mediaNotas(notasInvalidas);
	        });
	    }
	}

