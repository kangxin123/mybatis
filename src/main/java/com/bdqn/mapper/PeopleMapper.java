package com.bdqn.mapper;

import com.bdqn.bean.People;

public interface PeopleMapper {

	
	People selectByPeopleId(String peopleId);
	
	People selectByPeopleId2(String peopleId);
}
