package by.academy.classwork.lesson7;

import by.academy.classwork.lesson7.User.Query;

public class UserStatic {
	private String login;
	private String password;

	public static class Query {
		UserStatic u;

		public Query() {

		}

		public Query(UserStatic u) {
			this.u = u;
		}

		public void printToLog() {
			System.out.println("Пользоваель: " + u.login);
		}
	}

	public void createQuery() {
		Query q = new Query();
		q.printToLog();
	}

}
