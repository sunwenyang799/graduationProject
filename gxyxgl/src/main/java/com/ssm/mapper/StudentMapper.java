/*
 * @(#)UserDao.java 2019年9月23日下午4:27:32 SSMLearn Copyright 2019 Thuisoft, Inc.
 * All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package com.ssm.mapper;

import java.util.List;

import com.ssm.model.Student;

/**
 * UserDao
 * @author lenovo
 * @version 1.0
 *
 */
public interface StudentMapper {
    public List<Student> selectAll();

    public Student selectById(String id);

    public Student login(Student student);

    public int addStudent(Student student);

    public int updateStudent(Student student);

    public int deleteStudent(Student student);
}
