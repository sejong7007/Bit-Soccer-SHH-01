package com.soccer.web.daoimpls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.soccer.web.daos.PlayerDao;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.factory.DatabaseFactory;
import com.soccer.web.pool.Constants;

public class PlayerDaoImpl implements PlayerDao {

	private static PlayerDaoImpl instance = new PlayerDaoImpl();
	public static PlayerDaoImpl getInstance() {return instance;}
	private PlayerDaoImpl() {}
	
	@Override
	public PlayerBean selectbyplayerIdsolar(PlayerBean param) {
		PlayerBean player = null;
		String test ="1";
		System.out.println("Dao method 입장"+ test);
					
		
		String sql = "SELECT * \n" + 
				"FROM PLAYER \n" + 
				"WHERE PLAYER_ID LIKE ? \n" + 
				"    AND SOLAR LIKE ?";
		try {
			System.out.println("ID : "+param.getPlayerId() + "PW : "+param.getSolar());
			PreparedStatement stmt = DatabaseFactory
									.createDatabase(Constants.VENDOR)
									.getConnection()
									.prepareStatement(sql);
			stmt.setString(1, param.getPlayerId());
			stmt.setString(2, param.getSolar());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				
				player = new PlayerBean();

				player.setPlayerId(rs.getString("PLAYER_ID"));
				player.setPlayerName(rs.getString("PLAYER_NAME"));
				player.setTeamId(rs.getString("TEAM_ID"));
				player.setEPlayerName(rs.getString("E_PLAYER_NAME"));
				player.setNickname(rs.getString("NICKNAME"));
				player.setJoinYyyy(rs.getString("JOIN_YYYY"));
				player.setPosition(rs.getString("POSITION"));
				player.setBackNo(rs.getString("BACK_NO"));
				player.setNation(rs.getString("NATION"));
				player.setBirthDate(rs.getString("BIRTH_DATE"));
				player.setSolar(rs.getString("SOLAR"));
				player.setHeight(rs.getString("HEIGHT"));
				player.setWeight(rs.getString("WEIGHT"));
							
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return player;
	}

	@Override
	public List<String> selectPositions() {
		List<String> positions = new ArrayList<>();
		
		try {
			String sql = "SELECT DISTINCT POSITION position \n" + 
					"FROM PLAYER";
			
			ResultSet rs = DatabaseFactory
							.createDatabase(Constants.VENDOR)
							.getConnection()
							.prepareStatement(sql)
							.executeQuery();
			while(rs.next()) {
				positions.add(rs.getString("position"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return positions;
	}

	@Override
	public List<PlayerBean> selectByTeamIdPositon(PlayerBean param) {
		List<PlayerBean> list = new ArrayList<PlayerBean>();
		return list;
	}

	@Override
	public List<PlayerBean> selectByHeightPlayerName(PlayerBean param) {
		List<PlayerBean> list = new ArrayList<PlayerBean>();
		return list;
	}
	@Override
	public List<PlayerBean> selectByMany(PlayerBean param) {
		List<PlayerBean> list = new ArrayList<PlayerBean>();
		String sql = "";
		try {
			PreparedStatement stmts = DatabaseFactory
									.createDatabase(Constants.VENDOR)
									.getConnection()
									.prepareStatement(sql);
			stmts.setString(1, param.getPlayerId());
			stmts.setString(2, param.getNation());
			ResultSet rs = stmts.executeQuery();
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
