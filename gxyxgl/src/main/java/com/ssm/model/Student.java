/*
 * @(#)User.java 2019年10月11日上午10:39:56 SSMLearn Copyright 2019 Thuisoft, Inc.
 * All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package com.ssm.model;

import java.util.Date;

/**
 * User
 * 
 * @author lenovo
 * @version 1.0
 *
 */
public class Student {
	// id
	private String id;

	// 学号
	private String xh;

	// 姓名
	private String xm;

	// 性别
	private Integer xb;

	// 出生日期
	private Date csrq;

	// 籍贯
	private String jg;

	// 家庭住址
	private Date jtzz;

	// 电话
	private Integer dh;

	// 入学年份
	private Integer rxnf;

	// 班级编号
	private String bjbh;

	// 专业编号
	private String zybh;

	// 学院编号
	private String xybh;

	// 宿舍编号
	private String ssbh;

	// 是否报到
	private Integer sfbd;

	public Student(String id, String xh, String xm, Integer xb, Date csrq, String jg, Date jtzz, Integer dh,
			Integer rxnf, String bjbh, String zybh, String xybh, String ssbh, Integer sfbd) {
		super();
		this.id = id;
		this.xh = xh;
		this.xm = xm;
		this.xb = xb;
		this.csrq = csrq;
		this.jg = jg;
		this.jtzz = jtzz;
		this.dh = dh;
		this.rxnf = rxnf;
		this.bjbh = bjbh;
		this.zybh = zybh;
		this.xybh = xybh;
		this.ssbh = ssbh;
		this.sfbd = sfbd;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getXh() {
		return xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public Integer getXb() {
		return xb;
	}

	public void setXb(Integer xb) {
		this.xb = xb;
	}

	public Date getCsrq() {
		return csrq;
	}

	public void setCsrq(Date csrq) {
		this.csrq = csrq;
	}

	public String getJg() {
		return jg;
	}

	public void setJg(String jg) {
		this.jg = jg;
	}

	public Date getJtzz() {
		return jtzz;
	}

	public void setJtzz(Date jtzz) {
		this.jtzz = jtzz;
	}

	public Integer getDh() {
		return dh;
	}

	public void setDh(Integer dh) {
		this.dh = dh;
	}

	public Integer getRxnf() {
		return rxnf;
	}

	public void setRxnf(Integer rxnf) {
		this.rxnf = rxnf;
	}

	public String getBjbh() {
		return bjbh;
	}

	public void setBjbh(String bjbh) {
		this.bjbh = bjbh;
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

	public String getSsbh() {
		return ssbh;
	}

	public void setSsbh(String ssbh) {
		this.ssbh = ssbh;
	}

	public Integer getSfbd() {
		return sfbd;
	}

	public void setSfbd(Integer sfbd) {
		this.sfbd = sfbd;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", xh=" + xh + ", xm=" + xm + ", xb=" + xb + ", csrq=" + csrq + ", jg=" + jg
				+ ", jtzz=" + jtzz + ", dh=" + dh + ", rxnf=" + rxnf + ", bjbh=" + bjbh + ", zybh=" + zybh + ", xybh="
				+ xybh + ", ssbh=" + ssbh + ", sfbd=" + sfbd + "]";
	}

}
