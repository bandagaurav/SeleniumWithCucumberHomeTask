package Prep.Lesson2.Task6;

import java.util.HashMap;
import java.util.Map;

public class FirstLargestSpan {
    public static void main(String args[]) {
int num[]={1,2,1,1,3};
        System.out.println(maxSpan(num));


    }

    private static int maxSpan(int[] num) {
        if(num.length==0){
            return 0;
        }
       HashMap<Integer,Integer> map=new HashMap<>();

        int maxSpan=1;
        for(int i=0;i<num.length;i++){
            if(!map.containsKey(num[i])){
                map.put(num[i],i);
            }else{
                int span=i-map.get(num[i])+1;
                maxSpan= Math.max(maxSpan,span);
            }
        }


        return maxSpan;
    }
}
