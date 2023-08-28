package com.jsp.BankManagement.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.BankManagement.DAO.BankDao;
import com.jsp.BankManagement.DTO.Bank;

@RestController
@RequestMapping("/bank")
public class BankController {

	@Autowired
	BankDao dao;
	// this is post mapping
	@PostMapping
	public Bank createBank(@RequestBody Bank bank)
	{
		return dao.createBank(bank);
	}
	
	@GetMapping
	public Bank getBankById(@RequestParam int id)
	{
		return dao.getBankById(id);
	}
	
	@PutMapping
	public Bank updateBank(@RequestParam int id , @RequestParam String name)
	{
		return dao.updateBankName(id, name);
	}
	
	@DeleteMapping
	public void deleteBankById(@RequestParam int id)
	{
		dao.deleteBank(id);
	}
	
	@GetMapping("/all")
	public List<Bank> getAllBank()
	{
		return dao.getAllBank();
	}
}







