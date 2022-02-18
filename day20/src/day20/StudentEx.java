package day20;
import java.util.Scanner;
class Student
{
	String name ="�ް� IT ����б�";
	void choice1(int[] scores)
	{
		System.out.print("������ ����: ");
		for(int i = 0; i<scores.length;i++)
		{
			System.out.print(scores[i]+" ");
		}
		System.out.println();
	}
	
	void choice2(int[] scores)
	{
		System.out.print("������ ���� ���� �л�: ");
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
		System.out.print("������ ���� ���� �л�");
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
		System.out.print(id+"�л��� ������ ");
		if(idx ==-1)
		{
			System.out.println("�������� �ʽ��ϴ�");
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
			System.out.print("�Դϴ�");
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
			System.out.println("1. ������ ����Ȯ��");
			System.out.println("2. 1���л� ����Ȯ��");
			System.out.println("3. �õ��л� ����Ȯ��");
			System.out.println("4. (�й��� �Է¹޾�)����Ȯ��");
			System.out.println("5. �����ϱ�");
			
			System.out.print("�޴� ����: ");
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
				System.out.println("�й��� �Է��ϼ���");
				int id = sc.nextInt();
				
				s.choice4(ids, scores, id);
			}
			else if(select == 5)
			{
				System.out.println("���α׷� ����...");
				break;
			}
		}
	}

}
