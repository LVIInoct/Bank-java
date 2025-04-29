import java.util.InputMismatchException;
import java.util.Scanner;

public class withdrawal {
    Scanner scanner = new Scanner(System.in);
    showinf show; // no new showinf(), just the reference
    int bankAmount = 2000;

    // Constructor takes a reference to an existing showinf
    public withdrawal(showinf show) {
        this.show = show;
    }

    public void withdrawIntroduction(String name, String email, int pin, int cardinfo, int money) {
        System.out.println("Withdrawing process:");
        System.out.println("Available bank for withdrawal: Capital Bank");
        System.out.println("Amount user can withdraw $: " + bankAmount);
        System.out.println("Do you wish to withdraw a quantity of money?(yes/no)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            withdrawAction(name, email, cardinfo, pin, money);
        } else {
            System.out.println("Answer not recognizable. Returning to menu.");
            show.handleMenu(name, email, pin, cardinfo, money);
        }
    }

    public void withdrawAction(String name, String email, int cardinfo, int pin, int money) {
        int amount = -1;
        int retryCount = 0;
        while (amount <= 0 || amount > bankAmount) {
            System.out.println("How much do you want to withdraw?");
            try {
                amount = scanner.nextInt();
                scanner.nextLine();

                if (amount <= 0 || amount > bankAmount) {
                    System.out.println("You cannot withdraw more than what you can or a negative amount.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid number. Please enter a valid amount.");
                scanner.nextLine();
            }

            retryCount++;
            if (retryCount >= 3) {
                System.out.println("Too many invalid attempts. Returning to the main menu.");
                show.handleMenu(name, email, pin, cardinfo, money);
                return;
            }
        }
        money = money + amount; // user gets amount
        pinCheck(name, email, pin, cardinfo, money, amount);
    }

    public void pinCheck(String name, String email, int pin, int cardinfo, int money, int amount) {
        int temporaryPin = -1;
        while (temporaryPin != pin) {
            System.out.println("Insert your security PIN: ");
            try {
                temporaryPin = scanner.nextInt();
                scanner.nextLine();
                if (temporaryPin == pin) {
                    System.out.println("Verifying...");
                    bankAmount -= amount; // bank loses amount
                    System.out.println("Withdrawal successful! Your new balance: $" + money);
                    show.handleMenu(name, email, pin, cardinfo, money);
                } else {
                    System.out.println("PIN does not match. Access denied.");
                    show.handleMenu(name, email, pin, cardinfo, money);
                    return;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid PIN. Please enter a valid PIN.");
                scanner.nextLine();
                continue;
            }
        }
    }
}
