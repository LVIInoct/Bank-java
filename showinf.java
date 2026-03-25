import java.util.Scanner;

public class showinf {
    Scanner scanner = new Scanner(System.in);
    withdrawal with;

    // Constructor to pass itself to withdrawal
    public showinf() {
        with = new withdrawal(this); //avoid recursive constructor loop
    }

    public void printinf(String name, String email, int pin, int cardinfo, int money){
        System.out.println("Called: printInf");
        printWelcome(name, email, pin, cardinfo, money);
        handleMenu(name, email, pin, cardinfo, money); // was missing from your last version
    }

    public void printWelcome(String name, String email, int pin, int cardinfo, int money){
        System.out.println("Welcome back Visabank, "+name);
        System.out.println("Here is your bank account information: ");
        System.out.println("Amount of money: "+money);
        System.out.println("PIN: "+pin);
        System.out.println("Card info: "+cardinfo);
        System.out.println("Your e-mail is:"+email);
        System.out.println(" ");
    }

    public void handleMenu(String name, String email, int pin, int cardinfo, int money) {
        System.out.println("Called: handleMenu");
        boolean continueMenu = true;
        while (continueMenu) {
            System.out.println("What do you want to do next?\n1) Transfer money\n2) Take money\n3) Consultate info\n4) Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
        
            switch (choice) {
                case 1:
                    handleTransfer(name, pin, cardinfo, money);
                    break;
                case 2:
                    with.withdrawIntroduction(name, email, pin, cardinfo, money);
                    continue;
                case 3:
                    printWelcome(name, email, pin, cardinfo, money);
                    continue;
                case 4:
                    System.out.println("See you soon!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }

    public void handleTransfer(String name, int pin, int cardinfo, int money){
        if (money == 0) {
            System.out.println("You cannot transfer money. Reason: you do not have enough money.");
            return;
        }
        System.out.println("Choose a bank:\n1) AllyBank\n2) ChaseBank\n3) CapitalBank");
        int choice2 = scanner.nextInt();
        scanner.nextLine();

        switch(choice2){
            case 1:
                new Ally(name, pin, cardinfo).fname();
                break;
            case 2:
                new Chase(name, pin, cardinfo).fname();
                break;
            case 3:
                new Capital(name, pin, cardinfo).fname();
                break;
            default:
                System.out.println("Insert a valid value.");
                handleTransfer(name, pin, cardinfo, money);
        }
    }
}
