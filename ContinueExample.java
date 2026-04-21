import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter no.");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }

            System.out.println("No. is:" +n);
        } while (true);

        
    }
}