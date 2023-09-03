// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

public class partA_problem6 {
    private static boolean palindrome(String value) {
        // menghapus spasi dan mengubah huruf kapital ke huruf kecil
        value = value.replaceAll("\\s", "").toLowerCase();

        int length = value.length();

        for (int i = 0; i < length / 2; i++) {
            if (value.charAt(i) != value.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("katak")); // true
        System.out.println(palindrome("kupu-kupu")); // false
    }
}
