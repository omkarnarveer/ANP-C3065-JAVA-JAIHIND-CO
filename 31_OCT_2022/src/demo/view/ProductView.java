package demo.view;
import demo.model.*;
import demo.dao.*;
import demo.service.*;
import java.util.Scanner;
public class ProductView {

	public static void main(String[] args) {
		ProductService productService=new ProductService();
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//Product obj1=new Product();
	
		for(int index=0;index<3;index++) {
			System.out.println("Enter Id: ");
			int productid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Product: ");
			String product_name=sc.nextLine();
			System.out.println("Enter Price: ");
			float product_price=sc.nextFloat();
			Product obj1=new Product(productid,product_name,product_price);
			productService.setProduct(obj1);
			}
		Product array[]=productService.getProducts();
		for(int index=0;index<array.length;index++) {
			System.out.println(array[index].getProductId()+" "+array[index].getProductName()+" "+array[index].getProductPrice());
		}
	}	

}
