package util;

import java.util.Arrays;

public class MisArrays {
//Jose Arenas Venegas

    /**
     * @param Array de notas entre 0 y 10.
     * @return La media de las notas.
     * @throws IllegalArgumentException no esta entre 0 y 10.
     */
	public static float mediaNotas(int[] notas) {
		validaNota(notas);
    	int media = 0;
        int sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        media= sum / notas.length;
        return media;
    }
    
    /**
     * @param Array de notas entre 0 y 10.
     * @return La mediana de las notas.
     * @throws IllegalArgumentException no esta entre 0 y 10.
     */
    public static float medianaNotas(int[] notas) {
    	validaNota(notas);
        Arrays.sort(notas);
        float mediana;
        int middle = notas.length / 2;
        if (notas.length % 2 == 0) {
            mediana = (notas[middle] + notas[middle - 1]) / 2.0f;
        } else {
            mediana = notas[middle];
        }
        return mediana;
    }
    /**
     * @param Array de notas entre 0 y 10.
     * @return La maxima de las notas xd.
     * @throws IllegalArgumentException no esta entre 0 y 10.
     */
    public static int maximaNota(int[] notas) {
    	validaNota(notas);
        int max = 0;
        for (int nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }
    
    /**
     * @param Array de notas entre 0 y 10.
     * @return La minima de las notas.
     * @throws IllegalArgumentException no esta entre 0 y 10.
     */
    public static int minimaNota(int[] notas) {
    	validaNota(notas);
        int min = 10;
        for (int nota : notas) {
            if (nota < min) {
                min = nota;
            }
        }
        return min;
    }
    /**
     * @param Valida array notas.
     */
    private static void validaNota(int[] notas) {
        for (int nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("debe ser entre 0 y 10 lol");
            }
        }
    }
}
    
