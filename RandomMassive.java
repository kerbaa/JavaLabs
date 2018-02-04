public class RandomMassive
{
    public static void main (String args[])
    {
        int [] a = new int[15];
        int sum = 0;
        for (int i=0;i<15;i++)
        {
            a[i] = (int) (Math.random() * 9);  //величиваем максимальный диапазон функции Math.random() до 9
            System.out.print(a[i] + " ");
            if(a[i]>0 && a[i]%2==0)            //подсчитываем кол-во четных чисел
                sum++;
        }
        System.out.println(" ");
        System.out.println("Even numbers - "+sum);
    }
}



