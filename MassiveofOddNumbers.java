public class MassiveofOddNumbers {
    public static void main(String args[])
    {
        int[] a = new int [51];
        int i=1;
        int j=1;
        while (i<51)
        {
            a[i] = j;
            j = j+2;
            i++;
        }
        for(i=1;i<51;i++)
        {
            System.out.print(a[i] + " ");
            }
            System.out.print("\n");
        for(i=50;i>0;i--)
        {
            System.out.print(a[i] + " ");
        }
    }
}
