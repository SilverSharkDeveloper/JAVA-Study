package music;

//부모 클래스 : Music 클래스
//맴버 : mode메소드 
class Music {
	void mode() {}
	
}
class Ballad extends Music{

	@Override
	void mode() {
		System.out.println("발라드 모드");
	}
	void onlyBallad () {
		System.out.println("onlyBallad");
	}
}
class HipHop extends Music{

	@Override
	void mode() {
		System.out.println("힙합 모드");
	}
	void onlyHipHop () {
		System.out.println("onlyHipHop");
	}
}
class Rock extends Music{

	@Override
	void mode() {
		System.out.println("락 모드");
	}
	void onlyRock () {
		System.out.println("onlyRock");
	}
}
public class CastingTask {
	public static void main(String[] args) {
		Music music1 = new HipHop();
		Music music2 = new Ballad();
		check(music1);
		check(music2);
		check(new Rock());
	}
	static void check(Music music) {
		music.mode();
		if(music instanceof Ballad) {
			Ballad b = (Ballad)music;
//			b.mode();
			b.onlyBallad();
		}else if (music instanceof HipHop) {
			HipHop h = (HipHop)music;
//			h.mode();
			h.onlyHipHop();
				
		}else if (music instanceof Rock) {
			Rock r = (Rock)music;
//			r.mode();
			r.onlyRock();
		}
	}
}
