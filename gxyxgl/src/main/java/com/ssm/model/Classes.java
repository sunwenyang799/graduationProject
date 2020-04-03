package com.ssm.model;

public class Classes {

	// 班级编号
	private String bjbh;

	// 班级名称
	private String bjmc;

	// 专业编号
	private String zybh;

	// 学院编号
	private String xybh;

	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classes(String bjbh, String bjmc, String zybh, String xybh) {
		super();
		this.bjbh = bjbh;
		this.bjmc = bjmc;
		this.zybh = zybh;
		this.xybh = xybh;
	}

	public String getBjbh() {
		return bjbh;
	}

	public void setBjbh(String bjbh) {
		this.bjbh = bjbh;
	}

	public String getBjmc() {
		return bjmc;
	}

	public void setBjmc(String bjmc) {
		this.bjmc = bjmc;
	}

	public String getZybh() {
		return zybh;
	}

	public void setZybh(String zybh) {
		this.zybh = zybh;
	}

	public String getXybh() {
		return xybh;
	}

	public void setXybh(String xybh) {
		this.xybh = xybh;
	}

	@Override
	public String toString() {
		return "Class [bjbh=" + bjbh + ", bjmc=" + bjmc + ", zybh=" + zybh + ", xybh=" + xybh + "]";
	}

}
