import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Order {
    public ArrayList<Cupcake> cupcakeMenu;
    public ArrayList<Drink> drinkMenu;

    public ArrayList<Cupcake> cupcakeOrder;
    public ArrayList<Drink> drinkOrder;

    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        this.cupcakeMenu = cupcakeMenu;
        this.drinkMenu = drinkMenu;
        this.cupcakeOrder = new ArrayList<>();
        this.drinkOrder = new ArrayList<>();
    }

    public void addCupcakeToOrder(Cupcake cupcake) {
        cupcakeMenu.add(cupcake);
    }
    public void addDrinkToOrder(Drink drink) {
        drinkMenu.add(drink);
    }

    public void displayOrder() {
        System.out.println("Cupcake Order:");
        for (Cupcake cupcake : cupcakeOrder) {
            System.out.println(" - " + cupcake.type());
        }

        System.out.println("\nDrink Order:");
        for (Drink drink : drinkOrder) {
            System.out.println(" - " + drink.type());
        }
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
