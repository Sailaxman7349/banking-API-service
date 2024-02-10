package com.banking.Bankingapp.mapper;

import org.springframework.beans.BeanUtils;

import com.banking.Bankingapp.dto.AccountDto;
import com.banking.Bankingapp.entity.Account;

public class AccountCommandMapper {
	public Account mapToAccount(AccountDto accountDto) {
		Account account = new Account();
		BeanUtils.copyProperties(accountDto, account);
		return account;
	}

}
