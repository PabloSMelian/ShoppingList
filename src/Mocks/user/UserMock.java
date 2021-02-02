package Mocks.user;

import control.ShoppingListController;
import shoppingList.app.ShoppingListApp;
import view.ShoppingListAppDisplay;
import view.ShoppingListDisplay;

public class UserMock {

    private final ShoppingListApp shoppingListApp;

    public UserMock(ShoppingListApp shoppingListApp){
        this.shoppingListApp = shoppingListApp;
        ShoppingListAppDisplay shoppingListAppDisplay = new ShoppingListAppDisplay();
        ShoppingListDisplay shoppingListDisplay = new ShoppingListDisplay();
        shoppingListAppDisplay.display();
        ShoppingListController shoppingListController = new ShoppingListController(shoppingListApp);
        shoppingListController.createShoppingList("libros");
        shoppingListController.setDisplay(shoppingListAppDisplay);
        shoppingListController.showAllShoppingLists();
        shoppingListAppDisplay.display();
    }
}
