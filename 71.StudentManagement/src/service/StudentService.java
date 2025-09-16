package service;

import java.util.ArrayList;
import java.util.*;

import entity.Student;

public class StudentService {
	private List<Student> stdList = new ArrayList<>();

	/**
	 * ham tao sinh vien moi
	 * 
	 * @param id       id cua sinh vien
	 * @param stdname  ten cua sinh vien
	 * @param semester ki hoc cua sinh vien
	 * @param crsname  khoa hoc cua sinh vien
	 * @throws Exception neu id, stdname, semester, crsname khong hop le
	 */
	public void createNewStudent(int id, String stdname, int semester, String crsname) {
		Student newstd = new Student();
		newstd.setId(id);
		newstd.setStudentName(stdname);
		newstd.setSemester(semester);
		newstd.setCourseName(crsname);
		stdList.add(newstd);
	}

	/**
	 * ham tim va sap xep sinh vien theo ten
	 * 
	 * @param name ten cua sinh vien nhap boi user
	 * @return danh sach sinh vien duoc loc
	 */
	public List<Student> findAndSortStudentList(String name) {
		List<Student> selectedList = new ArrayList<>();
		for (Student std : stdList) {
			if (std.getStudentName().contains(name)) {
				selectedList.add(std);
			}
		}
		selectedList.sort((std1, std2) -> std1.getStudentName().compareToIgnoreCase(std2.getStudentName()));
		return selectedList;
	}

	/**
	 * ham tim student bang id
	 * 
	 * @param id id cua student can tim
	 * @return std doi tuong student neu tim thay
	 * @return null neu khong tim thay student
	 */
	public Student findStudentById(int id) {
		for (Student std : stdList) {
			if (std.getId() == id) {
				return std;
			}
		}
		System.out.println("Not found");
		return null;
	}

	/**
	 * ham xoa student theo id
	 * 
	 * @param id id cua student can xoa
	 */
	public void deleteStudent(int id) {
		boolean removed = stdList.removeIf(std -> std.getId() == id);
		if (removed) {
			System.out.println("Delete successful");
		} else {
			System.out.println("Student not found!");
		}
	}

	/**
	 * ham cap nhat student theo id
	 * 
	 * @param std      student can cap nhat
	 * @param id       id cua student can cap nhat
	 * @param name     ten user muon cap nhat cho student
	 * @param semester hoc ki user muon cap nhat cho student
	 * @param crs      khoa hoc user muon cap nhat cho student
	 */
	public void updateStudent(Student std, String name, Integer semester, String crs) {
		if (name != null && !name.trim().isEmpty()) {
			std.setStudentName(name);
		}
		if (semester != null && semester != std.getSemester()) {
			std.setSemester(semester);
		}
		if (crs != null && !crs.trim().isEmpty()) {
			std.setCourseName(crs);
		}
		System.out.println("Update successful");
	}

	/**
	 * ham lay kich thuoc cua danh sach sinh vien
	 * 
	 * @return kich thuoc cua danh sach
	 */
	public int getStudentListSize() {
		return stdList.size();
	}
}
