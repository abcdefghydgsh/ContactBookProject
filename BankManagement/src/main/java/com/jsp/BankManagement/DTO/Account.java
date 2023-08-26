package com.jsp.BankManagement.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ac_id;
	private long account_no;
	private String acHolder_name;
	private double balance;
	private String IFSCcode;
	
	@ManyToOne
	@JoinColumn
	Branch branch;
	
	@OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
	Customer customer;

	public int getAc_id() {
		return ac_id;
	}

	public void setAc_id(int ac_id) {
		this.ac_id = ac_id;
	}

	public long getAccount_no() {
		return account_no;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	public String getAcHolder_name() {
		return acHolder_name;
	}

	public void setAcHolder_name(String acHolder_name) {
		this.acHolder_name = acHolder_name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getIFSCcode() {
		return IFSCcode;
	}

	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}






