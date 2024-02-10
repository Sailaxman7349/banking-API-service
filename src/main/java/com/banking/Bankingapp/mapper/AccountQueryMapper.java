package com.banking.Bankingapp.mapper;

import org.springframework.beans.BeanUtils;

import com.banking.Bankingapp.dto.AccountDto;
import com.banking.Bankingapp.entity.Account;

public class AccountQueryMapper {
	public AccountDto mapToAccountDto(Account account) {
		AccountDto accountDto = new AccountDto();
		BeanUtils.copyProperties(account, accountDto);
		return accountDto;
	}

}
