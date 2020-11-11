import javax.swing.plaf.IconUIResource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class optinalTask2 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int number;

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

        int max = arr[0];
        int min = arr[0];

        int maxlength = arr2[0];
        int minlength = arr2[0];

        for(int i = 0 ; i < number; i++)
        {
            if(arr2[i] > maxlength)
            {
                maxlength = arr2[i];
                max = arr[i];
            }
            if(arr2[i] < minlength)
            {
                minlength = arr2[i];
                min = arr[i];
            }
        }

        System.out.println("Максимальная длина числа " + maxlength + ". Значение числа  " + max);
        System.out.println("Минимальная длина числа " +minlength + ". Значние числа " + min);

    }
}
