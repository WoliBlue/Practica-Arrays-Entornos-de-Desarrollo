package util;

import java.util.Arrays;

public class MisArrays {
//Jose Arenas Venegas
	
    public static int mediaNotas(int[] notas) {
    	int media = 0;
        int sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        media= sum / notas.length;
        return media;
    }
    
    public static int medianaNotas(int[] notas) {
        Arrays.sort(notas);
        int mediana;
        int middle = notas.length / 2;
        if (notas.length % 2 == 0) {
            mediana = (notas[middle] + notas[middle - 1]) / 2;
        } else {
            mediana = notas[middle];
        }
        return mediana;
    }

    public static int maximaNota(int[] notas) {
        int max = 0;
        for (int nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }

    
}
