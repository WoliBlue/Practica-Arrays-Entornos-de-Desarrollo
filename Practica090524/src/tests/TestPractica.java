package tests;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.MisArrays;

public class TestPractica {
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


