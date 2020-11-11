import java.util.Scanner;

public class optionalTask1_Task3 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int number;
        int middle = 0;


        System.out.println("Введите количество чисел");

        number = in.nextInt();

        int arr[] = new int[number];
        int arr2[] = new int[number];


        System.out.println("Введите числа");

        for (int i = 0 ; i < number; i ++)
        {
            int temporary = 0;
            int counter = 0;

            arr[i] = in.nextInt();
            temporary = arr[i] ;

            while (true)
            {
                counter ++;
                arr[i]/=10;
                if(arr[i] == 0)
                {
                    break;
                }
            }

            arr[i] = temporary;
            arr2[i] = counter;

        }
        for(int i = 0 ; i < number; i ++)
        {
            middle+=arr2[i];
        }

        middle/=number;

        System.out.println("Средняя длина"+middle);
        System.out.println("Больше средней длины числа");
        for (int i  = 0 ; i < number; i++)
        {
            if(arr2[i] > middle)
                System.out.println(arr[i]);
        }
        System.out.println("Меньше средней длины числа");
        for (int i  = 0 ; i < number; i++)
        {
            if(arr2[i] < middle)
                System.out.println(arr[i]);
        }





    }
}
