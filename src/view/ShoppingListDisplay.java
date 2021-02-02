package view;

import model.ShoppingList;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListDisplay implements Display{
    private List<String> output;
    @Override
    public void display() {

        output.forEach(System.out::println);
        output = new ArrayList<>();
    }

    @Override
    public void addOutput(List<String> messages) {
        this.output.addAll(messages);
    }
}
