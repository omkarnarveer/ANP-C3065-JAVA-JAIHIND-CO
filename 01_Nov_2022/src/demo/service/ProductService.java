package demo.service;

import demo.model.Product;
import demo.dao.ProductDAO;

public class ProductService {
	ProductDAO productDAO;
	public ProductService() {
		productDAO=new ProductDAO();
	}
	
	public void setProduct(Product product) {
		productDAO.setProduct(product);
	}
	public Product[] getProducts() {
	Product productArr[]=productDAO.getProducts();
	return productArr;	
	//return productDAO.getProducts();
	}

}
