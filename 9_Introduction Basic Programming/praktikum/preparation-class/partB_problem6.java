// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

public class partB_problem6 {
    private static float Mean(float[] numbers) {

        float sum = 0;

        // Menjumlahkan seluruh angka dalam array
        for (float angka : numbers) {
            sum += angka;
        }

        // Mean = rata-rata
        float mean = sum / numbers.length;
        return mean;
    }

    public static void main(String[] args) {
        float[] value = { 1, 2, 3, 4 };
        System.out.println(Mean(value));
    }
}
