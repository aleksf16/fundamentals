import java.util.Scanner;

public class file3 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int number;
        int summ = 0;
        number = in.nextInt();

        for(int i = 0; i < number; i++)
        {
            int numb;
            numb= in.nextInt();
            summ+=numb;
        }
        System.out.println(summ);
    }
}
