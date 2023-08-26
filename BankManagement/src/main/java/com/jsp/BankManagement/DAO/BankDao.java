package com.jsp.BankManagement.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.BankManagement.DTO.Bank;
import com.jsp.BankManagement.REPOSITORY.BankRepository;

@Repository
public class BankDao {

	@Autowired
	BankRepository repository;
	
	public Bank createBank(Bank bank)
	{
		return repository.save(bank);
	}
	
	public Bank getBankById(int id)
	{
		Optional<Bank> opt = repository.findById(id);
		if(opt.isPresent())
		{
			return opt.get();
		}
		else
			return null;
	}
	
	public List<Bank> getAllBank()
	{
		return repository.findAll();
	}
	
	public void deleteBank(int id)
	{
		repository.deleteById(id);
	}
	
	public Bank updateBankName(int id , String name)
	{
		Bank b = getBankById(id);
		if(b != null)
		{
			b.setBank_name(name);
			repository.save(b);
			return b;
		}
		else
			return b;
	}
}




