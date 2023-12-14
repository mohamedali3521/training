package DSA;

public class insertingArray {
    public static void main(String[] args) {
        int array_1[]=new int[5];
        for (int i=0;i< array_1.length;i++)
        {
            System.out.println("array_1" + "[" +i+ "] =" + i);
        }
        System.out.println("After inserting array elements");
        for (int j=0;j<array_1.length;j++)
        {
            array_1[j]=j+1;
            System.out.println("array_1" + "[" +j+ "] =" + array_1[j]);
        }
        for(int s:array_1)
        {
            System.out.println(s);
        }
    }
}
