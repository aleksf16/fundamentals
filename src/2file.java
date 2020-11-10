import java.util.Scanner;

public class file2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number  ;
        number = in.nextInt();
        int arr[] = new int[number];

        for(int i = 0 ; i < number; i++)
        {
            arr[i] = in.nextInt();
        }

        for(int i = 0 ; i < number; i++)
        {
            System.out.println(arr[i]);

        }
        for(int i = 0 ; i < number; i++)
        {
            System.out.print(arr[i] + " ");

        }

    }
}
