package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidationUtil {
	private static final DateTimeFormatter DOB_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void requireNotBlank(String value, String field) throws Exception {
		if (value == null || value.trim().isEmpty())
			throw new Exception(field + " không được trống");
	}

	public static boolean isPhoneValid(String phone) {
		return phone != null && phone.matches("^[0-9]{10,11}$");
	}

	public static boolean isEmailValid(String email) {
		return email != null && email.matches("^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,}$");
	}

	public static LocalDate parseDob(String dob) throws Exception {
		try {
			return LocalDate.parse(dob, DOB_FORMAT);
		} catch (DateTimeParseException e) {
			throw new Exception("Ngày sinh không hợp lệ, format dd/MM/yyyy");
		}
	}
}
