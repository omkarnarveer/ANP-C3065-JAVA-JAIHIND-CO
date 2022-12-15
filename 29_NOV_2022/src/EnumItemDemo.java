enum Item{
	MOBILE(10000,"Realmi"),LAPTOP(80000,"ASUS"),SPEAKER(1000,"Fingers");

int price;
String name;
Item(int price, String name){
	this.price=price;
	this.name=name;
}

int showPrice() {
	return price;
}
String showName() {
	return name;
}
}
public class EnumItemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Item item:Item.values()) {
			System.out.println(item+" "+item.showPrice()+" "+item.showName());
			String name="LAPTOP";
			Item itemVar=Item.valueOf(name);
			System.out.println(itemVar.showName()+" "+itemVar.showPrice());
		}
	}
	}

