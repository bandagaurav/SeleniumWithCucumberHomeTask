package Prep.Lesson2.Task5;

public class FourthLoyttery {

    public static void main(String args[]) {
System.out.println(ticket(9,1,0));
        System.out.println(ticket(11,1,1));
        System.out.println(ticket(6,1,3));

    }

    private static int ticket(int a, int b, int c) {
        int ab=a+b;
        int bc=b+c;
        int ac=a+c;
        if(ab==10 || bc==10 || ac==10){
            return 10;
        } else if (ab==bc+10 || ab==ac+10) {
            return 5;
        }else {
            return 0;
        }


    }
}
