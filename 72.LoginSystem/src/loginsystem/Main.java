package loginsystem;

import controller.AccountController;
import repository.AccountRepositoryImpl;
import service.AccountServiceImpl;

public class Main {

	public static void main(String[] args) {
		var repo = new AccountRepositoryImpl();
		var service = new AccountServiceImpl(repo);
		var controller = new AccountController(service);
		controller.start();
	}

}
