package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask3 {
	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> list = makeList();
		Scanner sc = new Scanner(System.in);
		String msg = "정수를 입력하세요(1~20) >>";
		int tmp = 0, count = 0, idx = 0, flag = 0;

		List<String> viewList = new ArrayList<>();


		for (int i = 0; i < list.size(); i++) {
			viewList.add("?");
		}

		while (true) {
			System.out.println(viewList);
			System.out.println(msg);
			tmp = sc.nextInt();
			count++;
			if (list.contains(tmp)) {
				idx = list.indexOf(tmp);
				viewList.set(idx, tmp + "");

				System.out.println("맞췄습니다!!");
				flag++;
				list.set(idx, Integer.MAX_VALUE);
			} else {
				System.out.println("틀렸습니다!!");
			}
			if (flag == list.size()) {
				break;
			}
		}
		System.out.println("======================");
		System.out.println("축하합니다\n" + count + "번 시도하였습니다.");
	}

	public static List<Integer> makeList() {
		Random r = new Random();
		List<Integer> list = new ArrayList<>();

		int tmp = 0;

		for (int i = 0; i < 5; i++) {

			tmp = r.nextInt(20) + 1;

			if (!list.contains(tmp)) {
				list.add(tmp);
				continue;
			}
			i--;

		}
		Collections.sort(list);
		return list;
	}
}
