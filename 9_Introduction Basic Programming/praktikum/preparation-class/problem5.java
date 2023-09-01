// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

public class problem5 {
    public static boolean primeNumber(int number) {
        // BUKAN BILANGAN PRIMA
        if (number < 2) {
            return false;
        }
        // ADALAH BILANGAN PRIMA APABILA BILANGANNYA DAPAT DIBAGI OLEH BIL LAIN SELAIN 1
        // DAN DIRINYA SENDIRI
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        // ADALAH BILANGAN PRIMA APABILA TIDAK TERDAPAT BILANGAN LAIN YANG DAPAT MEMBAGI
        // BILANGAN TERSEBUT
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(7)); // true
        System.out.println(primeNumber(10)); // false
    }
}
