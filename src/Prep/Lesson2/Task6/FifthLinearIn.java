package Prep.Lesson2.Task6;

public class FifthLinearIn {
    public static void main(String args[]) {
        int num1[]={1,2,4,6};
        int num2[]={2,4};

        System.out.println(linearIn(num1,num2));
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));


    }

    private static boolean linearIn(int[] outer, int[] inner) {

        int outerIndex=0;
        int innerIndex=0;
        while(outerIndex<outer.length && innerIndex<inner.length){
            if(outer[outerIndex]==inner[innerIndex]){
                innerIndex++;
            }
            outerIndex++;
        }


        return innerIndex==inner.length;
    }
}
