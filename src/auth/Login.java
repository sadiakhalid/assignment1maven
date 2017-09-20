package auth;

import java.util.List;
import java.util.Scanner;

import quiz.Main;
import quiz.Quiz;
import quiz.User;

public class Login {

	public void login() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean ouruser=false;
		while(ouruser==false)
		{
		System.out.print("Enter Username:");
		String username=sc.nextLine();
		System.out.print("\nEnter Password:");
		String password=sc.nextLine();
		
		
		boolean isStudent=false;
		User currentUser=null;
		for(User u:Main.Users)
		{
			if(u.Username.compareTo(username)==0&&u.Password.compareTo(password)==0)
			{
				ouruser=true;
				if(u.role==1)
				isStudent=true;
				currentUser=u;
				break;
			}
		}
		if(ouruser)
		{
			if(isStudent)
			{
				Quiz.viewAllQuizzes();
				int no=sc.nextInt();
				
				currentUser.takeQuiz(no);
				
			}
			else
			{
				Quiz.createQuiz();
			}
		}
		else
			System.out.println("Username/password are incorrect");
		}
	}

}
