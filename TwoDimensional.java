public class TwoDimensional
{
    public static void main(String args[])
    {
        int [] [] a=new int [8][5];
        for (int i=0;i<8;i++)
        {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                a[i][j] = (int) (10 + Math.random() * 90);
                System.out.print(a[i][j] + " \t");
            }
        }

    }
}
