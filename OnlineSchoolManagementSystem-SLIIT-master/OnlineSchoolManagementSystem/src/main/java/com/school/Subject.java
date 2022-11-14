package com.school;

public class Subject {
	private String subID;
	private int TID;
	private String subName;
	private String desc;
	private int hrs;
	
	public Subject(String subID, int TID, String subName, String desc, int hrs) {
		this.subID = subID;
		this.subName = subName;
		this.desc = desc;
		this.hrs = hrs;
		this.TID = TID;
	}

	public int getTID() {
		return TID;
	}

	public String getSubID() {
		return subID;
	}

	public String getSubName() {
		return subName;
	}

	public String getDesc() {
		return desc;
	}

	public int getHrs() {
		return hrs;
	}

}
