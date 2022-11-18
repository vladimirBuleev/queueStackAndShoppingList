package List3.operations;

import List3.Finance;

public abstract class Operation {

    private Finance shoppingList;

    public Operation() {
        this.shoppingList = new Finance();
    }

    public Operation(Finance shoppingList) {
        this.shoppingList = shoppingList;
    }

    public Finance getShoppingList() {
        return shoppingList;
    }

    public abstract void doOperation();

   public abstract String getName();
}
