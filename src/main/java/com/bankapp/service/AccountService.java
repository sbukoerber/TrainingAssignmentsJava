package com.bankapp.service;

import com.bankapp.dto.AccountDto;
import com.bankapp.dto.DepositDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.dto.WithdrawDto;

import java.util.List;

public interface AccountService {
    public List<AccountDto> getAllAccounts();
    public AccountDto getAccount(int id);
    public String transfer(TransferDto transferDto);
    public String deposit(DepositDto depositDto);
    public String withdraw(WithdrawDto withdrawDto);
    AccountDto addAccount(AccountDto accountDto);
    public String updateAccount(int id, AccountDto accountDto);
    public String deleteAccount(int id);
}
