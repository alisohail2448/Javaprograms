import java.util.Scanner;

public class ATM {
    public static void main(String args[]) {
        int pin = 56567;
        System.out.println("Welcome. ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Pin: ");
        if (pin == sc.nextInt()) {
            atm();
        } else {
            System.out.println("Wrong Pin.");
            System.out.println("Try again by removing." + "and inserting the card again");
        }
        sc.close();

    }

    public static void atm() {
        int balance = 1000000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Desired Opearation :");
        String checker = sc.nextLine();
        switch (checker) {
            case "whitdraw": {
                System.out.println("Please Enter The Amount: ");
                balance -= sc.nextInt();
                System.out.println("Your Balance is " + balance + ".");
                break;
            }
            case "deposit": {
                System.out.println("Please Enter The Amount: ");
                balance += sc.nextInt();
                System.out.println("Your Balance is " + balance + ".");
                break;
            }
            case "check balance": {
                System.out.println("Please Enter The Amount: ");
                System.out.println("Your Balance is " + balance + ".");
                break;
            }
        }
        System.out.println("Thank You for Visiting our Bank" + "please come back again");
        sc.close();

    }
}
