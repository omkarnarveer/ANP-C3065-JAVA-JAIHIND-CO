
public class EnumSeasonDemo {
enum Season{
SUMMER,RAINY,WINTER	
}
	public static void main(String[] args) {
		for(Season seasonVar:Season.values())
			System.out.println(seasonVar);
	}
	
}
