package samAlly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Sam's daily total of hours worked:");
        int sam = Integer.parseInt(input.nextLine());
        System.out.println("Enter Ally's daily total of hours worked:");
        int ally = Integer.parseInt(input.nextLine());
        System.out.println("Enter the amount of hours Sam is starting with:");
        int diff = Integer.parseInt(input.nextLine());
        Result result = new Result();
        int r = result.minNum(sam, ally, diff);
        System.out.print("It will take Ally " + r + " days to surpass Sam in hours worked.");
        input.close();
    }
    
}
