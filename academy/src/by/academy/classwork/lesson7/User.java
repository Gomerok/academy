package by.academy.classwork.lesson7;

public class User {

	private String login;
	private String password;

	public class Query {

		public void printToLog() {
			System.out.println("Пользоваель: " + login);
		}
	}

	public void createQuery() {
		Query q = new Query();
		q.printToLog();
	}

}
