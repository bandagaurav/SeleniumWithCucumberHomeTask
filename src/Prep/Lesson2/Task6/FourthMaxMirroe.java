package Prep.Lesson2.Task6;

public class FourthMaxMirroe {

    public static void main(String args[]) {
        int num[]={1,2,3,8,9,3,2,1};
        System.out.println(maxMirror(num));


    }

    private static int maxMirror(int[] num) {
        int n= num.length;
        int[] reversed=new int[n];
        for(int i=0;i<n;i++){
            reversed[i]=num[n-1-i];
        }
        int[][] dp=new int[n+1][n+1];
        int max=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(num[i-1]==reversed[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    max=Math.max(max,dp[i][j]);
                }

            }
        }


        return max;
    }
}
