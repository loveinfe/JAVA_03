import java.util.Scanner;
public class Week{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("今天是星期幾？");
        int i = s.nextInt();
        int j = 6;

        String q = i<j?"今天要上班！":"今天是周末！";

         System.out.println(q);


    }
}
