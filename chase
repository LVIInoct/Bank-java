import java.util.Scanner;

public class Chase implements bankint{
    private String storedName;
    private String email;
    private int pin, cardinf;
    public int money = 5000;
    String person;
    int amount;
    Scanner scanner = new Scanner(System.in);
    public Chase(String name, int pin, int cardinf) {
        this.storedName = name;
        this.pin = pin;
        this.cardinf = cardinf;
        this.email = storedName + "@gmail.com";
    }
    @Override
    public void fname(){
        while(true){
            System.out.println("Insert your full name: ");
            String temporaryName = scanner.nextLine();

            if (temporaryName.equals(storedName)) {
                cardinf();
                break;
            } else {
                System.out.println("Name does not match. Access denied.");
                continue;
            }
        }
    }
    @Override
    public void cardinf(){
        while(true){
            System.out.println("Insert your card info: ");
            int temporaryCard = scanner.nextInt();
            scanner.nextLine();
            if (temporaryCard == cardinf) {
                System.out.println("Verifying...");
                pin();
                break;
                }
            else {
                System.out.println("Card info does not match. Access denied.");
                continue;
            }
        }
    }
    @Override
    public void pin(){
        while(true){
        System.out.println("Insert your security PIN: ");
        int temporaryPin = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Debug: After PIN input");
            if (temporaryPin == pin) {
                System.out.println("Verifying...");
                email();
                break;
            } else {
                System.out.println("PIN does not match. Access denied.");
                continue;
            }
        }
    }
    public void email(){
        while(true){
            System.out.println("Insert your e-mail: ");
            String EM = scanner.nextLine().trim();
            if(EM.equals(email.trim())) {
                System.out.println("Verifying...");
                subtr();
                break;
            }
            else{
                System.out.println("E-mail does not match. Access denied.");
                continue;
            }
        }
    }

    @Override
    public void subtr() {
        boolean valid = false;
        while(!valid) {
            System.out.println("Insert the user of the person you want to transfer your money to: ");
            String person = scanner.nextLine();
            System.out.println("Confirm the user: " + person);
            System.out.println("Is this correct? (yes/no)");
            String choice = scanner.nextLine();
    
            if(choice.equalsIgnoreCase("yes")) {
                System.out.println("Insert amount of money:");
                amount = scanner.nextInt();
                scanner.nextLine();
                if(amount > money) {
                    System.out.println("You cannot give more than the current amount you have. Try again.");
                    continue;
                } else {
                    valid = true;
                    System.out.println("Loading... [###_______]30%");
                    System.out.println("Loading... [#######___]70%");
                    System.out.println("Loading... [##########_]90%");
                    System.out.println("Sent!");

                    money-=amount;
                    showinf show = new showinf();
                    String email = storedName + "@gmail.com";
                    show.printWelcome(storedName, email, pin, cardinf, money);
                }
            } else if(choice.equalsIgnoreCase("no")) {
                System.out.println("Restarting...");
                continue;
            }
        }
    }
}
