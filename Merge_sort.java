package DSA;

import java.util.Arrays;

public class Merge_sort {
    public static int[] mergesort(int[] arr)
    {
        if(arr.length==1)
            return arr;
        int mid=arr.length/2;
        int left[]=mergesort(Arrays.copyOfRange(arr,0,mid));
        int right[]=mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right)
    {
        int[] join=new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length&&j<right.length)
        {
            if(left[i]<right[j])
                join[k++]=left[i++];
            else
                join[k++]=right[j++];
        }

        while(i<left.length)
            join[k++]=left[i++];
        while(j<right.length)
            join[k++]=right[j++];
        return join;
    }
    public static void main(String[] args) {
        int[] arr={3,5,1,7,4,6,9};
        arr= mergesort(arr);

        for(int s: arr)
            System.out.print(s+" ");
        Arrays.sort(arr);
    }
}
