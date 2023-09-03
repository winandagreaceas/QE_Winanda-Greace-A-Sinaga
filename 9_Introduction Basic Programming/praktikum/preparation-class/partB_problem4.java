// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

public class partB_problem4 {
    private static void cetakTablePerkalian(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        cetakTablePerkalian(9);
    }
}
