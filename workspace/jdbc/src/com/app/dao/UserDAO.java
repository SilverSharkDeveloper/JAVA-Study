package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.vo.UserVO;

public class UserDAO {
	public Connection connection;
	public PreparedStatement preparedStatemnet;
	public ResultSet resultSet;
	static Long sessionUserId;
	//����� �߾���!
	static final int DROP_STATUS = 1;

	//Ż��� ȸ������ �ƴ���
	public boolean checkDroped(String userIdentification) {
		String query = "SELECT USER_STATUS FROM TBL_USER WHERE USER_IDENTIFICATION = ?";
		boolean check = false;
		connection = DBConnector.getConnection();
		try {
			preparedStatemnet = connection.prepareStatement(query);
			preparedStatemnet.setString(1, userIdentification);
			resultSet = preparedStatemnet.executeQuery();
			if(resultSet.next()) {
				if(resultSet.getInt(1)==DROP_STATUS) {
					check = true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();

				}
				if (preparedStatemnet != null) {
					preparedStatemnet.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return check;
		
	}
	
	
	// ���̵� �ߺ��˻� 
	// ���̵� Ż��ȸ���� Ż��� ȸ������ ��ȸ
	public boolean checkId(String userIdentification) {
		String query = "SELECT USER_ID FROM TBL_USER WHERE USER_IDENTIFICATION = ?";
		boolean check = false;
		
		
		
		connection = DBConnector.getConnection();
		try {
			preparedStatemnet = connection.prepareStatement(query);
			preparedStatemnet.setString(1, userIdentification);
			resultSet = preparedStatemnet.executeQuery();

			check = resultSet.next();

		} catch (SQLException e) {
			System.out.println("checkId(string) sql�� ����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();

				}
				if (preparedStatemnet != null) {
					preparedStatemnet.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return check;

	}

	// ȸ������
	public void insert(UserVO userVO) {
		  String query = "INSERT INTO TBL_USER (USER_ID, USER_IDENTIFICATION, USER_PASSWORD, USER_NAME, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, USER_RECOMMENDER_ID) "
		            + "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		connection = DBConnector.getConnection();
		try {
			preparedStatemnet = connection.prepareStatement(query);
			preparedStatemnet.setString(1, userVO.getUserIdentification());
			preparedStatemnet.setString(2, userVO.getUserPassword());
			preparedStatemnet.setString(3, userVO.getUserName());
			preparedStatemnet.setString(4, userVO.getUserPhone());
			preparedStatemnet.setString(5, userVO.getUserNickname());
			preparedStatemnet.setString(6, userVO.getUserEmail());
			preparedStatemnet.setString(7, userVO.getUserAddress());
			preparedStatemnet.setString(8, userVO.getUserBirth());
			preparedStatemnet.setString(9, userVO.getUserRecommenerId());

			preparedStatemnet.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (preparedStatemnet != null) {
					preparedStatemnet.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

	}

	// �α��� -> ���̵� �н����带 �޾� �˻������� �ִٸ� ���ǿ� user_id����
	//Ż��ȸ�� �Ͻ� �α��� ����
	public boolean login(UserVO userVO) {
		String query = "SELECT USER_ID FROM TBL_USER WHERE USER_IDENTIFICATION=? AND USER_PASSWORD=?";
		boolean check = false;
		connection = DBConnector.getConnection();

		try {
			preparedStatemnet = connection.prepareStatement(query);
			preparedStatemnet.setString(1, userVO.getUserIdentification());
			preparedStatemnet.setString(2, userVO.getUserPassword());
			resultSet = preparedStatemnet.executeQuery();
			
				if (resultSet.next()) {
					sessionUserId = resultSet.getLong(1);
					check = true;
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();

				}

				if (preparedStatemnet != null) {
					preparedStatemnet.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return check;
	}
	
	//ȸ��Ż��
	public void restore() {
		connection = DBConnector.getConnection();
		String query = "UPDATE TBL_USER SET USER_STATUS = ? WHERE USER_ID = ?";
		try {
			preparedStatemnet = connection.prepareStatement(query);
			preparedStatemnet.setInt(1, DROP_STATUS);
			preparedStatemnet.setLong(2, sessionUserId);
			
			preparedStatemnet.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatemnet != null) {
					preparedStatemnet.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		
		
		}
		
		
	}
//���̵�ã��
	
	public String findId(String phone) {
		connection = DBConnector.getConnection();
		String foundId = "";
		String query = "SELECT USER_IDENTIFICATION FROM TBL_USER WHERE USER_PHONE = ?";
		try {
			preparedStatemnet = connection.prepareStatement(query);
			preparedStatemnet.setString(1, phone);
			resultSet = preparedStatemnet.executeQuery();
			resultSet.next();
			foundId = resultSet.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();

				}
				if (preparedStatemnet != null) {
					preparedStatemnet.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return foundId;
	}

	//��й�ȣ ����  -> �α��� �� ���� ��й�ȣ, ���ο� ��й�ȣ 
	public void setNewPassword(String currentPassword, String newPassword) {
		
		connection = DBConnector.getConnection();
		String query = "UPDATE TBL_USER SET USER_PASSWORD = ? WHERE USER_ID = ? AND USER_PASSWORD = ?";
		try {
			preparedStatemnet = connection.prepareStatement(query);
			preparedStatemnet.setString(1, newPassword);
			preparedStatemnet.setLong(2, sessionUserId);
			preparedStatemnet.setString(3, currentPassword);
			preparedStatemnet.executeUpdate();
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if (preparedStatemnet != null) {
					preparedStatemnet.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		
		
		}
		
		
	
	}
	//ȸ������ ����(�г��� ����)
	public void changeNickName(UserVO userVO) {

		
		connection = DBConnector.getConnection();
		String query = "UPDATE TBL_USER SET USER_NICKNAME = ? WHERE USER_ID = ?";
		try {
			preparedStatemnet = connection.prepareStatement(query);
			preparedStatemnet.setString(1,userVO.getUserNickname() );
			preparedStatemnet.setLong(2, sessionUserId);
			preparedStatemnet.executeUpdate();
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if (preparedStatemnet != null) {
					preparedStatemnet.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		
		
		}
		
		
	
	
	}
	//ȸ������ ��ȸ
	public UserVO select() {
		UserVO userVO = new UserVO();
		String query = "SELECT USER_ID, USER_IDENTIFICATION, USER_PASSWORD, USER_NAME, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, USER_RECOMMENDER_ID, USER_STATUS "
				+ "FROM TBL_USER WHERE USER_ID = ?";
		connection = DBConnector.getConnection();
		try {
			preparedStatemnet  = connection.prepareStatement(query);
			preparedStatemnet.setLong(1, sessionUserId);
			resultSet = preparedStatemnet.executeQuery();
			resultSet.next();
			
			userVO.setUserId(resultSet.getLong(1));    
			userVO.setUserIdentification(resultSet.getString(2));    
			userVO.setUserPassword( resultSet.getString(3) );
			userVO.setUserName(resultSet.getString(4)); 
			userVO.setUserPhone( resultSet.getString(5));  
			userVO.setUserNickname(resultSet.getString(6));
			userVO.setUserEmail(resultSet.getString(7)); 
			userVO.setUserAddress(resultSet.getString(8) ); 
			userVO.setUserBirth(resultSet.getString(9));    
			userVO.setUserRecommenerId(resultSet.getString(10)); 
			userVO.setUserStatus(resultSet.getString(11));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();

				}
				if (preparedStatemnet != null) {
					preparedStatemnet.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return userVO;
//	
	}
	
	
	
	//��õ��1.�������� ��� �����Լ�
	
		public int getRecommendedCount(String userIdentification) {
			int count = 0;
			connection = DBConnector.getConnection();
			String query = "SELECT COUNT(USER_RECOMMENDER_ID) FROM TBL_USER GROUP BY USER_RECOMMENDER_ID "
					+ "HAVING USER_RECOMMENDER_ID = ?";
			try {
				preparedStatemnet = connection.prepareStatement(query);
				preparedStatemnet.setString(1,userIdentification );
				resultSet = preparedStatemnet.executeQuery();
			
				if(resultSet.next()) {
				count = resultSet.getInt(1);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (resultSet != null) {
						resultSet.close();

					}
					
					if (preparedStatemnet != null) {
						preparedStatemnet.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			
			
			}
			
			return count;
		
		
		
		
	
	}            
		//��õ�� 2 �హ�� ����
		
		public int getRecommendedCountByRows(String userIdentification) {

			int count = 0;
			connection = DBConnector.getConnection();
			String query = "SELECT USER_RECOMMENDER_ID FROM TBL_USER WHERE USER_RECOMMENDER_ID = ?";
			try {
				preparedStatemnet = connection.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				preparedStatemnet.setString(1,userIdentification);
				resultSet = preparedStatemnet.executeQuery();
				if(resultSet.last()) {
				count = resultSet.getRow();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (resultSet != null) {
						resultSet.close();

					}
					
					if (preparedStatemnet != null) {
						preparedStatemnet.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			
			
			}
			
			return count;
		
		
		
		
	
		}
		
		
		
		//���� ��õ�� ���
		public ArrayList<String> recommendedByMe() {
			ArrayList<String> recommendedByMe = new ArrayList<>();
			
			connection = DBConnector.getConnection();
			String query = "SELECT USER_IDENTIFICATION FROM TBL_USER WHERE USER_RECOMMENDER_ID = "
					+ "(SELECT USER_IDENTIFICATION FROM TBL_USER WHERE USER_ID = ? )";
			try {
				preparedStatemnet = connection.prepareStatement(query);
				preparedStatemnet.setLong(1,sessionUserId);
				resultSet = preparedStatemnet.executeQuery();
				
				while(resultSet.next()) {
					recommendedByMe.add(resultSet.getString(1));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (resultSet != null) {
						resultSet.close();

					}
					
					if (preparedStatemnet != null) {
						preparedStatemnet.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			
			
			}
			return recommendedByMe;
			
		
		
		
		
	
	
		
		}
		
		
		
		//���� ��õ�� ���
		public String recommenderMe() {
			String recommender = "";
			connection = DBConnector.getConnection();
			String query = "SELECT USER_RECOMMENDER_ID FROM TBL_USER WHERE USER_ID = ?";
			try {
				preparedStatemnet = connection.prepareStatement(query);
				preparedStatemnet.setLong(1,sessionUserId);
				resultSet = preparedStatemnet.executeQuery();
				resultSet.next();
				recommender = resultSet.getString(1);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (resultSet != null) {
						resultSet.close();

					}
					
					if (preparedStatemnet != null) {
						preparedStatemnet.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			
			
			}
			
			
			return recommender;
		
		
		
	
	
		}
	
	
}
