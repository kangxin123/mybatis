package com.bdqn.mapper;

import java.util.List;

import com.bdqn.bean.Player;

public interface PlayerMapper {

	
	List<Player> selectByTeamId(Integer teamId);
}
