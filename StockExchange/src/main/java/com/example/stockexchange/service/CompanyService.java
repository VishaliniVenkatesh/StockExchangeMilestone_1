package com.example.stockexchange.service;

import java.sql.SQLException;
import java.util.List;

import com.example.stockexchange.model.Company;

public interface CompanyService {

	
	  public int insertCompany(Company company) throws SQLException;
	    public Company updateCompany(Company company);
		public List<Company> getCompanyList() throws SQLException;

}
