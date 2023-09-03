// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

public class partB_problem3 {
    private static void DrawXYZ(int n) {
        char[][] pattern = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    pattern[i][j] = 'X';
                } else if ((i + j) % 3 == 0) {
                    pattern[i][j] = 'Z';
                } else {
                    pattern[i][j] = 'Y';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DrawXYZ(5);
    }
}
