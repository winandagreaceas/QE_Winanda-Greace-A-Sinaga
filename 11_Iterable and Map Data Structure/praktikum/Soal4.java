// Winanda Greace A. Sinaga
// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan elemen array pertama: ");
        String input1 = scanner.nextLine();
        String[] numStrings1 = input1.split(" ");
        int[] array1 = new int[numStrings1.length];
        for (int i = 0; i < numStrings1.length; i++) {
            array1[i] = Integer.parseInt(numStrings1[i]);
        }

        System.out.print("Masukkan elemen array kedua: ");
        String input2 = scanner.nextLine();
        String[] numStrings2 = input2.split(" ");
        int[] array2 = new int[numStrings2.length];
        for (int i = 0; i < numStrings2.length; i++) {
            array2[i] = Integer.parseInt(numStrings2[i]);
        }

        Soal4 soal4 = new Soal4();
        int[] result = soal4.ArrayUnique(array1, array2);

        System.out.println("Hasil: ");
        System.out.println(Arrays.toString(result));
    }

    public int[] ArrayUnique(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        for (int num : array2) {
            set.add(num);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int num : array1) {
            if (!set.contains(num)) {
                resultList.add(num);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
