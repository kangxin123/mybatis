package com.bdqn.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.bdqn.bean.Team;
import com.bdqn.mapper.TeamMapper;
import com.bdqn.util.SessionUtil;

public class TestTeam {

	
	@Test
	public void m1() {
		SqlSession session = SessionUtil.getSession();
		// 获取mapper接口对应对象
		TeamMapper mapper = session.getMapper(TeamMapper.class);
		List<Team> list = mapper.selectAll();
		for (Team team : list) {
			System.out.println(team);
		}
		
		session.close();
	}
	
	
	@Test
	public void m2() {
		SqlSession session = SessionUtil.getSession();
		// 获取mapper接口对应对象
		TeamMapper mapper = session.getMapper(TeamMapper.class);
		Team team = new Team();
		team.setTeamId(5);
//		team.setTeamName("东莞3队");
		team.setTeamMoney(33500.0);
		mapper.insert(team);
		session.commit();
		session.close();
		// insert into team (team_id, team_money, ) values (?, ?, ) 
	}
	
	
	@Test
	public void m3() {
		SqlSession session = SessionUtil.getSession();
		// 获取mapper接口对应对象
		TeamMapper mapper = session.getMapper(TeamMapper.class);
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		List<Team> l = mapper.selectByIds(list);
		for (Team team : l) {
			System.out.println(team);
		}
		session.commit();
		session.close();
		// insert into team (team_id, team_money, ) values (?, ?, ) 
	}
	
	
	
	@Test
	public void m4() {
		SqlSession session = SessionUtil.getSession();
		// 获取mapper接口对应对象
		TeamMapper mapper = session.getMapper(TeamMapper.class);
		Team team = new Team();
		// 
//		team.setTeamId(1);
		// where and team_name like ?  多了and
		team.setTeamName("%东莞%");
		team.setTeamMoney(33500.00);
		List<Team> l = mapper.selecTive(team);
		for (Team team2 : l) {
			System.out.println(team2);
		}
		
		session.commit();
		session.close();
		// insert into team (team_id, team_money, ) values (?, ?, ) 
	}
	
	
	@Test
	public void m5() {
		SqlSession session = SessionUtil.getSession();
		// 获取mapper接口对应对象
		TeamMapper mapper = session.getMapper(TeamMapper.class);
		Team team = new Team();
		team  = null;
//		team.setTeamId(1);
//		team.setTeamName("东莞");
		List<Team> l = mapper.selecTive(team);
		for (Team team2 : l) {
			System.out.println(team2);
		}
		
		session.commit();
		session.close();
		// insert into team (team_id, team_money, ) values (?, ?, ) 
	}
	
	@Test
	public void m6() {
		SqlSession session = SessionUtil.getSession();
		// 获取mapper接口对应对象
		TeamMapper mapper = session.getMapper(TeamMapper.class);
		Team team = new Team();
		team.setTeamId(1);
		team.setTeamName("广州队");
		int row = mapper.update(team);
		session.commit();
		System.out.println(row + "===");
		session.close();
		// insert into team (team_id, team_money, ) values (?, ?, ) 
	}
	
	@Test
	public void m7() {
		SqlSession session = SessionUtil.getSession();
		// 获取mapper接口对应对象
		TeamMapper mapper = session.getMapper(TeamMapper.class);
		Team team = new Team();
		team.setTeamId(1);
		team.setTeamName("广州3队");
		team.setTeamMoney(3330.0);
		int row = mapper.update2(team);
		session.commit();
		System.out.println(row + "===");
		session.close();
		// insert into team (team_id, team_money, ) values (?, ?, ) 
	}
	
	@Test
	public void m8() {
		SqlSession session = SessionUtil.getSession();
		// 获取mapper接口对应对象
		TeamMapper mapper = session.getMapper(TeamMapper.class);
		Team t = mapper.selectByPrimaryKey(1);
		System.out.println(t);
		session.close();
	}
	
	@Test
	public void m9() {
		SqlSession session = SessionUtil.getSession();
		// 获取mapper接口对应对象
		TeamMapper mapper = session.getMapper(TeamMapper.class);
		Team t = mapper.selectByPrimaryKey2(1);
		System.out.println(t);
		session.close();
	}
}
