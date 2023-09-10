// Winanda Greace A. Sinaga
// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kumpulan angka: ");
        String input = scanner.nextLine();

        Soal2 soal2 = new Soal2();
        List<Integer> uniqueNumbers = soal2.findUniqueNumbers(input);

        System.out.println("Angka yang hanya muncul satu kali adalah:");
        for (Integer number : uniqueNumbers) {
            System.out.print(number + " ");
        }
    }

    public List<Integer> findUniqueNumbers(String input) {
        String[] numbers = input.split(" ");
        Map<Integer, Integer> numberCount = new HashMap<>();

        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            numberCount.put(num, numberCount.getOrDefault(num, 0) + 1);
        }

        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumbers.add(entry.getKey());
            }
        }

        return uniqueNumbers;
    }
}
