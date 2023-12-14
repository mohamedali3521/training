package DSA;

public class extra_index {
    public static void main(String[] args) {
//        String name="mohamed ali kadar batcha";
//        boolean bool=name.contains("soft");
//        System.out.println(bool);
//        bool=name.contains("kadar");
//        System.out.println(bool);
        String name2="mohamed ali";
        String rev="";
        char arr[]=name2.toCharArray();
        for(int i= arr.length-1;i>=0 ;i--)
        {
            rev=rev+arr[i];
        }
        System.out.println(rev);
    }
}
