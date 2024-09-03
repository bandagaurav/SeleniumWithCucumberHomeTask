package Prep.Lesson2.Task6;

public class SecondBalance {
    public static void main(String args[]) {
        int num[]={1,1,1,2,1};
        System.out.println(canBalance(num));
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));


    }

    private static boolean canBalance(int[] num) {
        int total=0;
        for(int n:num){
            total+=n;
        }

        if(total%2!=0){
            return false;
        }
        int leftSum=0;
        int targetSum=total/2;
        for(int n:num){
            leftSum+=n;
            if(leftSum==targetSum){
                return true;
            }
        }

        return false;
    }
}
