import services.Cart;
import services.Order;
import models.BookProduct;
import models.ClothingProduct;
import models.ElectronicProduct;

public class App {
    public static void main(String[] args) throws Exception {
        Cart cart=new Order(5,5);
        cart.addProduct(new ElectronicProduct("Printer",755.0,"1524",8.0));
        cart.addProduct(new ClothingProduct("Pants",39.99,"7568","Large"));
        cart.addProduct(new BookProduct("Java",55.99,"10568","demo"));
        System.out.println("product list :");
        cart.displayProducts();
    }
}
