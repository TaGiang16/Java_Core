package repository;

import java.util.Optional;

import model.Account;

public interface IAccountRepository {
	Account save(Account account);              // thêm/sửa
    Optional<Account> findByUsername(String u); // tra cứu
    boolean existsByUsername(String u);
}
