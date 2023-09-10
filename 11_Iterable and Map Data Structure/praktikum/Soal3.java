// Winanda Greace A. Sinaga
// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pada array: ");
        String input = scanner.nextLine();
        String[] numStrings = input.split(" ");
        int[] numbers = new int[numStrings.length];
        for (int i = 0; i < numStrings.length; i++) {
            numbers[i] = Integer.parseInt(numStrings[i]);
        }

        System.out.print("Target: ");
        int target = scanner.nextInt();

        Soal3 soal3 = new Soal3();
        int[] result = soal3.findPairWithSum(numbers, target);

        if (result != null) {
            System.out.println(
                    "Pasangan dengan jumlah " + target + " ditemukan pada indeks: " + result[0] + " dan " + result[1]);
        } else {
            System.out.println("Pasangan dengan jumlah " + target + " tidak ditemukan.");
        }
    }

    public int[] findPairWithSum(int[] nums, int target) {
        Map<Integer, Integer> numIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndices.containsKey(complement)) {
                return new int[] { numIndices.get(complement), i };
            }
            numIndices.put(nums[i], i);
        }

        return null; // Tidak terdapat pasangan yang cocok
    }
}