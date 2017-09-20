package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
	public String Title;
	public String Desc;
	List<Question> questions=new ArrayList<Question>();
	
	
	public static void createQuiz()
	{
		Scanner sc=new Scanner(System.in);
		Quiz q=new Quiz();
		System.out.println("Create Quiz");
		System.out.print("\nEnter Title:");
		q.Title=sc.nextLine();
		System.out.print("\nEnter Desc:");
		q.Desc=sc.nextLine();
		System.out.print("Enter No of Questions:");
		int no=sc.nextInt();
		
		int ty;
		for(int i=0;i<no;i++)
		{
			System.out.print("Enter Question "+i+1+"of type ( Multiple=1,  True-False=2, Num=3):");
			ty=sc.nextInt();
			switch(ty)
			{
			case 1:q.questions.add(Question.createMultipleQuestion());
				break;
			case 2:q.questions.add(Question.createTruFQuestion());
				break;
			case 3:q.questions.add(Question.createNumQuestion());
				break;
			}
		}
		Main.Quizzes.add(q);
	}


	public static void viewAllQuizzes() {
		// TODO Auto-generated method stub
		System.out.println("Quiz Title              Desc");
		int count=1;
		for(Quiz q:Main.Quizzes)
		{
			System.out.println(count+"# "+q.Title+"              "+q.Desc);
			count++;
		}
		
		
	}
	
}
