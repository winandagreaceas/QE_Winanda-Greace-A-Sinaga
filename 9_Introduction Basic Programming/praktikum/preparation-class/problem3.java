// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

public class problem3 {
    public static void main(String[] args) {
        int bilangan = 6;

        // process
        System.out.println("Faktor dari " + bilangan + " adalah:");

        for (int i = 1; i <= bilangan; i++) {

            if (bilangan % i == 0) {
                System.out.println(i);
            }
        }
    }
}
