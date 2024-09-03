package Prep.Lesson2.Task4;

public class RotatedStrings {
    public static void main(String args[]) {
    String str1="ABCD";
    String str2="CDAB";
    if(isRotation(str1,str2)){
        System.out.println("Two Strings are rotation of each other");
    }else{
        System.out.println("Two Strings are not rotation of each other");

    }


    }

    private static boolean isRotation(String str1, String str2) {

        if(str1.length()!=str2.length()){
            return false;
        }
        String concated=str1+str1;

        return concated.contains(str2);
    }
}
