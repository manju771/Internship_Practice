//Shopping Cart: Create a class called ShoppingCart that stores a collection of items in a ArrayList. The class should have methods to add, remove, and display items in the cart, as well as to calculate the total cost of the items in the cart.

import java.util.ArrayList;

 class main Shopping(){
  ArrayList<Item>list=new ArrayList<>();

    public class ShoppingCart(){
        this.list=new ArrayList<>();
    }

    public void addItem(Item item){
        list.add(item);
    }

    public void removeItem(Item item){
        list.remove(item);
    }

    public void displayCart(){
        System.out.println("Shopping Cart:");
        for (Item item:list) {
            System.out.println("- " + item.getName() + " (" + item.getPrice() + ")");
        }
    }

    public double calculateTotal(){
        double total=0;
        for (Item item:list) {
            total+=item.getPrice();
        }
        return total;
    }
}

