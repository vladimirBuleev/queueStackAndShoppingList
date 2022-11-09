package ShoppingList;

public class ShoppingList<T> {
    private Product first;

    public void add(String name, int price, Type type) {
        Product newProduct = new Product(name, price, type);
        if (first == null) {
            first = newProduct;
        } else {
            Product currentProduct = first;
            while (currentProduct.getNext() != null) {
                currentProduct = currentProduct.getNext();
            }
            currentProduct.setNext(newProduct);
        }
    }

    public void print() {
        Product currentProduct = first;
        while (currentProduct != null) {
            System.out.print(currentProduct.getName() + " " + currentProduct.getPrice() + " " + currentProduct.getType());
            System.out.println();
            currentProduct = currentProduct.getNext();
        }
    }

    public void delete(String productName) {
        Product currentProduct = first;
        if (first.getName() == productName) {
            first = first.getNext();
        } else {
            while (currentProduct.getNext() != null) {
                Product nextProduct = currentProduct.getNext();
                if (nextProduct.getName() == productName) {
                    currentProduct.setNext(nextProduct.getNext());
                    break;
                }
                currentProduct = currentProduct.getNext();

            }
        }
    }

    public void editProduct(String productName, String name, int price, Type type) {
        Product currentProduct = first;
        if (first.getName() == productName) {
            first.setName(name);
            first.setPrice(price);
            first.setType(type);
        } else {
            while (currentProduct.getNext() != null) {
                Product nextProduct = currentProduct.getNext();
                if (nextProduct.getName() == productName) {
                    nextProduct.setName(name);
                    nextProduct.setPrice(price);
                    nextProduct.setType(type);
                    break;
                }
                currentProduct = currentProduct.getNext();
            }
        }

    }public int totalCost(){
        Product currentProduct = first;
        int value=0;
        while(currentProduct!=null){
            value+=currentProduct.getPrice();
            currentProduct=currentProduct.getNext();
        }return value;
    }
}

