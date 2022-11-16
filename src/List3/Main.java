package List3;

import List3.operations.AddOperation;
import List3.operations.EditOperation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        App menu = new App(Arrays.asList(
                new AddOperation(),
                new EditOperation())
        );
        menu.start();
    }
}
