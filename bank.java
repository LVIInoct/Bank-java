import java.util.Random;
import java.util.Scanner;
public class bank {
    public static void main(String[] args) {
        // all info
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int cardinfo = 100000000 + random.nextInt(900000000);
        int pin = 1000 + random.nextInt(9000);
        int money = 5000;

        // name
        while (true) {
            System.out.println("Insert your name to unlock VisaBank: ");
            String name = scanner.nextLine();
            String email = name + "@gmail.com";

            if (name.isBlank()) {
                System.out.println("Insert a name before proceeding.");
                continue;
            }
            else{
            showinf method1 = new showinf();
            method1.printinf(name, email, pin, cardinfo, money);
            break;
            }
            
        }
        scanner.close();
    }
}
