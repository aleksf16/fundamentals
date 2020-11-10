import java.util.Scanner;

public class fundamentals {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String name;
        int arr[] = new int[4];


        for(int i =0 ; i< arr.length; i++)
        {
            arr[i] = in.nextINT();
        }
        name = in.nextLine();
        System.out.println("Your name18`72634781`26 " + name);
        for (int i = 0 ; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
