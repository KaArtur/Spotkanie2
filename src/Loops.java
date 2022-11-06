import java.math.BigInteger;

public class Loops {
    public static void main(String[] args) {
        /*int x = 5;
        {
            //początek bloku
            int y = 10;
            y=x+y;
            System.out.println(y);
            //koniec bloku
        }*/

        //if
       /* int x = 2;
        if (x > 2) {
            System.out.println("Jest większe od 2");
        } else if (x<2) {
            System.out.println("Nie jest większe od 2");
        } else {
            System.out.println("Jest równe 2");
        }*/

        //instrukcja switch
        //byte Byte
        //short i Short
        //int i Integer
        //enum
        //String

  /*      char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Wspaniale");
                break;
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'D':
                System.out.println("Mogło być lepiej");
                break;
            default:
                System.out.println("Rozważ oszukiwanie");
        }*/
/*

        int myScore = 98;
        int yourScore = 102;
        int ourBestScore = myScore > yourScore ? myScore : yourScore;
*/

        /*for (int i = 1; i<100; i++){
            System.out.println(" i = " + i);
        }*/

//petla niesko nczona

//        for (;;) {
//            System.out.println("pętla nieskończona");
//        }

//        //fori dodaje templatke
//        for (int i = 0; i < 100; i++) {
//        }

        //wszystkie cyfry
       /* for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", i);
        }




        System.out.println("-------");
        //oblicz silnia
        int number = 6;
        BigInteger factorial = BigInteger.ONE;
        for (int i =1; i < number ; i++) {
            factorial=factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("%d! = %s%n", number,factorial);

*/

        //wartość bit ow w bajcie
//        /128  64  32 16 8 4 2 1
//           0  0  0  0  0 0 0 0
//        for (int i = 1, sum=1 ; i <= 128 ; i=i*2, sum+=i) {
//            System.out.printf("i = %d, sum = %d%n", i, sum );
//        }

        // pętla while
//
        //pętla do while
//        int i = 10;
//        do {
//            System.out.println(i);
//            i++;
//        }while (i<100);

        /////////////////////////////
        /*for (int i = 1; i <10 ; i++) {

            if(i % 2==1){
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }
*/
///////////////////

        out: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.println(i + " " + j);
                break out;
            }


        }

    }
}
