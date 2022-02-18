package day20;
import java.util.Scanner;
class Student
{
	String name ="메가 IT 고등학교";
	void choice1(int[] scores)
	{
		System.out.print("전교생 성적: ");
		for(int i = 0; i<scores.length;i++)
		{
			System.out.print(scores[i]+" ");
		}
		System.out.println();
	}
	
	void choice2(int[] scores)
	{
		System.out.print("성적이 가장 높은 학생: ");
		int max = 0;
		for(int i = 0;i<scores.length;i++)
		{
			if(max<scores[i])
			{
				max = scores[i];
			}
		}
		System.out.println(max);
	}
	void choice3(int[] scores)
	{
		System.out.print("성적이 가장 낮은 학생");
		int min = scores[0];
		for(int i = 0;i<scores.length;i++)
		{
			if(min>scores[i])
			{
				min = scores[i];
			}
		}
		System.out.println(min);
	}
	void choice4(int[] ids,int[] scores, int id)
	{
		int idx = -1;
		for(int i = 0;i<ids.length;i++)
		{
			if(ids[i]==id)
			{
				idx = i;
			}
			
		}
		System.out.print(id+"학생의 성적은 ");
		if(idx ==-1)
		{
			System.out.println("존재하지 않습니다");
		}
		else 
		{
			
			for(int i = 0; i<ids.length;i++)
			{
				if(ids[i]==id)
				{
					System.out.print(scores[i]);
				}
			}
			System.out.print("입니다");
			System.out.println();
		}
	}

}
public class StudentEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		
		int scores [] = {92,38,87,100,11};
		int ids [] = {1001,1002,1003,1004,1005};
		while (true)
		{
			System.out.println("=== "+s.name+" ===" );
			System.out.println("1. 전교생 성적확인");
			System.out.println("2. 1등학생 성적확인");
			System.out.println("3. 꼴등학생 성적확인");
			System.out.println("4. (학번을 입력받아)성적확인");
			System.out.println("5. 종료하기");
			
			System.out.print("메뉴 선택: ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				s.choice1(scores);
			}
			else if(select == 2)
			{
				s.choice2(scores);
			}
			else if(select == 3)
			{
				s.choice3(scores);
			}
			else if(select == 4)
			{
				System.out.println("학번을 입력하세요");
				int id = sc.nextInt();
				
				s.choice4(ids, scores, id);
			}
			else if(select == 5)
			{
				System.out.println("프로그램 종료...");
				break;
			}
		}
	}

}
