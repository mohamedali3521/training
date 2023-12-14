package DSA;

public class MovezeroRight {
    public static void main(String[] args) {
        int[] arr={3,5,0,0,4};
        int n=arr.length;
        int count = 0; // Count of non-zero elements

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Fill the remaining positions with zeros
        while (count < n) {
            arr[count] = 0;
            count++;
        }
        for(int s: arr)
        {
            System.out.print(s+" ");
        }
    }
}
