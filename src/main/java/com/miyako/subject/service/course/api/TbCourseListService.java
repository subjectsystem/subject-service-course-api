package com.miyako.subject.service.course.api;

import com.miyako.subject.commons.domain.TbCourselist;

import java.util.List;

public interface TbCourseListService{

    public Integer insert(TbCourselist courselist);

    public TbCourselist selectOne(TbCourselist courselist);

    public Integer selectCount(TbCourselist courselist);

    public List<TbCourselist> selectList(TbCourselist courselist);
}
