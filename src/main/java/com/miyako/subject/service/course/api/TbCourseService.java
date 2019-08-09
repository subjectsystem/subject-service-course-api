package com.miyako.subject.service.course.api;

import com.github.pagehelper.PageInfo;
import com.miyako.subject.commons.domain.TbCourse;

import java.util.List;

public interface TbCourseService{

    public List<TbCourse> selectAll();

    public TbCourse selectById(Integer id);

    public TbCourse selectOne(TbCourse tbCourse);

    public Integer insert(TbCourse tbCourse);

    public PageInfo<TbCourse> page(int pageNum, int pageSize);

    public int update(TbCourse tbCourse);

}
