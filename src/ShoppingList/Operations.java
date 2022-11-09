package ShoppingList;

public enum Operations {
    ADD("add"), DELETE("delete"), EDIT("edit"), SHOW("show"), COST("cost");

    final String operation;

    Operations(String operation) {
        this.operation = operation;
    }

    public void showOperation() {
        Operations[] operations = Operations.values();
        for (Operations operations1 : operations) {
            System.out.println(operations1);
        }
    }

    public static Operations returnTypeByString(String value) {
        if (value == null) {
            return null;
        }
        for (Operations operations : values()) {
            if (value.equalsIgnoreCase(operations.operation)) {
                return operations;
            }
        }
        return null;
    }
}
