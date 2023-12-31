package lv3_loop;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCost = sc.nextInt();
        int item = sc.nextInt();
        int calculateCost = 0;

        for (int i = 0; i < item; i++) {
            int price = sc.nextInt();
            int quantity = sc.nextInt();

            calculateCost += price * quantity;
        }

        if(totalCost == calculateCost) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
