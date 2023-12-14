package DSA;

import java.util.Arrays;

public class Movezeroleft {
    public static void main(String[] args) {
        int arr[]={3,0,5,0,1,7,0,8,10,0,5};
        int n=arr.length;
        int count=0;
        int add=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=0)
            {
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<n) {
            arr[count] = 0;
            count++;
            add++;
        }
        while(add<n-1)
        {
            int first=arr[n-1];
            for(int j=n-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=first;
            add++;
        }
        System.out.println(Arrays.toString(arr));
    }

}
