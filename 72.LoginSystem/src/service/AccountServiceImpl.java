package service;

import java.time.LocalDate;

import model.Account;
import repository.IAccountRepository;
import util.MD5Util;
import util.ValidationUtil;

public class AccountServiceImpl implements IAccountService {
	private final IAccountRepository repo;

	public AccountServiceImpl(IAccountRepository repo) {
		this.repo = repo;
	}

	@Override
	public Account addAccount(String username, String password, String name, String phone, String email, String address,
			String dob) throws Exception {
		// validate
		ValidationUtil.requireNotBlank(username, "Username");
		ValidationUtil.requireNotBlank(password, "Password");
		if (repo.existsByUsername(username))
			throw new Exception("Username đã tồn tại");

		if (!ValidationUtil.isPhoneValid(phone))
			throw new Exception("Số điện thoại không hợp lệ");
		if (!ValidationUtil.isEmailValid(email))
			throw new Exception("Email không hợp lệ");
		LocalDate parsedDob = ValidationUtil.parseDob(dob);

		String md5 = MD5Util.getMD5(password);
		Account account = new Account();
		account.setUsername(username);
		account.setPasswordHash(md5);
		account.setName(name);
		account.setPhone(phone);
		account.setEmail(email);
		account.setAddress(address);
		account.setDob(parsedDob);

		return repo.save(account);
	}

	@Override
	public boolean login(String username, String password) {
		return repo.findByUsername(username).map(a -> a.getPasswordHash().equals(MD5Util.getMD5(password)))
				.orElse(false);
	}

	@Override
	public java.util.List<Account> getAll() {
		// Optional, cast repo Map -> List nếu muốn
		return new java.util.ArrayList<>();
	}
}
