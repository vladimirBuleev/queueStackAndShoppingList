package List3;

import java.util.Scanner;

public class UserMenu {
    Finance shoppingList = new Finance();
    Scanner scan = new Scanner(System.in);

    public void getUserMenu() {

        String answer = " ";
        while (!answer.equalsIgnoreCase("exit")) {
            System.out.println("Это финансовый учет введите нужную вам операцию");
            Operations.ADD.showOperation();
            answer = scan.nextLine();
            menu(answer);
        }
    }

    private void add() {
        System.out.println("Введите название покупки,затем стоимость, затем тип");
        Type.FOOD.showTypes();
        String answer1 = scan.nextLine();
        int answer2 = scan.nextInt();
        Type answer3 = Type.returnTypeByString(scan.next());
        if (answer3 == null) {
            System.out.println("wrong type");
        } else {
            shoppingList.add(answer1, answer2, answer3);
        }
    }

    private void edit() {
        System.out.println("Введите название позиции которую хотите исправить,затем название покупки, стоимость и тип");
        String answer0 = scan.nextLine();
        String answer1 = scan.nextLine();
        int answer2 = scan.nextInt();
        Type answer3 = Type.returnTypeByString(scan.next());
        if (answer3 == null) {
            System.out.println("wrong type");
        } else {
            shoppingList.edit(answer0, answer1, answer2, answer3);
        }
    }

    private void menu(String answer) {
        if (answer.equalsIgnoreCase(Operations.ADD.operation)) {
            add();
            scan.nextLine();

        } else if (answer.equalsIgnoreCase(Operations.SHOW.operation)) {
            shoppingList.print();

        } else if (answer.equalsIgnoreCase(Operations.DELETE.operation)) {
            System.out.println("Введите название покупки");
            shoppingList.delete(scan.nextLine());

        } else if (answer.equalsIgnoreCase(Operations.EDIT.operation)) {
            edit();
            scan.nextLine();
        } else if (answer.equalsIgnoreCase(Operations.COST.operation)) {
            System.out.println("Общая сумма покупок- " + shoppingList.totalCost());
        } else if (answer.equalsIgnoreCase("exit")) {
            System.out.println("до свидания");
        } else {
            System.out.println("wrong answer");
        }
    }
}
