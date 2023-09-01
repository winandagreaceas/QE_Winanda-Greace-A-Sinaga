// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

public class problem2 {
    public static void main(String[] args) {

        // input
        int studentScore = 80;

        // process
        String studentGrade;
        if (studentScore >= 80 && studentScore <= 100) {
            studentGrade = "A";
        } else if (studentScore >= 65 && studentScore < 80) {
            studentGrade = "B+";
        } else if (studentScore >= 50 && studentScore < 65) {
            studentGrade = "B";
        } else if (studentScore >= 35 && studentScore < 50) {
            studentGrade = "C";
        } else if (studentScore >= 0 && studentScore < 35) {
            studentGrade = "D";
        } else {
            studentGrade = "Invalid";
        }

        // output
        System.out.println("Grade untuk skor " + studentScore + " adalah " + studentGrade);
    }
}
