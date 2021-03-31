package com.callor.classes.model;

public class IolistVO {
/*
 * 매입매출 관리프로젝트
 * 마트, 편의점, 쇼핑몰 등에서 공산품을 구매하여 고객에게 마진을 붙여 판매하고
 * 이익금등을 계산하는 프로젝트 
 * 소매점(도매점 등으로 부터 구매하여 일반 소비자에게 판매)
 * 도매점(생산공장에서 구매하여, 소매점에 판매)
 * 매입 : 회사에서 판매목적으로 물품을 구입하는것
 * 매출 : 회사에서 상품을 고객에게 판매하는것 
 * 매입매출 관리를 하기 위해
 * 
 *  기본적으로 필요한 데이터 항목
 *  객체지향 이론에서 추상화(단계) 라고 한다.
 * 상품이름(pname), 거래처(dname), 거래일자(date), 매입매출구분(inout), 수량(qty), 매입단가(iprice), 매출단가(oprice)
 * 수량, 매입단가, 매출단가는 곱셉연산이 필요한 데이터 
 */
	
	// 객체지향 이론(특징)에서 "정보의 은닉"하기
	private String pname;
	private String dname;
	private String inout;
	private Integer qty;
	private Integer iprice;
	private Integer oprice;
	private String date;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getInout() {
		return inout;
	}
	public void setInout(String inout) {
		this.inout = inout;
	}
	public Integer getIprice() {
		return iprice;
	}
	public void setIprice(Integer iprice) {
		this.iprice = iprice;
	}
	public Integer getOprice() {
		return oprice;
	}
	public void setOprice(Integer oprice) {
		this.oprice = oprice;
	}

	
}
