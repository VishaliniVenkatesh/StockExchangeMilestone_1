package com.example.stockexchange.model;

import java.util.List;



public class Company {
	private int companyCode;
	private String companyName;
	private double turnOver;
	private String ceo;
	private String boardOfDirectors;
	private List<StockExchange> stockExchange;
	private int sectorId;
	private String briefWriteup;
	private int stockCode;
	public Company()
	{
		
	}
	public Company(int companyCode, String companyName, double turnOver, String ceo, String boardOfDirectors,
			List<StockExchange> stockExchange, int sectorId, String briefWriteup, int stockCode) {
		super();
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.turnOver = turnOver;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.stockExchange = stockExchange;
		this.sectorId = sectorId;
		this.briefWriteup = briefWriteup;
		this.stockCode = stockCode;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(double turnOver) {
		this.turnOver = turnOver;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public List<StockExchange> getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(List<StockExchange> stockExchange) {
		this.stockExchange = stockExchange;
	}
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getBriefWriteup() {
		return briefWriteup;
	}
	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}
	public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	@Override
	public String toString() {
		return "Company [companyCode=" + companyCode + ", companyName=" + companyName + ", turnOver=" + turnOver
				+ ", ceo=" + ceo + ", boardOfDirectors=" + boardOfDirectors + ", stockExchange=" + stockExchange
				+ ", sectorId=" + sectorId + ", briefWriteup=" + briefWriteup + ", stockCode=" + stockCode + "]";
	}

	
}
