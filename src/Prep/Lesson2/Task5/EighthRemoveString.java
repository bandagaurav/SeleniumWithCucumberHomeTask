package Prep.Lesson2.Task5;

public class EighthRemoveString {
    public static void main(String args[]) {
    System.out.println(removeString("Hello World","o"));
        System.out.println(removeString("HellO World","o"));




    }

    private static String removeString(String base, String remove) {
        String regex="(?i)"+remove;

        return base.replaceAll(regex,"");



    }
}
