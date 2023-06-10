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
//		boardVO.setBoardTitle("타이틀");
//		boardVO.setBoardContent("컨텐츠");
//		boardVO.setUserId(4l);
//		
//		boardDTO.setBoardId(1L);
//		boardDTO.setBoardContent("2번쨰 컨텐츠");
//		boardDTO.setBoardTitle("두번째 타이틀");
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
//		vo.setUserName("박유미");
//		vo.setUserNickname("윰미");
//		vo.setUserPhone("01080128867");
//		vo.setUserRecommenerId("dmstkddlek12");

		vo.setUserIdentification("dmstkddlek12");
		vo.setUserPassword("hes1234");
		
	
		//전화번호로 아이디 찾기
//		System.out.println(dao.findId("01080128867"));
		
		
		
		if(dao.login(vo)) {
//			//비밀번호 변경
////			dao.setNewPassword("hes1234", "bym1234");
//
//			
//			//회원정보 수정
//			//		vo.setUserNickname("윰미");
////			dao.changeNickName(vo);
//			
//			//회원정보 조회
////			System.out.println(dao.select());
//			
//			//추천수 찾기
//			System.out.println(dao.getRecommendedCount("dmstkddlek12"));
			System.out.println(dao.getRecommendedCountByRows("dmstkddlek12"));
//			
//			//나를 추천한 사람
//			System.out.println(dao.recommenderMe());
//			
//			//내가 추천한 사람들
//			System.out.println(dao.recommendedByMe());
		}
		
	
	}
}
