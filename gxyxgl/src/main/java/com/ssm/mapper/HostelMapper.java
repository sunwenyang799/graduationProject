/*
 * @(#)UserDao.java 2019年9月23日下午4:27:32 SSMLearn Copyright 2019 Thuisoft, Inc.
 * All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package com.ssm.mapper;

import java.util.List;

import com.ssm.model.Hostel;

/**
 * UserDao
 * 
 * @author lenovo
 * @version 1.0
 *
 */
public interface HostelMapper {
	public List<Hostel> selectAll();

	public Hostel selectById(String id);

	public int addHostel(Hostel hostel);

	public int updateHostel(Hostel hostel);

	public int deleteHostel(Hostel hostel);
}
