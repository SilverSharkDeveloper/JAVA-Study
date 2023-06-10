package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.vo.BoardDTO;
import com.app.vo.BoardVO;

public class BoardDAO {
	public Connection conn;
	public PreparedStatement ptsm;
	public ResultSet rs;
	
	
	//�Խñ� �߰�
	public void addBoard(BoardVO boardVO) {
		conn = DBConnector.getConnection();
		String query = "INSERT INTO TBL_BOARD (BOARD_ID, BOARD_TITLE, BOARD_CONTENT, BOARD_REGISTER_DATE, BOARD_UPDATE_DATE, USER_ID) "
				+ "VALUES(SEQ_BOARD.NEXTVAL, ?, ?, SYSDATE, SYSDATE, ?)";
		try {
			ptsm = conn.prepareStatement(query);
			ptsm.setString(1,boardVO.getBoardTitle());
			ptsm.setString(2, boardVO.getBoardContent());
			ptsm.setLong(3, UserDAO.sessionUserId);
			ptsm.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insert����");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();

				}
				if (ptsm != null) {
					ptsm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
	}
	
	
	
	
	//�Խñ� ��ȸ �󼼺�
	
	public BoardDTO getBoardInfo(Long boardId) {
		BoardDTO boardDTO = null;
		conn = DBConnector.getConnection();
		String query = "SELECT BOARD_ID, BOARD_TITLE, BOARD_CONTENT, BOARD_REGISTER_DATE, BOARD_UPDATE_DATE,"
				+ "TU.* "
				+ " FROM TBL_BOARD TB JOIN TBL_USER TU ON TB.USER_ID = TU.USER_ID AND TB.BOARD_ID =?";
		try {
			ptsm = conn.prepareStatement(query);
			ptsm.setLong(1,boardId);
			rs = ptsm.executeQuery();
			if(rs.next()) {
			boardDTO = new BoardDTO();
			boardDTO.setBoardId(rs.getLong(1));
			boardDTO.setBoardTitle(rs.getString(2));
			boardDTO.setBoardContent(rs.getString(3));
			boardDTO.setBoardRegisterDate(rs.getDate(4) +"");
			boardDTO.setBoardUpdateDate(rs.getDate(5) + "");
			boardDTO.setUserId(rs.getLong(6));
			boardDTO.setUserIdentification(rs.getString(7));
			boardDTO.setUserPassword(rs.getString(8));
			boardDTO.setUserName(rs.getString(9));
			boardDTO.setUserPhone(rs.getString(10));
			boardDTO.setUserNickname(rs.getString(11));
			boardDTO.setUserEmail(rs.getString(12));
			boardDTO.setUserAddress(rs.getString(13));
			boardDTO.setUserBirth(rs.getString(14));
			boardDTO.setUserRecommenerId(rs.getString(15));
			}
			
			
		} catch (SQLException e) {
			System.out.println("insert����");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();

				}
				if (ptsm != null) {
					ptsm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
		return boardDTO;
	}
	
	//�Խñ� ��� ��ü���
	public List<BoardDTO> getAllBoard(){
		List<BoardDTO> allBoard = new ArrayList<>();
		BoardDTO boardDTO = null;
		conn = DBConnector.getConnection();
		String query ="SELECT * FROM TBL_BOARD JOIN TBL_USER USING(USER_ID)" ;
		try {
			ptsm = conn.prepareStatement(query);
			rs = ptsm.executeQuery();
			while(rs.next()) {
				boardDTO = new BoardDTO();
				boardDTO.setUserId(rs.getLong(1));
				boardDTO.setBoardId(rs.getLong(2));
				boardDTO.setBoardTitle(rs.getString(3));
				boardDTO.setBoardContent(rs.getString(4));
				boardDTO.setBoardRegisterDate(rs.getDate(5) +"");
				boardDTO.setBoardUpdateDate(rs.getDate(6) + "");
				boardDTO.setUserIdentification(rs.getString(7));
				boardDTO.setUserPassword(rs.getString(8));
				boardDTO.setUserName(rs.getString(9));
				boardDTO.setUserPhone(rs.getString(10));
				boardDTO.setUserNickname(rs.getString(11));
				boardDTO.setUserEmail(rs.getString(12));
				boardDTO.setUserAddress(rs.getString(13));
				boardDTO.setUserBirth(rs.getString(14));
				boardDTO.setUserRecommenerId(rs.getString(15));
				allBoard.add(boardDTO);
			}
		} catch (SQLException e) {
			System.out.println("select ����");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			
				try {
					if (rs != null) {
						rs.close();

					}
					if (ptsm != null) {
						ptsm.close();
					}
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					
					throw new RuntimeException();
				}
		
		}
		return allBoard;
	
	}
	
	//�Խñ� ����
	public void updateBoard(BoardDTO boardDTO) {

		conn = DBConnector.getConnection();
		String query = "UPDATE TBL_BOARD SET BOARD_TITLE = ? ,BOARD_CONTENT = ? , BOARD_UPDATE_DATE = SYSDATE "
				+ "WHERE BOARD_ID = ?";
		try {
			ptsm = conn.prepareStatement(query);
			ptsm.setString(1,boardDTO.getBoardTitle());
			ptsm.setString(2,boardDTO.getBoardContent());
			ptsm.setLong(3, boardDTO.getBoardId());
			ptsm.executeUpdate();
		} catch (SQLException e) {
			System.out.println("update����");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();

				}
				if (ptsm != null) {
					ptsm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
	
	}
	//�Խñ� ����
		public void deleteBoard(BoardDTO boardDTO) {

			conn = DBConnector.getConnection();
			String query = "DELETE FROM TBL_BOARD WHERE BOARD_ID = ?";
			try {
				ptsm = conn.prepareStatement(query);
				ptsm.setLong(1,boardDTO.getBoardId());
				ptsm.executeUpdate();
			} catch (SQLException e) {
				System.out.println("delete����");
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null) {
						rs.close();

					}
					if (ptsm != null) {
						ptsm.close();
					}
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			}
			
		
		
		}
	
}
