package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import auth.Login;
import auth.Register;

public class Main {
	public static List<User> Users = new ArrayList<User>();
	public static List<Quiz> Quizzes = new ArrayList<Quiz>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Register reg = new Register();
		Login login = new Login();
		while (true) {
			System.out.println("Main Menu");
			System.out.println("1. Register");
			System.out.println("2. Login");
			Scanner obj = new Scanner(System.in);
			int input = obj.nextInt();
			if (input == 1)
				reg.register();
			else if (input == 2)
				login.login();
		}
	}

}
