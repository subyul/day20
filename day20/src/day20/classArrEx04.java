package day20;
import java.util.Scanner;
class Storage{
	String id;
	int money;
}
public class classArrEx04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 100;
		Storage[] user = new Storage[max];
		
		for(int i = 0; i<max;i++) {
			user[i] = new Storage();
		}
		
		System.out.println("user:" + user);
		System.out.println("user[0]:"+user[0]);
		System.out.println("user[1]:"+user[1]);
		
		user[0].id = "aaaa";
		user[0].money = 1000;
		
		user[1].id = "bbbb";
		user[1].money = 2000;
		int count = 2;
		for( int i = 0;i<count;i++) {
			System.out.println(user[i].id+" "+user[i].money);
		}
		
		Storage temp = user[1];
		temp.id ="cccc";
		System.out.println("======================");
		
		for(int i = 0; i<count;i++) {
			System.out.println(user[i].id+" "+user[i].money);
		}
		
	}
}
