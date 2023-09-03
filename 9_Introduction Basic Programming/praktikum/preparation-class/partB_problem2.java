// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

public class partB_problem2 {
    private static void playWithAsterisk(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) { // Untuk mengatur spasi antar asterisk
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        playWithAsterisk(5);
    }
}
