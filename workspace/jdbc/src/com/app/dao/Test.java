package com.app.dao;

import com.app.vo.BoardDTO;
import com.app.vo.BoardVO;
import com.app.vo.UserVO;

public class Test {
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();	
		UserVO vo =new UserVO();
//		
//		BoardDAO boardDAO = new BoardDAO();
//		BoardVO boardVO = new BoardVO();
//		BoardDTO boardDTO = new BoardDTO();
//		boardVO.setBoardTitle("Ÿ��Ʋ");
//		boardVO.setBoardContent("������");
//		boardVO.setUserId(4l);
//		
//		boardDTO.setBoardId(1L);
//		boardDTO.setBoardContent("2���� ������");
//		boardDTO.setBoardTitle("�ι�° Ÿ��Ʋ");
////		boardDAO.addBoard(boardVO);
//		
//		System.out.println(boardDAO.getBoardInfo(2l));
//		System.out.println(boardDAO.getAllBoard());
////		boardDAO.updateBoard(boardDTO);
//		boardDAO.deleteBoard(boardDTO);
		
		
//		vo.setUserIdentification("bym1234");
//		vo.setUserPassword("bym1234");
//		vo.setUserAddress("sdf");
//		vo.setUserBirth("20000103");
//		vo.setUserEmail("hyg1234@naver.com");
//		vo.setUserName("������");
//		vo.setUserNickname("����");
//		vo.setUserPhone("01080128867");
//		vo.setUserRecommenerId("dmstkddlek12");

		vo.setUserIdentification("dmstkddlek12");
		vo.setUserPassword("hes1234");
		
	
		//��ȭ��ȣ�� ���̵� ã��
//		System.out.println(dao.findId("01080128867"));
		
		
		
		if(dao.login(vo)) {
//			//��й�ȣ ����
////			dao.setNewPassword("hes1234", "bym1234");
//
//			
//			//ȸ������ ����
//			//		vo.setUserNickname("����");
////			dao.changeNickName(vo);
//			
//			//ȸ������ ��ȸ
////			System.out.println(dao.select());
//			
//			//��õ�� ã��
//			System.out.println(dao.getRecommendedCount("dmstkddlek12"));
			System.out.println(dao.getRecommendedCountByRows("dmstkddlek12"));
//			
//			//���� ��õ�� ���
//			System.out.println(dao.recommenderMe());
//			
//			//���� ��õ�� �����
//			System.out.println(dao.recommendedByMe());
		}
		
	
	}
}
