package Prep.Lesson2.Task6;

public class ThirdCountClumps {
    public static void main(String args[]) {
        int num[] = {1, 2, 2, 3, 3,4};
        System.out.println(countClumps(num));


    }

    private static int countClumps(int[] num) {
        int clumps=0;
        int i=0;
        while(i<num.length){
            if(i< num.length-1 && num[i]==num[i+1]){
                clumps++;
                while(i< num.length-1 && num[i]==num[i+1]){
                    i++;
                }
            }
            i++;
        }


        return clumps;
    }
}
