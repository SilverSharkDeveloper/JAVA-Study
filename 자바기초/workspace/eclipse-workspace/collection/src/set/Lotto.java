package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Lotto {
	public static void main(String[] args) {
		printLottoNum(5);
	}

	public static void printLottoNum(int num) {
		Random r = new Random();
		Set<Integer> lottonum = new HashSet<>();
		List<Integer> result = null;

		for (int i = 0; i < num; i++) {
			lottonum.clear();
			while (lottonum.size() < 7) {
				lottonum.add(r.nextInt(45) + 1);
			}
			result = new ArrayList<>(lottonum);
			Collections.sort(result);
			System.out.println(result);
		}

	}
}
