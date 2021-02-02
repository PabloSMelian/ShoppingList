package control;

import model.Product;
import model.ShoppingList;
import shoppingList.app.ShoppingListApp;
import view.Display;
import view.ShoppingListAppDisplay;
import view.ShoppingListDisplay;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingListController {

    private Display display;
    private final ShoppingListApp shoppingListApp;

    public ShoppingListController(ShoppingListApp shoppingListApp) {
        this.shoppingListApp = shoppingListApp;
    }


    public void setDisplay(Display display) { this.display = display; }

    public void addProductToShoppingList(ShoppingList shoppingList, String productName, String productCategory){
       if (productCategory == null || productName == null) return;
       shoppingList.getProductList().add(new Product(productName,productCategory));
   }

   public void removeProductFromShoppingList(ShoppingList shoppingList, String productName, String productCategory){
        shoppingList.setProductList(shoppingList.getProductList().stream().filter(product -> !product.getName().equals(productName) &&
                !product.getCategory().equals(productCategory)).collect(Collectors.toList()));
   }

   public void orderByName(ShoppingList shoppingList){
        shoppingList.getProductList().stream().sorted(Comparator.comparing(Product::getName));
   }
   public void orderByCategory(ShoppingList shoppingList){
       shoppingList.getProductList().stream().sorted(Comparator.comparing(Product::getName));
   }
   public void createShoppingList(String name){
        shoppingListApp.getListOfShoppingList().add(new ShoppingList(name));
   }

   public void removeShoppingList(String name){
       shoppingListApp.setListOfShoppingList((List<ShoppingList>) shoppingListApp.getListOfShoppingList().stream()
               .filter(shoppingList -> !shoppingList.getName().equals(name)));
   }
   public void showShoppingList(ShoppingList shoppingList){
       if (display.getClass().equals(ShoppingListDisplay.class)){
           ((ShoppingListDisplay)display).addOutput(getShoppingListToShow(shoppingList.getProductList()));
       }
   }
   public List<String> getShoppingListToShow(List<Product> products){
        return products.stream()
                .map(product -> product.getName()).collect(Collectors.toList());
   }

    public void showAllShoppingLists(){
        if (display.getClass().equals(ShoppingListAppDisplay.class)){
            ((ShoppingListAppDisplay)display).addOutput(getAllShoppingListsToShow(shoppingListApp.getListOfShoppingList()));
        }
    }
    public List<String> getAllShoppingListsToShow(List<ShoppingList> shoppingLists){
        return shoppingLists.stream()
                .map(shoppingList -> shoppingList.getName()).collect(Collectors.toList());
    }
}
