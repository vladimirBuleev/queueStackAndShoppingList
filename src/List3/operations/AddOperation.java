package List3.operations;

import List3.Type;

import java.util.Scanner;

public class AddOperation extends Operation {

    private Scanner scan = new Scanner(System.in);

    @Override
    public void doOperation() {
        System.out.println("Введите название покупки,затем стоимость, затем тип");
        Type.FOOD.showTypes();
        String answer1 = scan.nextLine();
        int answer2 = scan.nextInt();
        Type answer3 = Type.returnTypeByString(scan.next());
        if (answer3 == null) {
            System.out.println("wrong type");
        } else {
            getShoppingList().add(answer1, answer2, answer3);
        }
    }

    @Override
    String getName() {
        return "Добавить";
    }
}
