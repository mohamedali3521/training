package DSA;

public class roataing_left {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int d=2,p=1;
        while (p<=d)
        {
            int last=arr[0];
            for (int i=0;i<n-1;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[n-1]=last;
            p++;
        }
        for(int s:arr)
        {
            System.out.print(s);
        }
    }
}
