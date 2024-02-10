package com.banking.Bankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.Bankingapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
