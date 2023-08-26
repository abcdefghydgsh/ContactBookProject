package com.jsp.BankManagement.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.BankManagement.DTO.Bank;
import com.jsp.BankManagement.DTO.Branch;
import com.jsp.BankManagement.REPOSITORY.BranchRepository;

@Repository
public class BranchDao {

	@Autowired
	BranchRepository repository;
	
	BankDao dao = new BankDao();
	
	public Branch createBranch(int id , Branch branch)
	{
		Bank b = dao.getBankById(id);
		List<Branch> branches = new ArrayList<>();
		branches.add(branch);
		if(b != null)
		{
			b.setBranchs(branches);
			branch.setB(b);
			return repository.save(branch);
		}
		return null;
	}
	
	public Branch getBranchById(int id)
	{
		Optional<Branch> opt = repository.findById(id);
		if(opt.isPresent())
		{
			return opt.get();
		}
		else
			return null;
	}
	
	public List<Branch> getAllBranch()
	{
		return repository.findAll();
	}
	
	public void deleteBranch(int id)
	{
		repository.deleteById(id);
	}
	
	public Branch updateBranchName(int id , String name)
	{
		Branch b = getBranchById(id);
		if(b != null)
		{
			b.setBranch_name(name);
			repository.save(b);
			return b;
		}
		else
			return b;
	}
}
