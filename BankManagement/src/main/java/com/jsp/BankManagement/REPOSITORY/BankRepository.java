package com.jsp.BankManagement.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.BankManagement.DTO.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer>{

}
