package util;

import java.util.Arrays;

public class MisArrays {
//Jose Arenas Venegas
	
	public static float mediaNotas(int[] notas) {
		validarNota(notas);
    	int media = 0;
        int sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        media= sum / notas.length;
        return media;
    }
    
    public static float medianaNotas(int[] notas) {
    	validarNota(notas);
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

    public static int maximaNota(int[] notas) {
    	validarNota(notas);
        int max = 0;
        for (int nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }
    public static int minimaNota(int[] notas) {
    	validarNota(notas);
        int min = 10;
        for (int nota : notas) {
            if (nota < min) {
                min = nota;
            }
        }
        return min;
    }
    
    private static void validarNota(int[] notas) {
        for (int nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("Debe ser entre 0 y 10");
            }
        }
    }
}
    
