package Prep.Lesson2.Task4;

import java.util.HashMap;

public class DuplicateCharsinString {
    public static void main(String args[]) {
String str="aaabbbcccdffhee";
duplicateCharacters(str);

    }

    private static void duplicateCharacters(String str) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] ch=str.toCharArray();
        for(Character ch1:ch){
            if(map.containsKey(ch1)){
                map.put(ch1, map.get(ch1)+1);
            }else{
                map.put(ch1,1);
            }
        }
        for(Character ch2: map.keySet()){
            if(map.get(ch2)>1){
                System.out.print(" "+ch2);
            }
        }
    }
}
