package service;

import java.util.List;

import model.Account;

public interface IAccountService {
	Account addAccount(String username, String password, String name, String phone, String email, String address,
			String dob) throws Exception;

	boolean login(String username, String password);

	List<Account> getAll(); // hỗ trợ debug / danh sách
}
