// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

public class soalEksplorasi {
    private static String ubahHuruf(String s){
        StringBuilder hasilEnkripsi = new StringBuilder();

        for (char karakter : s.toCharArray()) {
            if (Character.isLetter(karakter)) {
                char batas = Character.isUpperCase(karakter) ? 'A' : 'a';
                char hurufEnkripsi = (char) (batas + (karakter - batas + 10) % 26);
                hasilEnkripsi.append(hurufEnkripsi);
            }
            else {
                hasilEnkripsi.append(karakter);
            }
        }
        return hasilEnkripsi.toString();
    }
    public static void main(String[] args){
        System.out.println(ubahHuruf("SEPULSA OKE"));
    }
}
