/*
 * @(#)UserDao.java 2019年9月23日下午4:27:32 SSMLearn Copyright 2019 Thuisoft, Inc.
 * All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package com.ssm.mapper;

import java.util.List;

import com.ssm.model.Classes;


/**
 * UserDao
 * @author lenovo
 * @version 1.0
 *
 */
public interface ClassesMapper {
    public List<Classes> selectAll();

    public Classes selectById(String id);

    public int addClasses(Classes classes);

    public int updateClasses(Classes classes);

    public int deleteClasses(Classes classes);
}
