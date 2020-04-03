/*
 * @(#)UserDao.java 2019年9月23日下午4:27:32 SSMLearn Copyright 2019 Thuisoft, Inc.
 * All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package com.ssm.mapper;

import java.util.List;

import com.ssm.model.Specialities;

/**
 * UserDao
 * @author lenovo
 * @version 1.0
 *
 */
public interface SpecialitiesMapper {
    public List<Specialities> selectAll();

    public Specialities selectById(String id);

    public int addSpecialities(Specialities specialities);

    public int updateSpecialities(Specialities specialities);

    public int deleteSpecialities(Specialities specialities);
}
