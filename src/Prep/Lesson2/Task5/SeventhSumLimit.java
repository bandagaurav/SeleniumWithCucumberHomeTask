package Prep.Lesson2.Task5;

public class SeventhSumLimit {
    public static void main(String args[]) {

    System.out.println(sumDigits(2,3));
        System.out.println(sumDigits(9,3));


    }

    private static int sumDigits(int a, int b) {
        int sum=a+b;
        int aDigits=countDigits(a);
        int sumDigits=countDigits(sum);
        if(aDigits==sumDigits){
            return sum;
        }else{
            return a;
        }
    }

    private static int countDigits(int num) {
        return String.valueOf(num).length();
    }
}
