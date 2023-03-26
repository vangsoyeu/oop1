package buoi1.bai$tap;

import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        int vnd = 23000, usd;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter munber USD: ");
        usd = input.nextInt();
        int result = usd*vnd;
        System.out.println("The value of VND is: " + result);
    }
}
