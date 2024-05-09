package util;

public class MisArrays {

	
    public static int mediaNotas(int[] notas) {
        int sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        return sum / notas.length;
    }
}
