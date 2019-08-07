package com.example.stockexchange.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.stockexchange.model.Company;

public interface CompanyDao {
	  public int insertCompany(Company company) throws SQLException;
	    public Company updateCompany(Company company);
		public List<Company> getCompanyList() throws SQLException;

}
