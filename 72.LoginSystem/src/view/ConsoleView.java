package view;

import java.util.Scanner;

public class ConsoleView {
	private final Scanner sc = new Scanner(System.in);

    public void showMenu() {
        System.out.println("======= Login Program =======");
        System.out.println("1. Add Account");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }

    public int getIntInput(String msg) {
        System.out.print(msg);
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
}
