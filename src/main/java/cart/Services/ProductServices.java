package cart.Services;

import cart.Model.Basket;
import cart.Model.Product;

public class ProductServices {

	public static Product createProduct(int pid, String pname, double price, int qty)
	{
	return new Product(pid,pname,price,qty);
	}
	
	public static Basket createBasket() {
		return new Basket();
	}

	public void clearBasket(Basket b) {
		b.getItems().clear();
	}
	public void displayProducts(Basket b) {
		b.displayProducts();

	}public void calculate(Basket b) {
		b.calculate();

	}

}
