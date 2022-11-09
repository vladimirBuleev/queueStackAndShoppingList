package ShoppingList;

public enum Type {
    FOOD("food"), CLOTHES("clothes"), OTHER("other");
    final String type;

    Type(String type) {
        this.type = type;
    }

    public void showTypes() {
        Type[] types = Type.values();
        for (Type type1 : types) {
            System.out.println(type1);
        }
    }

    public static Type returnTypeByString(String value) {
        if (value == null) {
            return null;
        }
        for (Type types : values()) {
            if (value.equalsIgnoreCase(types.type)) {
                return types;
            }
        }
        return null;
    }
}
