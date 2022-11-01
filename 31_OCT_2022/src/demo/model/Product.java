package demo.model;

public class Product{
	
	public int productId;
	public String productName;	
	public float productPrice;
	
	    //Overloading Polymorphism
		public Product(){
		System.out.println("Non Parameterized");
		}
		
		//Overloading Polymorphism
		public Product(int prodId,String prodName,float prodPrice){
			System.out.println("parameterized");
			productId=prodId;
			productName=prodName;
			productPrice=prodPrice;
		}

	public void setProductId(int proId) {
		productId=proId;
		
	}
	public void setProductName(String proName) {
		productName=proName;
		
	}
	public void setProductPrice(float proPrice) {
		productPrice=proPrice;
	
}
	public int getProductId(){
		return productId;
	}
	public String getProductName(){
		return productName;
	}
	public float getProductPrice(){
		return productPrice;
	}
	

	
}