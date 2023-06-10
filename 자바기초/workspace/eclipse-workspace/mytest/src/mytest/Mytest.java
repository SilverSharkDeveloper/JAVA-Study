package mytest;

public class Mytest {
	public static void main(String[] args) {
		float a = 100000000000000000L; // 형변환 long의 데이터타입이 바이트가 더커서 더많은 수표현이 가능한데 4byte인 float으로 형변환이 가능.
		double b = 3;

		double c = 10, d = 4;
		String str = "one", str2 = "one";
		System.out.println(str == str2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(3 == 3.0);
		System.out.println(10 / 4);
		System.out.println((double) 10 / 4);
		System.out.println(c / d);

		switch (1) {
		case 1:
			System.out.println(1);
		case 2:
			System.out.println(2);
		default:
			System.out.println(3);

		}
		int l = 0, p = 10;
		while (l < 10 || p > 5) {
			System.out.println("나는 반복중" + l + p);
			++l;
			--p;
		}
		for (int i = 0; i <10; ++i) {
			for (int j = 0; j<10 ; ++j) {
					if(!(i==5 && j==5)) {
						continue;
					}
				System.out.println(i + "" + j);
				
				
				String[] family = {"엄마", "아빠","누나","나"};
				System.out.println(family[0]);
				int[] number = {0,1,2,3,4,5,6,7,8,9};
				System.out.println(number[5]);
				
				
				
				String members[] = {"최진혁", "최유빈","한이람"};
				for(int k = 0; k<members.length;++k) {
					System.out.println(members[k] + "학생 상담 했습니다.");
				}
					for(String t : members) {
						System.out.println(t+ "학생 상담 했습니다.");
					}
				}
			}
		}
	}
