package com.bdqn.mapper;

import com.bdqn.bean.Author;

public interface AuthorMapper {

	Author selectByAuthorId(Integer authorId);
	
	Author selectByAuthorIdByStep(Integer authorId);
}
