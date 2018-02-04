import java.util.Scanner;

public class Name_Compare
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         String n1 = sc.next();
         String n2 = sc.next();
         if (n1.equals(n2))
             System.out.println("Identity");
         else if (n1.length()==n2.length())
             System.out.println(n1.length());
         else
             System.out.println("Error");



    }
}
