package Prep.Lesson4.HomeTask1;

import java.util.function.BiPredicate;

public class HomeTask3 {
    public static void main(String args[]) {
        String str1="ABCD";
        String str2="CDAB";
        if(isRotation(str1,str2)){
            System.out.println("Two Strings are rotation of each other");
        }else{
            System.out.println("Two Strings are not rotation of each other");

        }

        if(isRotationByLambda(str1,str2)){
            System.out.println("Two Strings are rotation of each other");
        }else{
            System.out.println("Two Strings are not rotation of each other");

        }
    }

    private static boolean isRotationByLambda(String str1, String str2) {

        BiPredicate<String,String> isRotation=(s1,s2)-> s1.length()==s2.length() && (s1+s1).contains(s2);


        return isRotation.test(str1,str2);
    }

    private static boolean isRotation(String str1, String str2) {

        if(str1.length()!=str2.length()){
            return false;
        }
        String concated=str1+str1;

        return concated.contains(str2);
    }
}





