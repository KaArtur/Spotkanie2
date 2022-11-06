public class BinaryConverter {
    public static void main(String[] args) {
        String binary = "1101";    // 1 *2^0 + ...
        Long result = 0L;

        // 1  1  0  1 - liczba binarnie
        // 0  1  2  3 - indeks (i)
        // 3  2  1  0 - (długość - 1 - i) - reversIndex

        for (int i = 0; i < binary.length(); i++) {
            int reversIndex = binary.length() - 1 - i;
            char c = binary.charAt(reversIndex);
            int bit = Character.getNumericValue(c);

            //1 *2^0 + 0*2^1 + 1*2^2 + 1*2^3 = 1 + 0 + 4 + 8 = 13
            result += bit * (int)Math.pow(2 , i);
        }

        System.out.println("binarnie " + binary + " to " + result + " dziesiętnie");
        System.out.println((Integer.toBinaryString(13 )));
    }

}
