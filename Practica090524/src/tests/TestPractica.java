package tests;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.MisArrays;

public class TestPractica {
    private static int[] notasValidas;
    private static int[] notasNoValidas;

    @BeforeAll
    public static void setUp() {
        notasValidas = new int[] { 8, 7, 6, 9, 10 };
        notasNoValidas = new int[] { 8, 7, 6, 9, 11 };
    }

    @Test
    public void testMediaNotasValoresValidos() {
        float media = MisArrays.mediaNotas(notasValidas);
        assertEquals(8.0f, media);
    }

    @Test
    public void testMediaNotasValoresInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> {
            MisArrays.mediaNotas(notasNoValidas);
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
            MisArrays.medianaNotas(notasNoValidas);
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
            MisArrays.maximaNota(notasNoValidas);
        });
    }

    @Test
    public void testMinimaNotaValoresValidos() {
        int minima = MisArrays.minimaNota(notasValidas);
        assertEquals(6, minima);
    }

    @Test
    public void testMinimaNotaValoresNoValidos() {
        assertThrows(IllegalArgumentException.class, () -> {
            MisArrays.minimaNota(notasNoValidas);
        });
    }
}


