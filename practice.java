import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();

        float totalBill=pencil+pen+eraser;
        System.out.println("Total Bill: " + totalBill);
        //add gst 18 %
        float BillWithGST=totalBill+(0.18f*totalBill);
        System.out.println("Bill with GST: " + BillWithGST);

    }
}
