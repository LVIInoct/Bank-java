import java.util.Scanner;
import java.util.Random;

class Capital implements bankint{
    private String storedName;
    private int pin, cardinf;
    public int money = 5000;
    String person;
    int amount;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int Vcard = 100000000 + random.nextInt(900000000);

    public Capital(String name, int pin, int cardinf) {
        this.storedName = name;
        this.pin = pin;
        this.cardinf = cardinf;
    }
    @Override
    public void fname(){
        while(true){
            System.out.println("Insert your full name: ");
            String temporaryName = scanner.nextLine();
            System.out.println("Checking user... ("+storedName+")");
            if (temporaryName.equals(storedName)) {
                System.out.println("Loading  card...");
                virtualcard();
                break;
            } else {
                System.out.println("Name does not match. Access denied.");
                continue;
            }
        }
    }

    //virtual card:
    public void virtualcard(){
            System.out.println("Do you want to generate a virtual card?");
            System.out.println("By doing so, you are efficiently privating your primary card.");
            String choice = scanner.nextLine();
            System.out.println("Debug: Choice entered: " + choice);
            if(choice.equalsIgnoreCase("yes")){
                System.out.println("This is your virtual card: "+Vcard);
            }
            else{
                System.out.println("Virtual card not generated.");
            }
            cardinf();
    }


    @Override
    public void cardinf(){
        while(true){
            System.out.println("Insert your primary or virtual card info: ");
            int temporaryCard = scanner.nextInt();
            scanner.nextLine();
            if (temporaryCard == cardinf || temporaryCard == Vcard) {
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
                subtr();
                break;
            } else {
                System.out.println("PIN does not match. Access denied.");
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
