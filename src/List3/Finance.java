package List3;

import java.util.ArrayList;
import java.util.List;

public class Finance {
    List<Item> shoppingList = new ArrayList<>();

    public void add(String name,int price,Type type) {
        Item newItem = new Item(name,price,type);
        shoppingList.add(newItem);
    }

    public void print() {
        for (Item value : shoppingList) {
            System.out.println(value);
        }
    }

    public void edit(String value, String newName, int newPrice, Type newType) {
        Item newItem = new Item(newName, newPrice, newType);
        for (int i = 0; i < shoppingList.size(); i++) {
            if (shoppingList.get(i).getName().equals(value)) {
                shoppingList.set(i, newItem);
            }
        }
    }

    public void delete(String value) {
        for (int i = 0; i < shoppingList.size(); i++) {
            if (shoppingList.get(i).getName().equals(value)) {
                shoppingList.remove(i);

            }
        }
    }

    public int totalCost() {
        int cost = 0;
        for (Item value : shoppingList) {
            cost += value.getPrice();
        }
        return cost;
    }
}
