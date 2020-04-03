/*
 * @(#)UserDao.java 2019年9月23日下午4:27:32 SSMLearn Copyright 2019 Thuisoft, Inc.
 * All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package com.ssm.mapper;

import java.util.List;

import com.ssm.model.College;

/**
 * UserDao
 * @author lenovo
 * @version 1.0
 *
 */
public interface CollegeMapper {
    public List<College> selectAll();

    public College selectById(String id);

    public int addCollege(College college);

    public int updateCollege(College college);

    public int deleteCollege(College college);
}
