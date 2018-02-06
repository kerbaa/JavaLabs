public class Lab_4_2
{
    public static void pr()
    {
        System.out.println();
    }
    public static int rand(int a, int b)
    {
        return (int)(Math.random()*(b-a+1)+(a));
    }
    public static void arr(int[]m)
    {
        for ( int i = 0; i <m.length;i++ )
        {
            System.out.print(m[i]+" ");
        }

    }
    public static void main(String args[])
    {
        int[] m1 = new int[10], m2= new int[10], m3 = new int[10], m4 = new int[10], m5 = new int[10];
        int a = 1, b = 20;
        int i;
        for( i = 0; i<m1.length; i++)
        {
            m1[i] = rand(a,b);
        }
        arr(m1);
        pr();
        for (i= 0;i<m2.length;i++ )
        {
            m2[i] = rand(a,b);
        }
        arr(m2);
        pr();
        for (i=0;i<m3.length;i++)
        {
            m3[i] = rand(a,b);
        }
        arr(m3);
        pr();
        for (i=0;i<m4.length;i++)
        {
            m4[i] = rand(a,b);
        }
        arr(m4);
        pr();
        for (i=0;i<m5.length;i++)
        {
            m5[i] = rand(a,b);
        }
        arr(m5);
        pr();

    }

}
