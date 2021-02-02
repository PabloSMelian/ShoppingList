package view;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListAppDisplay implements Display{
    private List<String> output;
    @Override
    public void display() {
        output = new ArrayList<>();
        output.forEach(System.out::println);
    }

    @Override
    public void addOutput(List<String> names) {
        this.output.addAll(names);
    }
}
