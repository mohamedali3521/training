package DSA;

public class insertion_Array{
    public static void main(String[] args) {
        int arr[]={3,1,6,5,9,7,23,3,4,45};
        int n=arr.length;
        for(int i = 1;i<n;i++)
        {
            for(int j =i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else
                    break;
            }
        }
        for(int s: arr)
            System.out.print(s+" ");
    }
}
