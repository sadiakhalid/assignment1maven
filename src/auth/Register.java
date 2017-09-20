package auth;

import java.util.Scanner;

import quiz.Main;
import quiz.Quiz;
import quiz.User;

public class Register {

	public void register() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		User u = new User();
		System.out.print("Enter Username:");
		u.Username = sc.nextLine();

		System.out.print("\nEnter Password:");
		u.Password = sc.nextLine();

		System.out.println("\nEnter Role: (Student=1, Instuctor=2)");

		u.role = sc.nextInt();
		u.score = 0;

		Main.Users.add(u);
	}

}
