package DSA;

public class fibonacci_recursion {
    static int n1=0,n2=1,n3;
    static void fibo(int count)
    {
       if(count>0)
       {
           n3=n1+n2;
           n1=n2;
           n2=n3;
           System.out.print(" "+n3);
           fibo(count-1);
       }

    }
    public static void main(String[] args) {
        int count=10;
        fibo(count-2);
        System.out.print(n1+" "+n2);


    }
}