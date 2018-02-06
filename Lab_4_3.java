public class Lab_4_3
{

        public static void pr()                            //метод вывода
        {
            System.out.println();
        }
        public static int rand(int a, int b)                  //метод случайного заполнения из диапазона [a,b]
        {
            return (int)(Math.random()*(b-a+1)+(a));
        }
        public static void arr(int[] m)
        {
            for(int i=0; i<m.length; i++)
            {
                System.out.print(m[i]+" ");
            }
        }
        public static void sort(int[] a)                     //метод сортировки пузырьком
        {
            for (int i = a.length - 1; i >= 2; i--)
            {
                boolean sorted = true;
                for (int j = 0; j < i; j++)
                {
                    if (a[j] > a[j+1])
                    {
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                        sorted = false;
                    }
                }
                if(sorted)
                {
                    break;
                }
            }
        }
        public static void main(String[] args)
        {
            int[] m = new int[20];
            int a = 1, b = 20;
            for(int i=0; i<m.length; i++)
            {
                m[i] = rand(a, b);
            }
            arr(m);
            sort(m);
            pr();
            arr(m);
        }

}
