package demo.service;
import demo.model.Product;
import demo.dao.ProductDAO;
public class ProductService {
	Product obj1=new Product();
	ProductDAO obj2=new ProductDAO();
	
	public void setProduct(Product product) {
		/*obj1.setProductId(1);
		obj1.setProductName("PC");
		obj1.setProductPrice(123.00f);*/
		obj2.setProduct(product);
	}
	public Product[] getProducts() {
		ProductDAO productDAO;
		return obj2.getProduct();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
