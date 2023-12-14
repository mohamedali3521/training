package DSA;

public class descending_order {
    public static void main(String[] args) {
        int arr[]={23,42,11,232,42,18,65};
        int n= arr.length;
        for(int i=0;i<n-1;i++)
        {
            int max_ind=i;
            for (int j=i+1;j<n;j++)
            {
                if (arr[j]>arr[max_ind])
                {
                    max_ind=j;
                }
            }
            int temp=arr[max_ind];
            arr[max_ind]=arr[i];
            arr[i]=temp;
        }
        for (int s: arr)
            System.out.print(s+" ");
    }
}
