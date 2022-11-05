public class TextFormat {
    public static void main(String[] args) {

        int accountBalance = 15005;
        System.out.printf("Saldo: %,d zł%n", accountBalance);

        // %[flags][width][.precision]conversion-character
        // s - strings
        // d - decimal integers
        // f - floating points number
        // t - date / time
        // n - new line
        // bB - booleans

        double pi = Math.PI;
        System.out.println(pi);

        System.out.printf("%.11f%n", pi);
    }
}
