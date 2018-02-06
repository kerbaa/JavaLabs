public class Lab_4_1
{
   public static void pr()
   {
       System.out.println();
   }
   public static int rand(int a, int b)
   {
       return (int)(Math.random()*(b-a+1)+(a));
   }
   public static void main(String args[])
   {
       int[] m=new int[20];
       int a = 1;
       int b = 19;
       for(int i = 0;i<m.length;i++)
       {
           m[i] = rand(a,b);
           System.out.print(m[i] + " ");
       }
       pr();
   }
}
