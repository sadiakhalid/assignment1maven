package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
	public String Username;
	public String Password;
	public int role;
	public int score;

	public void takeQuiz(int no) {
		// TODO Auto-generated method stub
		Quiz q = Main.Quizzes.get(no);
		int count = 1;
		int n = q.questions.size();
		System.out.println("Total Questions:" + n);
		Scanner sc = new Scanner(System.in);
		String ans=null;
		for (Question obj : q.questions) {
			System.out.println(count + "# " + obj.Desc);
			switch (obj.type) {
			case "tf":
				System.out.println("1)True    2)False");
				break;
			case "mp":
				System.out.println("1#"+obj.options[0] + "  2#  " + obj.options[1]
						+ "  3#  " + obj.options[2] + "  4#  " + obj.options[3]);
				break;
			}

			System.out.print("\nEnter Ans:");
			if (obj.type.compareTo("nm") == 0) {
				ans = sc.nextLine();
				for (int i = 0; i < 4; i++)
					if (ans.compareTo(obj.ans[i]) == 0) {
						score++;
						break;
					}
			}else
			{
				if(obj.ans[0].compareTo(ans)==0)
					score++;
				
			}
		}

	}

}
