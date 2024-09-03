package Prep.Lesson2.Task5;

public class TenthSumNumbers {
    public static void main(String args[]) {
    System.out.println(sumNumbers("aa11b33"));




    }

    private static int sumNumbers(String str) {
        int sum=0;
        StringBuilder number=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                number.append(ch);
            }else{
                if(number.length()>0){
                    sum+=Integer.parseInt(number.toString());
                    number.setLength(0);
                }
            }

        }
        if(number.length()>0){
            sum+=Integer.parseInt(number.toString());
        }


        return sum;
    }
}
