package day20;
import java.util.Scanner;
class Bank{
	String id;
	int money;
}
public class BankEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 100;
		Bank []arr = new Bank[max];
		
		for(int i = 0;i<max;i++) {
			arr[i] = new Bank();
		}
		int count =0;
		int n = 0;
		
		while (n==0) {
			System.out.println("1. ȸ������");
			System.out.println("2. Ż��");
			System.out.println("3. ���");
			System.out.print("�޴� ����: ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("�̸��� �Է��ϼ���");
				arr[count].id = sc.next();
				
				System.out.println("�ݾ��� �Է��ϼ���");
				arr[count].money = sc.nextInt();
				count++;
				
				
			}
			if(select == 2) {
				System.out.println("�ε����� �Է��ϼ���");
				int idx = sc.nextInt();
				
				for(int i = idx; i<count-1;i++) {
					arr[i] = arr[i+1];
				}
				count--;
				
				
			}
			if(select == 3) {
				for(int i = 0; i<count;i++) {
					System.out.println(arr[i].id+" "+arr[i].money);
				}
			}
			
		}
	
	}
}
