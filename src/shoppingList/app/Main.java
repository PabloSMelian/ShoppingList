package shoppingList.app;

import Mocks.user.UserMock;

public class Main {

    public static void main(String[] args) {
        new UserMock(new ShoppingListApp());
    }
}
