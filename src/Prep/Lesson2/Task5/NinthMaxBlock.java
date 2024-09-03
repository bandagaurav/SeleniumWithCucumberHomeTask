package Prep.Lesson2.Task5;

public class NinthMaxBlock {
    public static void main(String args[]) {
    System.out.println(largestBlock("hoopla"));




    }

    private static int largestBlock(String str) {

        int max=1;
        int current=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                current++;
            }else{
                if(current>max){
                    max=current;
                }
                current=1;
            }

            if(current>max){
                max=current;
            }

        }


        return max;
    }
}
