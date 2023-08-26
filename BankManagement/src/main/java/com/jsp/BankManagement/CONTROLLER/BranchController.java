package com.jsp.BankManagement.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.BankManagement.DAO.BranchDao;

@RestController
@RequestMapping("/branch")
public class BranchController {

	@Autowired
	BranchDao dao;
	
	
}
