import java.util.StringTokenizer;

public class lab6 {
    int height, width, depth;


    public static void main(String[] args) {

        StringTokenizer data;

        String birthday = "29/04/2016";
        data = new StringTokenizer(birthday, "/");
        System.out.println("DD: " + data.nextToken());
        System.out.println("MM: " + data.nextToken());
        System.out.println("RRRR: " + data.nextToken());

        System.out.println("-----------");
        System.out.println("Zadanie 2");


        lab6 sample = new lab6();
        sample.depth = 10;
        sample.height = 50;
        sample.width = 30;

        System.out.println("Depth: " + sample.depth);
        System.out.println("Height: " + sample.height);
        System.out.println("Width: " + sample.width);
    }


}

