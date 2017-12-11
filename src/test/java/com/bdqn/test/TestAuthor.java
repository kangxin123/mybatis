package com.bdqn.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.bdqn.bean.Author;
import com.bdqn.bean.People;
import com.bdqn.mapper.AuthorMapper;
import com.bdqn.mapper.PeopleMapper;
import com.bdqn.util.SessionUtil;

public class TestAuthor {

	
	@Test
	public void m1() {
		SqlSession session = SessionUtil.getSession();
		AuthorMapper am = session.getMapper(AuthorMapper.class);
		Author a = am.selectByAuthorId(1);
		System.out.println(a);
		session.close();
	}
	
	 
	@Test
	public void m2() {
		SqlSession session = SessionUtil.getSession();
		AuthorMapper am = session.getMapper(AuthorMapper.class);
		Author a = am.selectByAuthorIdByStep(1);
		System.out.println(a);
		session.close();
	}
	 
}
