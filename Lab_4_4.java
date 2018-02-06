public class Lab_4_4
{
    public static long F(int a)
    {
        if (a==0) return 0;
        if (a==1) return 1;
        return F(a-1)+F(a-2);
    }
    public static void main(String atgs[])
    {
        for ( int a=0; a<=47;a++)                 //при подсчете 48 элемента последовательности время подсчета > 1 минуты
        {
            System.out.println(a + " " + F(a));
        }
    }

}
