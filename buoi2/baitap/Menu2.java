package buoi2.baitap;

import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Right triangle, with right angle side at top-left");
            System.out.println("2. Right triangle, with right angle side at bottom-left");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("--------------------------");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("right triangle, with right angle side at top-left:");
                    int hight;
                    System.out.printf("Nhập vào chiều cao của tam giác: ");
                    hight = input.nextInt();
                    for (int i = hight; i >= 1; --i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n----------------------------------");
                    break;
                case 2:
                    System.out.println("right triangle, with right angle side at bottom-left");
                    int hight2;
                    System.out.printf("Nhập vào chiều cao của tam giác: ");
                    hight2 = input.nextInt();
                    for (int i = 1; i <= hight2; ++i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("\n----------------------------------");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    int hight3,width;
                    System.out.print("Nhập vào chiều cao của hình chữ nhật: ");
                    hight3 = input.nextInt();
                    System.out.print("nhập vào chiều rộng của hình chữ nhật:");
                    width = input.nextInt();
                    for (int i = 0; i < hight3;i++){
                        for (int j = 0; j <= width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("-----------------------------------");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
