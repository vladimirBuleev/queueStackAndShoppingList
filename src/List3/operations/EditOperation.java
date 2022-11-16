package List3.operations;

import List3.Type;

import java.util.Scanner;

public class EditOperation extends Operation {

    private Scanner scan = new Scanner(System.in);

    @Override
    void doOperation() {
        System.out.println("Введите название позиции которую хотите исправить,затем название покупки, стоимость и тип");
        String answer0 = scan.nextLine();
        String answer1 = scan.nextLine();
        int answer2 = scan.nextInt();
        Type answer3 = Type.returnTypeByString(scan.next());
        if (answer3 == null) {
            System.out.println("wrong type");
        } else {
            getShoppingList().edit(answer0, answer1, answer2, answer3);
        }
    }

    @Override
    String getName() {
        return "Обновить";
    }
}
