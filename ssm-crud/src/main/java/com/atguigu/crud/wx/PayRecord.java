package com.atguigu.crud.wx;

import java.util.Date;

public class PayRecord {

	private String phone;
	private long  serialId;
	private Byte type;
	private Date generateTime;
	private Float totalAmount;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public long getSerialId() {
		return serialId;
	}
	public void setSerialId(long serialId) {
		this.serialId = serialId;
	}
	public Byte getType() {
		return type;
	}
	public void setType(Byte type) {
		this.type = type;
	}
	public Date getGenerateTime() {
		return generateTime;
	}
	public void setGenerateTime(Date generateTime) {
		this.generateTime = generateTime;
	}
	public Float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}
}