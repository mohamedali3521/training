package DSA;

public class deletingArray {
    public static void main(String []args) {
       int arr[]=new int[5];
       int n= arr.length;
       for(int i=0;i<n;i++)

       {
           arr[i]=i+5;
           System.out.println("arr["+i+"] = "+arr[i]);
       }
        System.out.println("After deleting  7 & 8");
       for(int j=0;j<n-2;j++)
       {
           arr[j+2]=arr[j+4];
           n=n-2;
       }
       for (int m=0;m<n;m++)
       {
           System.out.println("arr["+m+ "] ="+arr[m]);
       }

    }
}
