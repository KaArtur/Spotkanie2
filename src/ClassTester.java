public class ClassTester {

    int i; // zmienna egzemplarza (pole klasy)
    static int j = 2; //zmienna egzemplarza klasowa(pole statyczne)

    public int change() {
        int k = 7; //zmienna lokalna
        return i + (k * j);
    }


    public static void main(String[] args) {

        ClassTester ct = new ClassTester(); // ct to zmienna lokalna
        ct.i = 4;
        ClassTester ct2 = new ClassTester(); // ct to zmienna lokalna
        ct2.i = 9;


        System.out.println(ct.i); //żęby wyswietlić obiekt trzeba stworzyc obiekt
        System.out.println(ct2.i); //żęby wyswietlić obiekt trzeba stworzyc obiekt
        System.out.println(j);


    }
}

