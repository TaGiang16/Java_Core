package controller;

import java.util.List;
import java.util.Scanner;

import console.Validation;
import entity.Student;
import service.StudentService;

public class StudentController {
	private StudentView view = new StudentView();
	private StudentService ser = new StudentService();
	private Validation val = new Validation();
	private Scanner sc = new Scanner(System.in);

	public void start() {
		while (true) {
			switch (view.homeMenu()) {
			case 1:
				handleCreate();
				break;
			case 2:
				handleFindAndSort();
				break;
			case 3:
				handleDeleteNUpdate();
				break;
			case 4:
				break;
			case 5:
				return;
			}

		}
	}

	/**
	 * Ham nhap lieu tao sinh vien moi
	 */
	private void handleCreate() {
		try {
			if (ser.getStudentListSize() < 5) {
				System.out.println("----- Create -----");
				System.out.print("Id: ");
				int id = val.checkValidateNumber();
				System.out.print("Student Name: ");
				String name = val.checkValidateText();
				System.out.print("Semester: ");
				int semester = val.checkValidateNumber();
				System.out.print("Course Name: ");
				String crs = val.checkInputCourse();

				ser.createNewStudent(id, name, semester, crs);
				System.out.println("Create successful");
			} else if (ser.getStudentListSize() >= 5) {
				System.out.println("The student list has reached the limit of 5");
				System.out.println("Do you want to continue (Y/N)?");
				boolean check = val.checkValidateTextOption("y", "n");
				if (check == true) {
					handleCreate();
				} else {
					return;
				}
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Ham xu li tim va sap xep sinh vien
	 */
	private void handleFindAndSort() {
		System.out.println("-----Find and Sort-----");
		System.out.print("Name: ");
		String name = val.checkValidateText();
		List<Student> stdlist = ser.findAndSortStudentList(name);

		System.out.printf("%-15s%-15s%-15s\n", "StudentName", "Semester", "CourseName");
		for (Student std : stdlist) {
			System.out.printf("%-15s%-15s%-15s\n", std.getStudentName(), std.getSemester(), std.getCourseName());
		}
	}

	private void handleDeleteNUpdate() {
		System.out.println("-----Update/Delete-----");
		System.out.print("Enter Student ID:");
		int id = val.checkValidateNumber();
		Student foundStd = ser.findStudentById(id);
		if (foundStd != null) {
			System.out.println("Do you want to update (U) or delete (D) student ?");
			boolean check = val.checkValidateTextOption("u", "d");
			if (check == true) {
				System.out.println("-----Update-----");
				System.out.print("Student Name: ");
				String newname = sc.nextLine();
				System.out.print("Semester: ");
				String semesterInput = sc.nextLine().trim();
				Integer newsemester = null;
				if (!semesterInput.isEmpty()) {
					System.out.println("Re-enter: ");
					newsemester = val.checkValidateNumber();
				}
				System.out.print("Course Name: ");
				String newcrs = sc.nextLine();
				if (!newcrs.isEmpty()) {
					System.out.println("Re-enter: ");
					newcrs = val.checkInputCourse();
				}
				ser.updateStudent(foundStd, newname, newsemester, newcrs);
			} else {
				System.out.println("-----Delete-----");
				ser.deleteStudent(id);
			}
		} else
			return;

	}
}
