package com.lotfi.ebankapp.repositories;

import com.lotfi.ebankapp.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
