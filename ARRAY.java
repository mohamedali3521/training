package DSA;
class rev{
     public int[] reverse_Array(int arr[],int start,int end)
    {
        int temp;
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        for(int a:arr)
        {
            System.out.print(a);
        }
        return arr;
    }

}

public class ARRAY {

    public static void main(String[] args) {
        rev rev=new rev();
        int arr[]={1,2,3,4,5,6};
       rev.reverse_Array(arr,0,arr.length-1);

    }
}
