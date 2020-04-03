package com.ssm.model;

public class Teacher {
	// 教师编号
	private String jsbh;
	// 教师名称
	private String jsmc;
	// 性别
	private Integer xb;
	// 电话
	private Integer dh;
	// 是否教学
	private Integer sfjx;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String jsbh, String jsmc, Integer xb, Integer dh, Integer sfjx) {
		super();
		this.jsbh = jsbh;
		this.jsmc = jsmc;
		this.xb = xb;
		this.dh = dh;
		this.sfjx = sfjx;
	}

	public String getJsbh() {
		return jsbh;
	}

	public void setJsbh(String jsbh) {
		this.jsbh = jsbh;
	}

	public String getJsmc() {
		return jsmc;
	}

	public void setJsmc(String jsmc) {
		this.jsmc = jsmc;
	}

	public Integer getXb() {
		return xb;
	}

	public void setXb(Integer xb) {
		this.xb = xb;
	}

	public Integer getDh() {
		return dh;
	}

	public void setDh(Integer dh) {
		this.dh = dh;
	}

	public Integer getSfjx() {
		return sfjx;
	}

	public void setSfjx(Integer sfjx) {
		this.sfjx = sfjx;
	}

	@Override
	public String toString() {
		return "Teacher [jsbh=" + jsbh + ", jsmc=" + jsmc + ", xb=" + xb + ", dh=" + dh + ", sfjx=" + sfjx + "]";
	}

}
