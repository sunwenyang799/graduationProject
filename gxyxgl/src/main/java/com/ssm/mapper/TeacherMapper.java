/*
 * @(#)UserDao.java 2019年9月23日下午4:27:32 SSMLearn Copyright 2019 Thuisoft, Inc.
 * All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package com.ssm.mapper;

import java.util.List;

import com.ssm.model.Student;
import com.ssm.model.Teacher;
import com.ssm.model.User;

/**
 * UserDao
 * 
 * @author lenovo
 * @version 1.0
 *
 */
public interface TeacherMapper {
	public List<User> selectAll();

	public Teacher selectById(String id);

	public int addTeacher(Teacher teacher);

	public int updateTeacher(Teacher teacher);

	public int deleteTeacher(Teacher teacher);
}
