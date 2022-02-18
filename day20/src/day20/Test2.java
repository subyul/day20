package day20;
class Card{
	static int width = 120;
	static int height = 300;
	int num;
	String shape;
}
public class Test2 {
	public static void main(String[] args) {
		Card c = new Card();
		Card c1 = new Card();
		
		Card [] arr = new Card[10];
		for(int i = 0; i<10;i++) {
			arr[i] = new Card();
		}
		
		for(int i = 0;i<10;i++) {
			System.out.print("arr["+i+"]: ");
			System.out.println(arr[i]);
		}
	}
}
