package DSA;

import java.util.Arrays;

public class mergeTwoarraysort {
    public static void main(String[] args) {
        int[] m={2,4,7,9,11};
        int[] n={1,3,5,8};
        int[] mergeArray=new int[m.length+n.length];
        int ind=0;
        for(int s: m) {
            mergeArray[ind] = s;
            ind++;
        }
        for(int p: n) {
            mergeArray[ind] = p;
            ind++;
        }
        System.out.println(Arrays.toString(mergeArray));
        Arrays.sort(mergeArray);
        System.out.println(Arrays.toString(mergeArray));
        int[] m1=Arrays.copyOfRange(mergeArray,0,m.length);
        int[] n1=Arrays.copyOfRange(mergeArray,m.length,mergeArray.length);
        System.out.println(Arrays.toString(m1));
        System.out.println(Arrays.toString(n1));
    }
}
