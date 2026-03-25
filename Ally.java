import java.util.Scanner;

class Ally implements bankint {
   private String storedName;
   private int pin;
   private int cardinf;
   public int money = 5000;
   String person;
   int amount;
   Scanner scanner;

   public Ally(String var1, int var2, int var3) {
      this.scanner = new Scanner(System.in);
      this.storedName = var1;
      this.pin = var2;
      this.cardinf = var3;
   }

   public void fname() {
      while(true) {
         System.out.println("Insert your full name: ");
         String var1 = this.scanner.nextLine();
         if (var1.equals(this.storedName)) {
            this.cardinf();
            return;
         }

         System.out.println("Name does not match. Access denied.");
      }
   }

   public void cardinf() {
      while(true) {
         System.out.println("Insert your card info: ");
         int var1 = this.scanner.nextInt();
         this.scanner.nextLine();
         if (var1 == this.cardinf) {
            System.out.println("Verifying...");
            this.pin();
            return;
         }

         System.out.println("Card info does not match. Access denied.");
      }
   }

   public void pin() {
      while(true) {
         System.out.println("Insert your security PIN: ");
         int var1 = this.scanner.nextInt();
         this.scanner.nextLine();
         System.out.println("Debug: After PIN input");
         if (var1 == this.pin) {
            System.out.println("Verifying...");
            this.subtr();
            return;
         }

         System.out.println("PIN does not match. Access denied.");
      }
   }

   public void subtr() {
      boolean var1 = false;

      while(!var1) {
         System.out.println("Insert the user of the person you want to transfer your money to: ");
         String var2 = this.scanner.nextLine();
         System.out.println("Confirm the user: " + var2);
         System.out.println("Is this correct? (yes/no)");
         String var3 = this.scanner.nextLine();
         if (var3.equalsIgnoreCase("yes")) {
            System.out.println("Insert amount of money:");
            this.amount = this.scanner.nextInt();
            this.scanner.nextLine();
            if (this.amount > this.money) {
               System.out.println("You cannot give more than the current amount you have. Try again.");
            } else {
               var1 = true;
               System.out.println("Loading... [###_______]30%");
               System.out.println("Loading... [#######___]70%");
               System.out.println("Loading... [##########_]90%");
               System.out.println("Sent!");
               this.money -= this.amount;
               showinf var4 = new showinf();
               String var5 = this.storedName + "@gmail.com";
               var4.printinf(this.storedName, var5, this.pin, this.cardinf, this.money);
            }
         } else {
            System.out.println("Restarting...");
         }
      }

   }
}
