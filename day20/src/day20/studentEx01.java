package day20;
import java.util.Scanner;
class Subject{
	String name;
	int score;
}
class Student3{
	Subject[] subjects;
	String name;
}
public class studentEx01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int max = 100;
	Student3 []st = new Student3[max];
	for(int i = 0; i<max;i++) {
		st[i] = new Student3();
	}
	
	
	int count = 0;
	while(true) {
		System.out.println("=================");
		
		System.out.println("=================");
		System.out.println("[1] 학생 추가하기");
		System.out.println("[2] 과목 추가하기");
		System.out.println("[3] 성적 추가하기");
		System.out.print("메뉴 선택 : ");
		int select = sc.nextInt();
		
		if(select == 1) {
			System.out.print("이름 입력 : ");
			
			st[count].subjects = new Subject[3];
			
			
			}
		if(select == 2) {
			System.out.println("과목 입력: ");
			
			}
		}
	
	}
}
