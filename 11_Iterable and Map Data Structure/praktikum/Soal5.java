// Winanda Greace A. Sinaga
// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan elemen array berurut: ");
        String input = scanner.nextLine();
        String[] numStrings = input.split(" ");
        int[] nums = new int[numStrings.length];
        for (int i = 0; i < numStrings.length; i++) {
            nums[i] = Integer.parseInt(numStrings[i]);
        }

        Soal5 soal5 = new Soal5();
        int length = soal5.removeDuplicates(nums);

        System.out.println("Panjang sub-array tanpa duplikat: " + length);
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Awalnya setidaknya ada satu elemen unik
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}
