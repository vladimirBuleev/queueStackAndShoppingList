package ShoppingList;

import java.util.Scanner;

public class UserMenu {

    public void getUserMenu() {
        ShoppingList<Product> shoppingList = new ShoppingList<Product>();

        Scanner scan = new Scanner(System.in);

        String answer = " ";
        while (!answer.equalsIgnoreCase("exit")) {
            System.out.println("Это финансовый учет введите нужную вам операцию");
            Operations.ADD.showOperation();
            answer = scan.next();
            if (answer.equalsIgnoreCase(Operations.ADD.operation)) {
                System.out.println("Введите название покупки,затем стоимость, затем тип");
                Type.FOOD.showTypes();
                shoppingList.add(scan.next(), scan.nextInt(), Type.returnTypeByString(scan.next()));

            } else if (answer.equalsIgnoreCase(Operations.SHOW.operation)) {
                shoppingList.print();

            } else if (answer.equalsIgnoreCase(Operations.DELETE.operation)) {
                System.out.println("Введите название покупки");
                shoppingList.delete(scan.next());

            } else if (answer.equalsIgnoreCase(Operations.EDIT.operation)) {
                System.out.println("Введите название позиции которую хотите исправить,затем название покупки, стоимость и тип");
                shoppingList.editProduct(scan.next(), scan.next(), scan.nextInt(), Type.returnTypeByString(scan.next()));

            } else if (answer.equalsIgnoreCase(Operations.COST.operation)) {
                System.out.println("Общая сумма покупок- " + shoppingList.totalCost());

            } else {
                System.out.println("wrong answer");

            }
        }
    }
}
