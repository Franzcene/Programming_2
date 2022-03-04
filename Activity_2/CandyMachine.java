import java.util.Scanner;

public class CandyMachine {

    public void displayChoices(){
        System.out.println("Look what we've got!:");
        System.out.println();
        System.out.println("     Candies:");
        System.out.println("1  Ferrero Rocher 10");
        System.out.println("2  Toblerone      20");
        System.out.println("3  Dairy Milk     20");
        System.out.println("4  Pepero         20");
        
        System.out.println("     Chips:");
        System.out.println("5  Snickers       5");
        System.out.println("6  Banana Chips   5");
        System.out.println("7  Chips Delight  20");
        System.out.println("    Gum:");
        System.out.println("8  Bubble Gum     5");
        System.out.println("9  Gummies        5");
        System.out.println("    Cookies:");
        System.out.println("10 Mini Cookies   5");
        System.out.println("11 Butter Cookies 10");
        System.out.println();
    
}

    public void purchaseProducts(Scanner input) {
        String Candy = "";
        int choice;
        int cost = 0;
        int money;
        System.out.print("Which candy would you like to purchase?:");
        choice = input.nextInt();
        
        if(choice == 1) {
            Candy = "Ferrero Rocher";
        } else if (choice == 2) {
            Candy = "Toblerone";
        } else if (choice == 3) {
            Candy = "Dairy Milk";
        } else if (choice == 4) {
            Candy = "Pepero";
        } else if (choice == 5) {
            Candy = "Snickers";
        } else if (choice == 6) {
            Candy = "Banana Chips";
        } else if (choice == 7) {
            Candy = "Chips Delight";
        } else if (choice == 8) {
            Candy = "Bubble Gum";
        } else if (choice == 9) {
            Candy = "Gummies";
        } else if (choice == 10) {
            Candy = "Mini Cookies";
        } else if (choice == 11) {
            Candy = "Butter Cookies";
        }

        if(Candy.equals("Ferrero Rocher")) {
            cost = 10;
        } else if (Candy.equals("Toblerone")) {
            cost = 20;
        } else if (Candy.equals("Dairy Milk")) {
            cost = 20;
        } else if (Candy.equals("Pepero")) {
            cost = 20;
        } else if (Candy.equals("Snickers")) {
            cost = 5;
        } else if (Candy.equals("Banana Chips")) {
            cost = 5;
        } else if (Candy.equals("Chips Delight")) {
            cost = 20;
        } else if (Candy.equals("Bubble Gum")) {
            cost = 5;
        } else if (Candy.equals("Gummies")) {
            cost = 5;
        } else if (Candy.equals("Mini Cookies")) {
            cost = 5;
        } else if (Candy.equals("Butter Cookies")) {
            cost = 10;
        }
        System.out.println("You chose " + Candy);
        System.out.println("The price will be: " + cost);

        do {
            System.out.print("Enter money: ");
            money = input.nextInt();
            if(money < cost) {
                System.out.println("Your payment is not enough");
            } else if (money == cost) {
                System.out.println("Thank you for purchasing");
            }else if (money > cost) {
                System.out.println("Your change is " + (money - cost));
                System.out.println("Thank you for purchasing");
            }
        } while (money < cost);

    }

    public static void main (String[] args) {
        CandyMachine obj = new CandyMachine();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Candy Machine!");
        System.out.println("Makes life taste a little sweeter 🙂!");

        obj.displayChoices();
        obj.purchaseProducts(scan);

    }
}