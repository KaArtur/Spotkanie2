public class FrequentNumber {
    public static void main(String[] args) {

        int[] arr = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        int[] counters = new int[10];
        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++;
        }

        for (int i: counters) {
            System.out.println(i);
        }

        int mostFrequent = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[i]>counters[mostFrequent]) {
                mostFrequent=i;
            }
        }
        System.out.print("Najczęsciej wystepujaca cyfrą jest cyfra " + mostFrequent);
        System.out.println(", wystąpiła " + counters[mostFrequent] + " razy");
    }
}
