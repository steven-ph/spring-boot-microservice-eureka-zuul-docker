package com.stevenph.microservice.account.repository;

import com.stevenph.microservice.account.model.Account;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class AccountRepository
{
	private final static Map<Integer, Account> accounts = new HashMap<>();

	static {
		accounts.put(1, new Account(1, "Salmon Sashimi", "salmon.sashimi@gmail.com"));
		accounts.put(2, new Account(2, "John Doe", "john.doe@mail.com"));
		accounts.put(3, new Account(3, "Tuna Roll", "tuna.roll@mail.com"));
		accounts.put(4, new Account(4, "Black Hawk", "black.hawk@mail.com"));
	}

	public Optional<Account> findById(Integer id)
	{
		return Optional.ofNullable(accounts.get(id));
	}

    public Optional<Collection<Account>> findAll() {
		return Optional.ofNullable(accounts.values());
    }
}
