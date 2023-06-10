package lamp;

import java.time.LocalDateTime;
import java.util.StringJoiner;

public class TimerDeskLamp extends DeskLamp {

    final static int DELAY_MILLISECOND = 5000;

    private Thread offDelayThread; // ���� ���� ���� ������
    
//    TimerDeskLamp Ŭ������ ������ �ڵ带 ������ �ּ���.
    
    
    
    private boolean offDelayButton;     //�������� ���� ���� �׻� false -> ��ư ������ true 5�� ���Ŀ� false�� �ʱ�ȭ
    
    
    
    
    //���� ���� ���� ���
    public void offDelay() {
    	
    	if(super.getPower()) {  //�Ŀ��� �����ִ� ���¿����� ��� Ȱ��ȭ
    		if(offDelayButton) {
    		offDelayThread.interrupt(); //�̹� �������̶�� ���� �߻�, interrupted �� true�� ��ȯ
    		}
    	offDelayThread = new Thread(()-> {
    		offDelayButton = true;
    		try {
				Thread.sleep(DELAY_MILLISECOND);
				super.turnOff(); //5�ʰ� ���������� ������ ��������
				
			} catch (InterruptedException e) {
				System.out.println("Ÿ�̸� ����");
//				Thread.interrupted(); //�ٽ� interupted�� false�� �ʱ�ȭ
				
			}
    		offDelayButton = false;
			
    	});
    	offDelayThread.start();
    	}else { //�Ŀ��� �����ִٸ� ���� �Ѵ޶�� �޼���
    		System.out.println("������ ���� ���ּ���");
    	}
    	
    }
    
}