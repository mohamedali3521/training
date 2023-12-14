package DSA;

public class stringReverse {

    public static void main(String[] args) {
        String name="mohamed ali";
        String[] split =name.split("");
        for(int i=0;i< split.length;i++)
            System.out.print(split[i]+" ");
        System.out.println();
        System.out.println("After reverse");
        reverse_string(split,0,10);

    }
    static void reverse_string(String[] split, int start, int end)
    {
        String temp;
        while(start<end)
        {
            temp=split[start];
            split[start]=split[end];
            split[end]=temp;
            start++;
            end--;

        }
        for(String s:split)
            System.out.print(s+" ");

    }
}
