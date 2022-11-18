package List3.operations;

import java.util.Scanner;

public class DeleteOperation extends Operation {

    private Scanner scan = new Scanner(System.in);

    @Override
    void doOperation() {
        System.out.println("Введите название покупки");
        getShoppingList().delete(scan.nextLine());
    }

    @Override
    String getName() {
        return "Удалить";
    }
}
