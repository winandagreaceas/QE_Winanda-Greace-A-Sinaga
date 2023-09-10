// Winanda Greace A. Sinaga
// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan elemen array: ");
        String input = scanner.nextLine();
        String[] numStrings = input.split(" ");
        int[] nums = new int[numStrings.length];
        for (int i = 0; i < numStrings.length; i++) {
            nums[i] = Integer.parseInt(numStrings[i]);
        }

        System.out.print("Masukkan k: ");
        int k = scanner.nextInt();

        Soal6 soal6 = new Soal6();
        int maxSum = soal6.findMaxSumSubarray(nums, k);

        System.out.println("Maksimum sum dari sub-array berukuran " + k + ": " + maxSum);
    }

    public int findMaxSumSubarray(int[] nums, int k) {
        if (nums.length < k) {
            throw new IllegalArgumentException("Ukuran subarray (k) melebihi panjang array.");
        }

        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        int windowSum = maxSum;
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
