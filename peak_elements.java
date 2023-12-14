package DSA;
import java.util.Arrays;
class peak{
    public void peakElement(int[] arr,int n)
    {
        //add code here.
        int[] copyArray=new int[n];
        for(int i=0;i<n;i++)
        {
            copyArray[i]=arr[i];
        }
        Arrays.sort(copyArray);
        int last=copyArray[n-1];
        int count=0;
        for(int j=0;j<n;j++)
        {
            if (arr[j]==last)
            {
                count=j;
            }
        }
        System.out.println(count);


    }
}

public class peak_elements {
    public static void main(String[] args) {
        peak p=new peak();
        int arr[] = {2, 4, 10, 1, 5};
        int n = arr.length;
        p.peakElement(arr,n);
    }

}


