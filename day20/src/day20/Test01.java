package day20;
class Product{
	String name;
	int price;
	}
public class Test01 {
	public static void main(String[] args) {
		Product pr = new Product();
		pr.name ="°¨ÀÚ±ø";
		pr.price= 1000;
		
		Product[] arr = new Product[3];
		arr[0] = new Product();
		arr[1] = new Product();
		arr[2] = new Product();
		
		for(int i = 0;i<arr.length;i++) {
			arr[i].price = (i*10)+10;
		}
		
		arr[0].name ="ÀÌ¸¸¼ö";
		arr[1].name ="ÀÌ¿µÈñ";
		arr[2].name ="±èÃ¶¹Î";
		System.out.println(arr[1].name);
		
		Product temp = arr[1];
		System.out.println(temp.name);
	}
}
