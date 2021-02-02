package shoppingList.app;

import model.ShoppingList;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
    private List<ShoppingList> ListOfShoppingList;

    public ShoppingListApp() {
        ListOfShoppingList = new ArrayList<>();
    }

    public List<ShoppingList> getListOfShoppingList() {
        return ListOfShoppingList;
    }

    public void setListOfShoppingList(List<ShoppingList> listOfShoppingList) {
        ListOfShoppingList = listOfShoppingList;
    }
}
