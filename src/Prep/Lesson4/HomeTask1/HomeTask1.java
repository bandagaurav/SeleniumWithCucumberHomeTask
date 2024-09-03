package Prep.Lesson4.HomeTask1;

import java.util.stream.IntStream;

public class HomeTask1 {
    public static void main(String args[]) {
String palindrome="ACCA";
System.out.println(checkPalindrome(palindrome));
System.out.println(checkPalindromeusingLambda(palindrome));


    }

    private static boolean checkPalindromeusingLambda(String palindrome) {

        palindrome=palindrome.toLowerCase().replaceAll("\\s+","");
        String finalPalindrome = palindrome;
        return IntStream.range(0,palindrome.length()/2).allMatch(i -> finalPalindrome.charAt(i)== finalPalindrome.charAt(finalPalindrome.length()-1-i));



    }

    private static boolean checkPalindrome(String palindrome) {

        StringBuilder str=new StringBuilder(palindrome);
        str.reverse();
        if(palindrome.equals(str.toString())){
            return true;
        }else{
            return false;
        }



    }
}
