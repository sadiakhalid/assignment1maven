package quiz;

import java.util.Scanner;

public class Question{
	public String Desc;
	public String type;
	public String[] options = new String[4];
	public String[] ans=new String[4];
	
	public static Question createTruFQuestion() {
		Question m = new Question();
		m.type="tf";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Question:");
		m.Desc = sc.nextLine();
		
		System.out.print("Enter Ans:");
		m.ans[0] = ""+sc.nextInt();
		return m;
	}
	public static Question createMultipleQuestion() {
		Question m = new Question();
		m.type="mp";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Question:");
		m.Desc = sc.nextLine();
		System.out.print("1)");
		m.options[0] = sc.nextLine();
		System.out.print("\n2)");
		m.options[1] = sc.nextLine();
		System.out.print("\n3)");
		m.options[2] = sc.nextLine();
		System.out.print("\n4)");
		m.options[3] = sc.nextLine();
		System.out.print("Enter Ans:");
		m.ans[0] = ""+sc.nextInt();
		return m;
	}
	public static Question createNumQuestion() {
		Question m = new Question();
		m.type="nm";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Question:");
		m.Desc = sc.nextLine();
		
		System.out.print("Enter No of Expected Answers");
		int no=sc.nextInt();
		sc.nextLine();
		if(no<=10)
		{
			for(int i=0;i<no;i++)
			{
				System.out.println("\nEnter Ans "+i);
				m.ans[i]=sc.nextLine();
			}
		}
		return m;
	}
}
