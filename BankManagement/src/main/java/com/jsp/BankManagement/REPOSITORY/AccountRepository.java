package com.jsp.BankManagement.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.BankManagement.DTO.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
