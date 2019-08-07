package com.example.stockexchange.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.example.stockexchange.model.Company;

public interface CompanyController {

  	    public int insertCompany(Company company) throws SQLException;
	    public Company updateCompany(Company company);
		public ModelAndView getCompanyList() throws Exception;

	
}
