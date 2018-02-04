import java.util.Scanner;

public class MinOfFour
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int n=Math.min(a,b);
        int m=Math.min(c,d);
        System.out.println(Math.min(n,m));

    }
}
