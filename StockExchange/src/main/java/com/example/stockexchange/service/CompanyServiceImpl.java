package com.example.stockexchange.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.stockexchange.dao.CompanyDao;
import com.example.stockexchange.dao.CompanyDaoImpl;
import com.example.stockexchange.model.Company;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;
	
	public int insertCompany(Company company) throws SQLException {
		// TODO Auto-generated method stub
		return companyDao.insertCompany(company);
	}

	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Company> getCompanyList() throws SQLException {
		return companyDao.getCompanyList();
	}

}
