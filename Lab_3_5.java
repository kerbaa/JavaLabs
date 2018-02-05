public class Lab_3_5
{
    public static void main(String[] args)
    {
        int max=0;
        int x=0;
        int temp=0;
        int sum=0;
        int[][] a = new int[7][4];
        int [] a1 = new int[a.length];

        for(int i = 0; i < 7; ++i)
        {
            System.out.println();

            for(int j = 0; j < 4; ++j) {
                a[i][j] = (int)( Math.random() * 11)-5;
                max= max + Math.abs(a[i][j]);
                System.out.print(a[i][j] + " \t");
                if (j==0) a1[i]=a[i][j];
                else a1[i]*=a[i][j];
                if(j==a[i].length-1)
                {
                    System.out.println(" ");
                }

            }

            if (max>temp)
            {
                x=i+1;
                temp=max;
            }
            max=0;}
        System.out.println("Номер строки = " + x);





    }
}


