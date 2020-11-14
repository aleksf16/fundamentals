import java.util.Scanner;

public class optionalTask2_task1 {

    public static void swap(int arr[][], int size,int number, int number2 )
    {
        for(int i = 0; i < size; i++)
        {
            int temp = arr[number][i];
            arr[number][i] = arr[number2][i];
            arr[number2][i] = temp;
        }

    }
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int size;
        int number = 0;
        System.out.println("Введите размер матрицы");
        size = in.nextInt();
        int arr[][] = new int[size][size];
        for(int i  = 0 ; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                arr[i][j]= (int)(Math.random()*10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Введите номер столбца");
        number = in.nextInt();
               for(int k = 0; k < size; k++) {
                    for (int i = 1; i < size; i++) {
                       int numb = i;
                        if (arr[numb - 1][number - 1] > arr[numb][number - 1]) {
                         swap(arr, size, i - 1, i);
                         }

                    }
               }
        for(int i  = 0 ; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
