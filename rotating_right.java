package DSA;

public class rotating_right {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int d = 2, p = 1;
        while (p<=d)
        {
            int first=arr[n-1];
            for(int i=n-1;i>0;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[0]=first;
            p++;
        }
        for(int s: arr)
        {
            System.out.print(s);
        }
    }
}
