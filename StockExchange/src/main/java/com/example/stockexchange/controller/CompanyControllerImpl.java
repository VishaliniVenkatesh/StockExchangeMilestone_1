package com.example.stockexchange.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockexchange.model.Company;
import com.example.stockexchange.service.CompanyService;
import com.example.stockexchange.service.CompanyServiceImpl;

@Controller
public class CompanyControllerImpl implements CompanyController{

	
	@Autowired
	private CompanyService companyService;
	
	
//	
	
	 
     @RequestMapping("/insertcompany")
     public Company insert(HttpServletRequest req){
                     int companyCode= 11111;
                     String companyName=req.getParameter("company_name");
                     double turnOver=Double.parseDouble(req.getParameter("turnover"));
                     String ceo=req.getParameter("ceo");
                     String boardOfDirectors=req.getParameter("board_of_directors");
                     int sectorId=1;
                     String briefWriteUp=req.getParameter("brief_writeup");
                     int stockCode=222;
                     Company company=new Company();
                     company.setCompanyCode(companyCode);
                     company.setCompanyName(companyName);
                     company.setTurnOver(turnOver);
                     company.setCeo(ceo);
                     company.setBoardOfDirectors(boardOfDirectors);
                     company.setSectorId(sectorId);
                     company.setBriefWriteup(briefWriteUp);
                     company.setStockCode(stockCode);
                     try {
                                     companyService.insertCompany(company);
                     } catch (SQLException e) {
                                     // TODO Auto-generated catch block
                                     e.printStackTrace();
                     }
                     return company;
     }

	 
	
	
	
	
	
	@RequestMapping(path="/insertCompanyDetails")
	public String insertcompany(){
		return "insertCompanyDetails";
	}

	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(path="/companyList")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("companyList");
		mv.addObject("companyList",companyService.getCompanyList());
		return mv;
	}
	
	
	// try
	public static void main(String [] args) {
		CompanyController controller=new CompanyControllerImpl();
		try {
			System.out.println(controller.getCompanyList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}






	public int insertCompany(Company company) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}






	
}
