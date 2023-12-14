package DSA;

public class selection_sort {
    public static void main(String[] args) {
        int arr[]={43,21,54,65,1,3};
        int n=arr.length;
        System.out.println("before sorting");
        for(int s:arr)
        {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("after sorting");
        for(int i=0;i<n-1;i++)
        {
            int minimum_index=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minimum_index])
                {
                    minimum_index=j;
                }
            }
            int temp=arr[minimum_index];
            arr[minimum_index]=arr[i];
            arr[i]=temp;
        }
        for (int k:arr)
        {
            System.out.print(k+" ");
        }
    }
}
