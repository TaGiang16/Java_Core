package controller;

import java.util.Scanner;

import console.Validation;

public class StudentView {
	private Validation val = new Validation();

	public int homeMenu() {
		System.out.println("======== WELCOME TO STUDENT MANAGEMENT =======");
		System.out.println("1. Create");
		System.out.println("2. Find and Sort");
		System.out.println("3. Update/Delete");
		System.out.println("4. Report");
		System.out.println("5. Exit");
		System.out.print("Select your choice: ");
		int choice = val.checkValidateNumberInRange(1, 5);
		return choice;
	}
}
