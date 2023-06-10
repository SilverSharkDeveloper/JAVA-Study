package lamp;

import java.time.LocalDateTime;
import java.util.StringJoiner;

public class TimerDeskLamp extends DeskLamp {

    final static int DELAY_MILLISECOND = 5000;

    private Thread offDelayThread; // 전원 끄기 예약 쓰레드
    
//    TimerDeskLamp 클래스의 나머지 코드를 구현해 주세요.
    
    
    
    private boolean offDelayButton;     //전원끄기 예약 상태 항상 false -> 버튼 누르면 true 5초 이후에 false로 초기화
    
    
    
    
    //전원 끄기 예약 기능
    public void offDelay() {
    	
    	if(super.getPower()) {  //파워가 켜져있는 상태에서만 기능 활성화
    		if(offDelayButton) {
    		offDelayThread.interrupt(); //이미 실행중이라면 예외 발생, interrupted 를 true로 변환
    		}
    	offDelayThread = new Thread(()-> {
    		offDelayButton = true;
    		try {
				Thread.sleep(DELAY_MILLISECOND);
				super.turnOff(); //5초가 성공적으로 지나면 전원끄기
				
			} catch (InterruptedException e) {
				System.out.println("타이머 리셋");
//				Thread.interrupted(); //다시 interupted를 false로 초기화
				
			}
    		offDelayButton = false;
			
    	});
    	offDelayThread.start();
    	}else { //파워가 꺼져있다면 전원 켜달라는 메세지
    		System.out.println("전원을 먼저 켜주세요");
    	}
    	
    }
    
}
