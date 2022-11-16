package List3.operations;

public class PrintOperation extends Operation {
    @Override
    void doOperation() {
        getShoppingList().print();
    }

    @Override
    String getName() {
        return "Показать все";
    }
}
