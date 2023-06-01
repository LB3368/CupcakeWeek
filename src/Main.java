import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        //Create a new ArrayList that contains the Cupcake objects
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        // Create new Cupcake object named cupcake
        Cupcake cupcake = new Cupcake();

        //Set the price of the cupcake
        cupcake.setPrice(2.50);

        //Add cupcake to menu
        cupcakeMenu.add(cupcake);

        // Create a RedVelvet object
        RedVelvet redVelvet = new RedVelvet();
        redVelvet.setPrice(3.00);
        cupcakeMenu.add(redVelvet);

        //Create a new Chocolate object
        Chocolate chocolate = new Chocolate();
        chocolate.setPrice(2.75);
        cupcakeMenu.add(chocolate);

        //Print message
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on" + "\nthe menu but we need to decide on pricing.");

        // Create the scanner object to accept user input
        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");
        cupcake.type();

        System.out.println("How much would you like to charge for the cupcake?" + "\n(Input a numerical integer taken to 2 decimal places)");

        //Create a string name priceText
        String priceText = input.nextLine();

        //Create a double named price and set it equal to Double.
        double price = Double.parseDouble(priceText);

        //Call the setPrice() method
        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description: ");
        redVelvet.type();

        System.out.println("How much would you like to charge for the cupcake?" + "\n(Input a numerical integer taken to 2 decimal places)");

        //Set string name priceText equal to input.nextLine()
        priceText = input.nextLine();

        //set double variable name price equal to Double.parseDouble(priceText)
        price = Double.parseDouble(priceText);

        //call the setPrice() method
        redVelvet.setPrice(price);

        System.out.println("We are deciding the price for our chocolate cupcake. Here is the description: ");
        chocolate.type();

        System.out.println("How much would you like to charge for the cupcake?" + "\n(Input a numerical integer taken to 2 decimal places)");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        chocolate.setPrice(price);

        //Create a new ArrayList that contains the Drink objects and name it 'drinkMenu'
        ArrayList<Drink> drinkMenu = new ArrayList<>();

        //Create a new Drink object name water
        Drink water = new Drink();

        // Create new Soda object name soda
        Soda soda = new Soda();

        //Create new Milk object name milk
        Milk milk = new Milk();

        //Print "We are in the middle of creating the drink menu. We currently have only three types of drinks on the menu but we need to decide on pricing"
        System.out.println("We are in the middle of creating the drink menu. We currently have only three types of drinks on" +  "\nthe menu but we need to decide on pricing");

        // Print message
        System.out.println("We are deciding on the price for our bottled water. Here is the description:");
        // Call the type( ) method on water object
        water.type();

        // Print message calling for integer with 2 decimal places
        System.out.println("How much would you like to charge for the water bottle?" + "\n(Input a numerical number taken to 2 decimal places)");

        // Set the String variable named priceText equal to input.nextLine()
        // We are accepting the price as a String named priceText so we can convert it into a double later, just for practice
        priceText = input.nextLine();

        // Set double variable name price equal to Double.parseDouble(priceText)
        price= Double.parseDouble(priceText);

        //call the setPrice() method
        water.setPrice(price);

        System.out.println("We are deciding on the price for our bottle of soda. Here is the description: ");
        soda.type();

        System.out.println("How much would you like to charge for the bottled soda?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        soda.setPrice(price);

        System.out.println("We are deciding on the price for our bottle of milk. Here is the description: ");
        milk.type();

        System.out.println("How much would you like to charge for the bottled milk?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);

        //Add new objects to drinkMenu
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        //Print the drink menu
        System.out.println("Drink Menu:");
        for (Drink drink : drinkMenu) {
            System.out.println(drink.type());
        }
    }
}

//Create a Cupcake class
class Cupcake {
    //create public double variable name price
    public double price;

    // Create public function name getPrice
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Create public function name type
    public String type() {
        return "A basic, generic cupcake, with vanilla frosting";
    }
}

// Create a class name RedVelvet that extends from Cupcake
class RedVelvet extends Cupcake {
    //create public function name type
    public String type() {
        return "A red velvet based cupcake, with cream cheese frosting.";
    }
}

//Create a class name Chocolate that extends from Cupcake
class Chocolate extends Cupcake {
    public String type() {
        return "A chocolate based cupcake, with chocolate frosting.";
    }
}

// Create the Drink class
// Create a new class named Drink. This will be the class all other drinks inherit from
class Drink
{
    // Create a public double variable named price, but do not assign it a value
    public double price;

    // Create a public function named getPrice that has no parameters and returns the price
    public double getPrice() {
        return price;
    }

    // Create a public function named setPrice that has one parameter, a double named price, and returns void
    public void setPrice(double price) {
        this.price = price;
    }

    // Create a public function named type that prints a description and returns void
    public String type() {
        return "A bottle of water";
    }
    public String type(String type) {
        return "Drink:" + type + ", $" + price;
    }
}

//Create a new class Soda that extends from Drink
class Soda extends Drink {
    // Create the public function named 'type' that prints description and returns void
    public String type() {
        return "A bottle of soda";
    }
}

//Create class Milk that extends from Drink
class Milk extends Drink {
    public String type() {
        return "A bottle of milk";
    }
}