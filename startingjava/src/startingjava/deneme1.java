package startingjava;

import java.util.Scanner;

public class deneme1 {

	public static void main(String[] args) {



        String subeler[] = { "Şube 1", "Şube 2", "Şube 3" };
        String model[] = { "Model 1", "Model 2", "Model 3", "Model 4" };

        int ort[] = new int[model.length];
        int min[] = new int[model.length];
        int max[] = new int[model.length];

        int urunMiktari[][] = { { 250, 100, 3 }, { 300, 500, 6 }, { 0, 300, 2 }, { 0, 0, 9 } };

        for (int i = 0; i < model.length; i++) {
            ort[i] = Ortalama(getColumn(urunMiktari, i));
            min[i] = Minimum(getColumn(urunMiktari, i));
            max[i] = Maksimum(getColumn(urunMiktari, i));
        }

        System.out.printf("%-10s", "");
        for (int i = 0; i < subeler.length; i++) {
            System.out.printf("%10s", subeler[i]);
        }

        System.out.printf("%10s %10s %10s\n", "Ortalama", "Minimum", "Maksimum");

        for (int i = 0; i < model.length; i++) {
            System.out.printf("%-10s", model[i]);

            for (int j = 0; j < urunMiktari[0].length; j++) {
                System.out.printf("%10d", urunMiktari[i][j]);
            }

            System.out.printf("%10d %10d %10d\n", ort[i], min[i], max[i]);
        }
    }

    private static int[] getColumn(int[][] array, int index) {
        int[] column = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            column[i] = array[i][index];
        }
        return column;
    }

    private static int Minimum(int[] is) {
        if (is.length == 0) {
            return Integer.MAX_VALUE;
        }
        int min = is[0];
        for (int i = 1; i < is.length; i++) {
            if (is[i] < min)
                min = is[i];
        }
        return min;
    }

    private static int Maksimum(int[] is) {
        if (is.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = is[0];
        for (int i = 1; i < is.length; i++) {
            if (is[i] > max)
                max = is[i];
        }
        return max;
    }

    private static int Ortalama(int[] is) {
        int toplam = 0;

        for (int i = 0; i < is.length; i++) {
            toplam += is[i];
        }
        return toplam / is.length;
    }
}