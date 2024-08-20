import java.util.Scanner;

class Pizza {
    private static int price;
    private Boolean veg;
    private int cheesePrice = 100;
    private int toppingPrice = 150;
    private int deliverycharge = 40;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg)
            price = 300;
        else
            price = 450;
    }

    public void addExtraCheese() {
        System.out.println("Extra cheese added");
        price += cheesePrice;

    }

    public void addExtraToppings() {
        System.out.println("Extra topping added");
        price += toppingPrice;
    }

    public void takeAway() {
        System.out.println("Takeaway order received");
        price += deliverycharge;
    }

    public void getBill() {
        System.out.println("your total bill: "+price);
    }

}

public class pizzabill {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want veg or non veg: ");
        String type = sc.nextLine();
        Pizza base;
        if(type.equals("veg"))
        {
            base = new Pizza(true);
        }
        else
        {
            base = new Pizza(false);
        }
        System.out.print("Do you want to add extra cheese y/n: ");
        String extracheese = sc.next();
        if(extracheese.equals("y"))
        {
            base.addExtraCheese();
        }
        System.out.print("Do you want to add extra topping y/n: ");
        String extratopping = sc.next();
        if(extratopping.equals("y"))
        {
            base.addExtraToppings();
        }
        System.out.print("Do you want to takeaway y/n: ");
        String takeaway = sc.next();
        if(takeaway.equals("y"))
        {
            base.takeAway();
        }
        sc.close();
        base.getBill();
    }
}