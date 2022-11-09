package ShoppingList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingList<Product>shoppingList=new ShoppingList<Product>();
        shoppingList.add("apple",10,Type.FOOD);
        shoppingList.add("book",200,Type.OTHER);
        shoppingList.add("hat",2000,Type.CLOTHES);
        shoppingList.add("jacket",100,Type.CLOTHES);
        shoppingList.add("guitar",2000,Type.OTHER);
        shoppingList.add("orange",20,Type.FOOD);
        shoppingList.print();
        System.out.println("///////////////////////////////");
        shoppingList.delete("orang");
        shoppingList.print();
        shoppingList.editProduct("orange","cage",1000,Type.OTHER);
        System.out.println("///////////////////////////////");
        shoppingList.print();
        System.out.println(shoppingList.totalCost());


    }
}
