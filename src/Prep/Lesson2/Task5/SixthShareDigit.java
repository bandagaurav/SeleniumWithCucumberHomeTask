package Prep.Lesson2.Task5;

public class SixthShareDigit {
    public static void main(String args[]) {
    System.out.println(isShareDigit(12,23));
        System.out.println(isShareDigit(12,43));



    }

    private static boolean isShareDigit(int a, int b) {

        int a1=a/10;
        int a2=a%10;

        int b1=b/10;
        int b2=b%10;

        return (a1==b1 || a1==b2 || a2==b1 || a2==b2);





    }


}
