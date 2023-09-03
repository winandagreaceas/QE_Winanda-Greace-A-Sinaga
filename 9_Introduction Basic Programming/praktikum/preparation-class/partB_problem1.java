// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

public class partB_problem1 {
    private static int pangkat(int x, int n) {
        if (n == 0) {
            return 1; // apabila pangkat 0, hasil = 1
        } else {
            return x * pangkat(x, n - 1); // Rekursif: x^n = x * x^(n-1)
        }
    }

    public static void main(String[] args) {
        System.out.println(pangkat(2, 3)); // 8
        System.out.println(pangkat(7, 2)); // 49
    }
}
