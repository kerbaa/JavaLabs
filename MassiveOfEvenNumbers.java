public class MassiveOfEvenNumbers
{
    public static void main(String args[])
    {
        int[] a = new int [10];              //размер массива 10, т.к в диапазоне от 2 до 20 - 10 целых чисел
        int i = 0;
        int j = 0;
        while (i<10)
        {
            a[i] = j;
            j = j+2;
            i++;
        }
        for(i=0;i<10;i++)                   //вывод в строку
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(i=0;i<10;i++)                   //вывод в столбик
        {
            System.out.println(a[i]);
        }
    }
}
