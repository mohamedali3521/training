package DSA;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr={2,4,1,5,6};
        int s[]= Arrays.stream(arr).sorted().toArray();
        System.out.println(s);
    }
}
