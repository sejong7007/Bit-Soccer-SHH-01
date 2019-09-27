package com.soccer.web.serviceimpls;

import java.util.List;

import com.soccer.web.daoimpls.PlayerDaoImpl;
import com.soccer.web.daos.PlayerDao;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.services.PlayerService;

public class PlayerServiceImpl implements PlayerService{

	private static PlayerServiceImpl instance = new PlayerServiceImpl();
	public static PlayerServiceImpl getInstance() {return instance;}
	private PlayerServiceImpl() {}


	
	@Override
	public PlayerBean login(PlayerBean param) {
		
		System.out.println("6.서비스 도착 : 아이디 : "+param.getPlayerId()+"비밀번호 : "+param.getSolar());
		
		return PlayerDaoImpl.getInstance().selectbyplayerIdsolar(param);
	}
	
	@Override
	public List<String> findPositions() {
		System.out.println("findPositions 도착");
		return PlayerDaoImpl.getInstance().selectPositions();
	}

	@Override
	public List<PlayerBean> findByTeamIdPosition(PlayerBean param) {
		List<PlayerBean> players = PlayerDaoImpl.getInstance().selectByTeamIdPositon(param);
		return players;
	}

	@Override
	public List<PlayerBean> findByHeightPlayerName(PlayerBean param) {
		List<PlayerBean> players = PlayerDaoImpl.getInstance().selectByHeightPlayerName(param);
		return players;
	}
}




