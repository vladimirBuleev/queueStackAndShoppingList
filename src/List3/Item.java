package List3;

public class Item {
    private String name;
    private int price;
    private Type type;

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int price, Type type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", types=" + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        return name != null ? name.equals(item.name) : item.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
