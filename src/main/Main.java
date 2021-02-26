package main;

public class Main {
    public static void main(String[] args) {
       Customer jane = new Customer("Jane", 45.25);
       Customer bob = new Customer("Bob", 33.14);

       VendingMachine food = new VendingMachine("Food");
       VendingMachine drink = new VendingMachine("Drink");
       VendingMachine office = new VendingMachine("Office");

       Snack chips = new Snack("Chips", 36, 1.75, food.getId());
       Snack chocolate = new Snack("Chocolate Bar", 36, 1, food.getId());
       Snack pretzel = new Snack("Pretzel", 30, 2, food.getId());

       Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
       Snack water = new Snack("Water", 20, 2.75, drink.getId());

       completeTransaction(jane, soda, 3);
       completeTransaction(jane, pretzel, 1);
       completeTransaction(bob, soda, 2);

       jane.addCash(10);
       System.out.println("Jane cash on hand " + jane.getCash());
       System.out.println();

       completeTransaction(jane, chocolate, 1);

       pretzel.addQuantity(12);
       System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());
       System.out.println();

       completeTransaction(bob, pretzel, 3);
    }

   static void completeTransaction(Customer customer, Snack snack, int quantity) {
      snack.buySnack(quantity);
      customer.buySnacks(snack.getTotalCost(quantity));
      System.out.println(customer.getName() + " cash on hand " + customer.getCash());
      System.out.println("Quantity of " + snack.getName() + " is " + snack.getQuantity());
      System.out.println();
   }
}
