package com.ssm.model;

public class Hostel {

	// 宿舍编号
	private String ssbh;

	// 宿舍名称
	private String ssmc;

	// 是否入住
	private Integer sfrz;

	public Hostel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hostel(String ssbh, String ssmc, Integer sfrz) {
		super();
		this.ssbh = ssbh;
		this.ssmc = ssmc;
		this.sfrz = sfrz;
	}

	public String getSsbh() {
		return ssbh;
	}

	public void setSsbh(String ssbh) {
		this.ssbh = ssbh;
	}

	public String getSsmc() {
		return ssmc;
	}

	public void setSsmc(String ssmc) {
		this.ssmc = ssmc;
	}

	public Integer getSfrz() {
		return sfrz;
	}

	public void setSfrz(Integer sfrz) {
		this.sfrz = sfrz;
	}

	@Override
	public String toString() {
		return "Hostel [ssbh=" + ssbh + ", ssmc=" + ssmc + ", sfrz=" + sfrz + "]";
	}

}
