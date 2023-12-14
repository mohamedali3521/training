package DSA;

public class find_Duplicates {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,3,6,6};
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
