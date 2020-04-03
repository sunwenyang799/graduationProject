package com.ssm.model;

public class Specialities {

	// 专业编号
	private String zybh;
	// 专业名称
	private String zymc;
	// 学院编号
	private String xybh;

	public Specialities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specialities(String zybh, String zymc, String xybh) {
		super();
		this.zybh = zybh;
		this.zymc = zymc;
		this.xybh = xybh;
	}

	public String getZybh() {
		return zybh;
	}

	public void setZybh(String zybh) {
		this.zybh = zybh;
	}

	public String getZymc() {
		return zymc;
	}

	public void setZymc(String zymc) {
		this.zymc = zymc;
	}

	public String getXybh() {
		return xybh;
	}

	public void setXybh(String xybh) {
		this.xybh = xybh;
	}

	@Override
	public String toString() {
		return "Specialities [zybh=" + zybh + ", zymc=" + zymc + ", xybh=" + xybh + "]";
	}

}
