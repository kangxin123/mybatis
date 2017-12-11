package com.bdqn.mapper;

import java.util.List;

import com.bdqn.bean.Blog;

public interface BlogMapper {

	List<Blog> selectByAuthorId(Integer authorId);
}
