package interfaceTest;

public class Cat implements Animal,Hervibore{

	@Override
	public void sitDown() {
		System.out.println("싫어");
	}

	@Override
	public void showHands() {
		System.out.println("손은준다. 가끔");
	}

	@Override
	public void touchNose() {
		System.out.println("못알아 듣는다");
	}

	@Override
	public void waitNow() {
		System.out.println("그냥 안한다");
	}

	@Override
	public void poop() {
			System.out.println("알아서 할게");
	}

}
