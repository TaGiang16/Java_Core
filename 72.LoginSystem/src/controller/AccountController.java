package controller;

import java.util.Scanner;

import service.IAccountService;
import view.ConsoleView;

public class AccountController {
	private final IAccountService service;
	private final ConsoleView view = new ConsoleView();
	private final Scanner sc = new Scanner(System.in);

	public AccountController(IAccountService service) {
		this.service = service;
	}

	public void start() {
		while (true) {
			view.showMenu();
			int opt = view.getIntInput("Please choice one option: ");
			switch (opt) {
			case 1:
				handleAdd();
				break;
			case 2:
				handleLogin();
				break;
			case 3:
				System.out.println("Thoát");
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ");
			}
		}
	}

	private void handleAdd() {
		try {
			System.out.println("-------Add user-------");
			System.out.print("Account: ");
			String u = sc.nextLine();
			System.out.print("Password: ");
			String p = sc.nextLine();
			System.out.print("Name: ");
			String n = sc.nextLine();
			System.out.print("Phone: ");
			String ph = sc.nextLine();
			System.out.print("Email: ");
			String e = sc.nextLine();
			System.out.print("Address: ");
			String a = sc.nextLine();
			System.out.print("DOB: ");
			String d = sc.nextLine();

			service.addAccount(u, p, n, ph, e, a, d);
			System.out.println("Thêm tài khoản thành công!");
		} catch (Exception ex) {
			System.err.println("Lỗi: " + ex.getMessage() + "\n");
		}
	}

	private void handleLogin() {
		System.out.println("--------Login--------");
		System.out.print("Account: ");
		String u = sc.nextLine();
		System.out.print("Password: ");
		String p = sc.nextLine();
		if (service.login(u, p)) {
			System.out.println("------Welcome------");
			System.out.println("Hello " + u);
			System.out.println(p);
		} else {
			System.out.println("Đăng nhập thất bại!");
		}
	}
}
