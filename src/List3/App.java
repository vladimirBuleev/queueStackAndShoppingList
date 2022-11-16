package List3;

import List3.operations.AddOperation;
import List3.operations.Operation;

import java.util.List;

public class App {

    private final List<Operation> operations;

    public App(List<Operation> operations) {
        this.operations = operations;
    }

    public void start() {
        print();
        // ввод
        // Factory получения операции
        new AddOperation().doOperation();
    }

    private void print() {
        for (Operation operation : operations) {
            System.out.println(operation.getName());
        }
    }
}
