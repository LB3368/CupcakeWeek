import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Order {
    public ArrayList<Cupcake> cupcakeMenu;
    public ArrayList<Drink> drinkMenu;

    public ArrayList<Cupcake> cupcakeOrder;
    public ArrayList<Drink> drinkOrder;
    public ArrayList<Object> order;

    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        this.cupcakeMenu = cupcakeMenu;
        this.drinkMenu = drinkMenu;
        this.cupcakeOrder = new ArrayList<>();
        this.drinkOrder = new ArrayList<>();
        this.order = new ArrayList<>();

        startOrder();
    }

    public void startOrder() {
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");
        Scanner input = new Scanner(System.in);
        String placeOrder = input.nextLine();

        // Create an Arraylist named order to contain Objects
        //ArrayList<Object> order = new ArrayList<>();

        //Create an if statement that checks if placeOrder equals Y
        if (placeOrder.equalsIgnoreCase("Y")) {
            //Add localTime.now() & localDate.now() to place the order
            order.add(LocalTime.now());
            order.add(LocalDate.now());
            //Print
            System.out.println("Here is the menu");
            System.out.println("CUPCAKES:");

            //Create an int variable named itemNumber and set it equal to 0
            int itemNumber = 0;

            //Create a for loop that iterates through each index of cupcakeMenu
            for (int i = 0; i < cupcakeMenu.size(); i++) {
                itemNumber++;

                System.out.println(itemNumber + ". ");

                //Output the type of cupcake at cupcakeMenu index i
                cupcakeMenu.get(i).type();
                System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());

                //Print a new line
                System.out.println();
            }

            System.out.println("DRINKS:");

            //Create a for loop that iterates through each index of drinkMenu
            for (int i = 0; i < drinkMenu.size(); i++) {
                //increment itemNumber by 1
                itemNumber++;
                System.out.println(itemNumber + ".");

                //Print a description of the drink at drinkMenu at index i
                drinkMenu.get(i).type();
                System.out.println("Price: $" + drinkMenu.get(i).getPrice());

                System.out.println();
            }
            //Create a boolean named ordering and set it equal to true
            boolean ordering = true;

            // Create a while loop that continues as long as ordering equals true
            while (ordering) {
                System.out.println("What would you like to order? Please use the number associated with each item to order");
                //Create the int named orderChoice and set equal to what the user inputs
                int orderChoice = input.nextInt();

                //Correct the terminal scanner input location
                input.nextLine();

                //Create an if statement that checks if orderChoice equals 1
                if (orderChoice == 1) {
                    order.add(cupcakeMenu.get(0));
                    System.out.println("Item added to order");
                }
                //Create else if statement checking if orderChoice equals 2
                else if (orderChoice == 2) {
                    order.add(cupcakeMenu.get(1));
                    System.out.println("Item added to order");
                }
                //Create else if statement checking if orderChoice equals 3
                else if (orderChoice == 3) {
                    order.add(cupcakeMenu.get(2));
                    System.out.println("Item added to order");
                }
                // Create an else if statement that checks if orderChoice equals 4
                else if (orderChoice == 4) {
                    // Add the first item from the drinkMenu array to the order array
                    order.add(drinkMenu.get(0));

                    System.out.println("Item added to order");
                }
                // Create an else if statement that checks if orderChoice equals 5
                else if (orderChoice == 5) {
                    // Add the second item from the drinkMenu array to the order array
                    order.add(drinkMenu.get(1));

                    System.out.println("Item added to order");
                }
                // Create an else if statement that checks if orderChoice equals 6
                else if (orderChoice == 6) {
                    // Add the third item from the drinkMenu array to the order array
                    order.add(drinkMenu.get(2));

                    System.out.println("Item added to order");
                }
                // Create an else statement with no parameters
                else {
                    System.out.println("Sorry, we don't seem to have that on the menu");
                }

                //Print "Would you like to continue ordering? (Y/N)"
                System.out.println("Would you like to continue ordering? (Y/N)");

                //Create a String object named continueOrder and set it equal to the user input
                String continueOrder = input.nextLine();

                //Create an if statement that checks if continueOrder does NOT equal Y ignoring capitalization
                if (!continueOrder.equalsIgnoreCase("Y")) {
                    // Set ordering equal to false
                    ordering = false;
                }
            }
            //Print the first item in the order ArrayList
            System.out.println(order.get(0));
            System.out.println(order.get(1));

            //Create a double variable named subtotal and set it to 0.0
            Double subTotal = 0.0;

            // Create a for loop that starts at i = 2 and continues incrementing by 1, while i is less than order.size
            for (int i = 2; i < order.size(); i++) {
                // Check if order at i is equal to cupcakeMenu at 0
                if (order.get(i).equals(cupcakeMenu.get(0))) {
                    // Print the type of cupcake at cupcakeMenu index 0
                    cupcakeMenu.get(0).type();

                    // Print the price of cupcake at cupcakeMenu index 0
                    System.out.println(cupcakeMenu.get(0).getPrice());

                    //Set subtotal equal to subtotal plus cupcakeMenu getPrice at 0
                    subTotal = subTotal + cupcakeMenu.get(0).getPrice();
                }
                // Check if order at i is equal to cupcakeMenu at 1
                else if (order.get(i).equals(cupcakeMenu.get(1))) {
                    // Print the type of cupcake at cupcakeMenu index 0
                    cupcakeMenu.get(1).type();

                    // Print the price of cupcake at cupcakeMenu index 0
                    System.out.println(cupcakeMenu.get(1).getPrice());

                    //Set subtotal equal to subtotal plus cupcakeMenu getPrice at 0
                    subTotal = subTotal + cupcakeMenu.get(1).getPrice();
                }
                //check if order at i is equal to cupcakeMenu at 2
                else if (order.get(i).equals(cupcakeMenu.get(2))) {
                    // Print the type of cupcake at cupcakeMenu index 0
                    cupcakeMenu.get(2).type();

                    // Print the price of cupcake at cupcakeMenu index 0
                    System.out.println(cupcakeMenu.get(2).getPrice());

                    //Set subtotal equal to subtotal plus cupcakeMenu getPrice at 0
                    subTotal = subTotal + cupcakeMenu.get(2).getPrice();
                }
                // Check if order at i is equal to drinkMenu at 0
                else if (order.get(i).equals(drinkMenu.get(0))) {
                    // Print the type of drink at drinkMenu index 0
                    drinkMenu.get(0).type();

                    // Print the price of drink at drinkMenu index 0
                    System.out.println(drinkMenu.get(0).getPrice());

                    //Set subtotal equal to subtotal plus drinkMenu getPrice at 0
                    subTotal = subTotal + drinkMenu.get(0).getPrice();
                }
                // Check if order at i is equal to drinkMenu at 1
                else if (order.get(i).equals(drinkMenu.get(1))) {
                    // Print the type of drink at drinkMenu index 1
                    drinkMenu.get(1).type();

                    // Print the price of drink at drinkMenu index 0
                    System.out.println(drinkMenu.get(1).getPrice());

                    //Set subtotal equal to subtotal plus drinkMenu getPrice at 0
                    subTotal = subTotal + drinkMenu.get(1).getPrice();
                }
                // Check if order at i is equal to drinkMenu at 2
                else if (order.get(i).equals(drinkMenu.get(2))) {
                    // Print the type of drink at drinkMenu index 2
                    drinkMenu.get(2).type();

                    // Print the price of drink at drinkMenu index 2
                    System.out.println(drinkMenu.get(2).getPrice());

                    //Set subtotal equal to subtotal plus drinkMenu getPrice at 2
                    subTotal = subTotal + drinkMenu.get(2).getPrice();
                }
            }
            // Print subtotal
            System.out.println("$" + subTotal + "\n");

            //Create a new CreateFile()
            new CreateFile();

            //Create a new WriteToFile() with parameter order
            new WriteToFile(order);
        } else {
            System.out.println("Have a nice day!");
        }
    }
    public ArrayList<Object> getOrder() {
        return order;
    }

    public void addCupcakeToOrder(Cupcake cupcake) {
        cupcakeMenu.add(cupcake);
    }
    public void addDrinkToOrder(Drink drink) {
        drinkMenu.add(drink);
    }

    public double getOrderTotal() {
        double total = 0.0;
        for (Cupcake cupcake : cupcakeMenu) {
            total += cupcake.getPrice();
        }
        for (Drink drink : drinkMenu) {
            total += drink.getPrice();
        }
        return total;
    }

    public void printOrder() {
        System.out.println("Order:");
        for (Cupcake cupcake : cupcakeMenu) {
            System.out.println("* " + cupcake);
        }
        for (Drink drink : drinkMenu) {
            System.out.println("* " + drink);
        }
        System.out.println("Total: $" + getOrderTotal());
    }
}

//Creating a file called CreateFile (will write the receipt in this file)
class CreateFile {
    // Create constructor function
    public CreateFile() {
        // try catch block with a parameter of IOException e
        try {
            File salesData = new File("salesData.txt");
            //Creating an if statement .createNewFile() will return true if a new file is created
            if (salesData.createNewFile()) {
                System.out.println("File created: " + salesData.getName());
            }
            else {
                System.out.println("File already exists");
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
}

//Creating a class name WriteToFile
class WriteToFile {
    public WriteToFile(ArrayList<Object> order) {
        try {
            //Creating a new filewriter object named fw and setting it equal to new FileWriter
            FileWriter fw = new FileWriter("salesData.txt", true);
            //Create a new PrintWriter object
            PrintWriter salesWriter = new PrintWriter(fw);

            //Print each value in order
            for (int i = 0; i < order.size(); i++) {
                salesWriter.println(order.get(i));
            }
            //stop the writer from continuing to run
            salesWriter.close();
            System.out.println("Successfully wrote to the file");
        }
        catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
}