package repository;

import java.util.HashMap;

import model.Account;

import java.util.*;

public class AccountRepositoryImpl implements IAccountRepository {
	private final Map<String, Account> db = new HashMap<>();

    @Override
    public Account save(Account account) {
        db.put(account.getUsername(), account);
        return account;
    }

    @Override
    public Optional<Account> findByUsername(String u) {
        return Optional.ofNullable(db.get(u));
    }

    @Override
    public boolean existsByUsername(String u) {
        return db.containsKey(u);
    }
}
