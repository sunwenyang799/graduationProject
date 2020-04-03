package com.ssm.model;

public class College {

	// 学院编号
	private String xybh;

	// 学院名称
	private String xymc;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(String xybh, String xymc) {
		super();
		this.xybh = xybh;
		this.xymc = xymc;
	}

	public String getXybh() {
		return xybh;
	}

	public void setXybh(String xybh) {
		this.xybh = xybh;
	}

	public String getXymc() {
		return xymc;
	}

	public void setXymc(String xymc) {
		this.xymc = xymc;
	}

	@Override
	public String toString() {
		return "College [xybh=" + xybh + ", xymc=" + xymc + "]";
	}

}
