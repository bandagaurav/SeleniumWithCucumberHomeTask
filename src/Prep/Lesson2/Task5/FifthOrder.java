package Prep.Lesson2.Task5;

public class FifthOrder {
    public static void main(String args[]) {
    System.out.println(inOrder(1,2,4,false));

        System.out.println(inOrder(1,2,1,false));

        System.out.println(inOrder(1,2,4,true));

    }

    private static boolean inOrder(int a, int b, int c, boolean b0k) {
        if(b0k){
            return c>b;
        }else{
            return b>a && c>b;
        }



    }
}
