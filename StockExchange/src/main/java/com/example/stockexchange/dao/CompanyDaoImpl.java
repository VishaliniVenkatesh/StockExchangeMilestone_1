package com.example.stockexchange.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.stockexchange.model.Company;

@Repository
public class CompanyDaoImpl implements CompanyDao{

	public int insertCompany(Company company) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_db","root","root");
			ps=con.prepareStatement("insert into company(company_name,turnover,ceo,board_of_directors,sector_id,brief_writeup,stock_code) values(?,?,?,?,?,?,? )");
			ps.setString(1,company.getCompanyName());
			ps.setDouble(2, company.getTurnOver());
			ps.setString(3, company.getCeo());
			ps.setString(4,company.getBoardOfDirectors());
			ps.setInt(5, company.getSectorId());
			ps.setString(6, company.getBriefWriteup());
			ps.setInt(7,company.getStockCode());
			result=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;	
	}

	
	public List<Company> getCompanyList() throws SQLException {
		Connection con=null;
	    PreparedStatement ps=null;
	    List<Company> companylist= new ArrayList<Company>();
	    Company company=null;  
	    try {	
	    	Class.forName("com.mysql.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_db","root","root");
		    ps=con.prepareStatement("select * from company");
		    ResultSet rs=ps.executeQuery();

		    while(rs.next())
		    {
		    
		    	company = new Company();
		    	company.setCompanyCode(rs.getInt("company_code"));
		    	company.setCompanyName(rs.getString("company_name"));
		    	company.setTurnOver(rs.getDouble("turnover"));
		    	company.setCeo(rs.getString("ceo"));
		    	company.setBoardOfDirectors(rs.getString("board_of_directors"));
		    	company.setSectorId(rs.getInt("sector_id"));
		    	company.setBriefWriteup(rs.getString("brief_writeup"));
		    	company.setStockCode(rs.getInt("stock_code"));
		    	companylist.add(company);

		    }
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	    	
		return companylist;

	
	}

	
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
